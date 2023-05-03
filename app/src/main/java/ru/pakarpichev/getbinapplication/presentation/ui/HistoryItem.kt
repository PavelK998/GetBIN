package ru.pakarpichev.getbinapplication.presentation.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import ru.pakarpichev.getbinapplication.domain.model.UserRequestModel
import ru.pakarpichev.getbinapplication.presentation.navigation.Screens
import ru.pakarpichev.getbinapplication.presentation.screens.historyScreen.HistoryViewModel

// Задает вид отображения элемента в окне истории запросов

@Composable
fun HistoryItem(
    request: UserRequestModel,
    navController:NavController) {
    val viewModel= hiltViewModel<HistoryViewModel>()
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
            .clickable {
                navController.navigate(
                Screens.ResultScreen.route + "/${request.userRequest}")
                       },
        shape = RoundedCornerShape(5.dp),
        elevation = 3.dp

    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(modifier = Modifier.fillMaxWidth(0.9f)) {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                    ) {
                        Text(fontWeight = FontWeight.Bold,
                            fontSize = 18.sp,
                            text = "Request:")
                        Text(
                            modifier = Modifier.padding(top = 7.dp),
                            fontSize = 15.sp,
                            text = request.userRequest)

                    }


                }

                Box(
                    modifier = Modifier
                        .width(35.dp)
                        .height(35.dp)
                        .padding(5.dp)
                        .clip(RoundedCornerShape(4.dp))
                        .clickable {
                        viewModel.deleteData(request = request)

                        },
                    contentAlignment = Alignment.Center
                    //.background(Color.White)
                ){
                    Icon(
                        imageVector = Icons.Default.Delete, contentDescription ="Delete",
                        tint = Color.Black
                    )
                }
            }

        }
    }
}