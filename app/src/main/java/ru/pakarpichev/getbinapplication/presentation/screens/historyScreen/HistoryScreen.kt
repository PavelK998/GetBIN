package ru.pakarpichev.getbinapplication.presentation.screens.historyScreen

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
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
import ru.pakarpichev.getbinapplication.presentation.navigation.Screens
import ru.pakarpichev.getbinapplication.presentation.ui.HistoryItem
import ru.pakarpichev.getbinapplication.ui.theme.Brown


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")

@Composable
fun HistoryScreen(navController: NavController) {
    // Инициализируем viewModel
    val viewModel = hiltViewModel<HistoryViewModel>()


    var request = viewModel.request.observeAsState(listOf()).value

    // Переменная сохраняющая состояние для DropdownMenu
    var expanded by remember {
        mutableStateOf(false)
    }
    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = Brown,
                contentColor = Color.White) {
                    IconButton(
                        onClick = { navController.popBackStack() }) {
                        Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "ArrowBack")
                    }
                    Text(
                        text = "Request history",
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
                            Text(text = "Clear All",
                                fontSize = 17.sp,
                                modifier = Modifier
                                    .padding(5.dp)
                                    .clickable {
                                        expanded = false
                                        viewModel.deleteAllData()
                                    })
                        }
                    }
                }
            }
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ){
            LazyColumn(
                modifier = Modifier.fillMaxSize()
            ) {
                itemsIndexed(
                    request
                ) { _, request ->
                    HistoryItem(request, navController = navController)
                }
            }
        }
    }
}
