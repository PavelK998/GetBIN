package ru.pakarpichev.getbinapplication.presentation.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import ru.pakarpichev.getbinapplication.presentation.navigation.Screens
import ru.pakarpichev.getbinapplication.presentation.screens.resultScreen.ResultViewModel
import ru.pakarpichev.getbinapplication.ui.theme.GetBINApplicationTheme

// Задает вид отображения элемента в окне результата
@Composable
fun RequestItem(navController: NavController) {
    val mContext = LocalContext.current
    val viewModel = hiltViewModel<ResultViewModel>()
    val getModel = viewModel.data.observeAsState().value
    val prepaid = if (getModel?.prepaid == "true") "Yes" else "No"


    Column(
        modifier = Modifier.fillMaxSize(),

        ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 40.dp, start = 5.dp, end = 5.dp),

            ) {
            Row() {
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .padding(start = 15.dp)
                ) {
                    Column(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = "SCHEME / NETWORK",
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = getModel?.scheme ?: "No info",
                            modifier = Modifier.padding(top = 7.dp)
                        )
                        Text(
                            text = "BRAND",
                            modifier = Modifier.padding(top = 12.dp),
                            fontWeight = FontWeight.Bold

                        )
                        Text(
                            text = getModel?.brand ?: "No info",
                            modifier = Modifier.padding(top = 7.dp)
                        )
                        Text(
                            text = "CARD NUMBER",
                            modifier = Modifier.padding(top = 12.dp),
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "Length:",
                            modifier = Modifier.padding(top = 7.dp)
                        )
                        Text(
                            text = getModel?.number?.length ?: "No info",
                            modifier = Modifier.padding(top = 7.dp)
                        )
                        Text(
                            text = "LUHN",
                            modifier = Modifier.padding(top = 7.dp),
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = getModel?.number?.luhn ?: "No info",
                            modifier = Modifier.padding(top = 7.dp)
                        )


                    }


                }
                Box(modifier = Modifier.fillMaxWidth()) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 15.dp)
                    )
                    {
                        Text(
                            text = "TYPE",
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = getModel?.type ?: "No info",
                            modifier = Modifier.padding(top = 7.dp)
                        )
                        Text(
                            text = "PREPAID",
                            modifier = Modifier.padding(top = 12.dp),
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = prepaid,
                            modifier = Modifier.padding(top = 7.dp)
                        )
                        Text(
                            text = "BANK",
                            modifier = Modifier.padding(top = 12.dp),
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = getModel?.bank?.name ?: "No info",
                            modifier = Modifier.padding(top = 3.dp)

                        )
                        Text(
                            text = getModel?.bank?.city ?: "",
                            modifier = Modifier.padding(top = 3.dp)
                        )
                        Text(
                            text = getModel?.bank?.url ?: "",
                            modifier = Modifier
                                .padding(top = 7.dp)
                                .clickable {
                                    if (getModel?.bank?.url != null) {
                                        viewModel.urlView(
                                            mContext,
                                            getModel?.bank?.url ?: ""
                                        )
                                    }

                                },
                            textDecoration = TextDecoration.Underline,
                            color = Color.Blue
                        )
                        Text(
                            text = getModel?.bank?.phone ?: "",
                            modifier = Modifier
                                .padding(top = 7.dp)
                                .clickable {
                                    viewModel.phoneCall(
                                        mContext,
                                        getModel?.bank?.phone ?: ""
                                    )
                                },
                            textDecoration = TextDecoration.Underline,
                            color = Color.Blue
                        )
                        Text(
                            text = "COUNTRY",
                            modifier = Modifier.padding(top = 12.dp),
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = getModel?.country?.name ?: "No info",
                            modifier = Modifier
                                .padding(top = 7.dp)
                                .clickable {
                                    viewModel.mapsView(
                                        mContext,
                                        getModel?.country?.latitude ?: "",
                                        getModel?.country?.longitude ?: ""
                                    )
                                },
                            textDecoration = TextDecoration.Underline,

                        )
                        Text(
                            text = "Latitude: ${getModel?.country?.latitude ?: "No info"}",
                            modifier = Modifier.padding(top = 7.dp)
                        )
                        Text(
                            text = "Longitude: ${getModel?.country?.longitude ?: "No info"}",
                            modifier = Modifier.padding(top = 7.dp)
                        )
                    }
                }
            }
        }
    }
}

