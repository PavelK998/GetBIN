package ru.pakarpichev.getbinapplication.presentation.screens.resultScreen

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import ru.pakarpichev.getbinapplication.R
import ru.pakarpichev.getbinapplication.presentation.navigation.Screens
import ru.pakarpichev.getbinapplication.presentation.ui.RequestItem
import ru.pakarpichev.getbinapplication.ui.theme.Brown


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ResultScreen(
    navController: NavController,
                 userText:String?) {
    val viewModel = hiltViewModel<ResultViewModel>()
    val getData = viewModel.data.observeAsState().value
    val tryCatchResult = remember {
        viewModel.tryCatchResult
    }
    viewModel.getData(userText = userText!!)
    var expanded by remember {
        mutableStateOf(false)
    }

    Scaffold (
        topBar = {
            TopAppBar (
                backgroundColor = Brown,
                contentColor = Color.White
            ){
                IconButton(
                    onClick = { navController.popBackStack() }) {
                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "ArrowBack")

                }

                Text(
                    text = "Result",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 10.dp)
                )
                Spacer(modifier = Modifier.weight(1f, true))
                Box() {
                    IconButton(
                        onClick = { expanded = true }) {
                        Icon(imageVector = Icons.Filled.Menu, contentDescription = "ArrowBack")
                    }
                    DropdownMenu(
                        expanded = expanded,
                        onDismissRequest = { expanded = false })
                    {
                        Text(text = "Request history",
                            fontSize = 17.sp,
                            modifier = Modifier
                                .padding(5.dp)
                                .clickable {
                                    expanded = false
                                    navController.navigate(Screens.HistoryScreen.route)
                                })
                    }
                }
            }
        }
            ){

        if (tryCatchResult.value == ""){
            load()
        } else if (getData != null && tryCatchResult.value == "0"){
            RequestItem(navController = navController)
        } else if (tryCatchResult.value == "1"){
            error()
        }

    }
    Log.d("logM", "result: ${tryCatchResult.value}")
}



// Отображается при условии, что данные с сервера не были получены
@Composable
fun error () {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            text = "We can not retrieve any data by your request",
            modifier = Modifier.padding(10.dp),
            textAlign = TextAlign.Center

        )

    }
}

// Отображается круговой индикатор загрузки,
// используем в момент пока данные с сервера в стадии получения
@Composable
fun load () {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CircularProgressIndicator()
    }
}




