package ru.pakarpichev.getbinapplication.presentation.screens

import android.annotation.SuppressLint
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import ru.pakarpichev.getbinapplication.R
import ru.pakarpichev.getbinapplication.domain.model.UserRequestModel
import ru.pakarpichev.getbinapplication.presentation.navigation.Screens
import ru.pakarpichev.getbinapplication.presentation.screens.resultScreen.ResultViewModel
import ru.pakarpichev.getbinapplication.presentation.screens.startScreen.StartViewModel
import ru.pakarpichev.getbinapplication.ui.theme.Brown
import ru.pakarpichev.getbinapplication.ui.theme.GetBINApplicationTheme


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun StartScreen(navController: NavController) {
    var userText by rememberSaveable { mutableStateOf("") }
    val viewModel = hiltViewModel<StartViewModel>()
    val maxLenghtInput = 8
    val mContext = LocalContext.current
    var expanded by remember {
        mutableStateOf(false)
    }

    Scaffold(modifier = Modifier.fillMaxSize(),
    topBar = {
        TopAppBar (
            backgroundColor = Brown,
            contentColor = Color.White
        ){
            Box() {
                IconButton(onClick = {
                    expanded = true
                }) {
                    Icon(imageVector = Icons.Filled.Menu, contentDescription = "Menu")
                }
                DropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false }
                ) {
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
    ) {


        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
           OutlinedTextField(

                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
                value = userText,
                singleLine = true,
                onValueChange = {
                    if (it.length <= maxLenghtInput) userText = it
                    else Toast.makeText(
                        mContext,
                        "Cannot be more than 8 characters",
                        Toast.LENGTH_SHORT
                    ).show()
                },
                label = { Text(text = "Write BIN here") },
                modifier = Modifier.padding(top = 10.dp)
                )

            Button(
                modifier = Modifier
                    .width(100.dp)
                    .padding(top = 20.dp)
                    .padding(vertical = 8.dp),
                onClick = {
                    if (viewModel.isOnline(mContext)) {
                        if (userText != "") {
                            viewModel.insertData(request = UserRequestModel(id = 0, userText))
                            navController.navigate(Screens.ResultScreen.route + "/${userText}")
                        } else Toast.makeText(
                            mContext,
                            "Please write something",
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    } else Toast.makeText(
                        mContext,
                        "You are not connected to Internet",
                        Toast.LENGTH_SHORT
                    )
                        .show()


                },
                colors = ButtonDefaults.buttonColors(Brown)
            ) {
                Text(text = "Get BIN",
                color = Color.White)
            }


        }

    }
}





