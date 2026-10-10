package com.example.module2.tasks

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.module2.R


data class User(
    val name: String,
    val lastname: String,
    val patronymic: String,
    val phoneNumber: String,
    val address: String,
)


private val USERS_DATA = listOf<User>(
    User(
        name = "Евгений", lastname = "Лукашин", patronymic = "Андреевич",
        phoneNumber = "+7 495 495 95 95", address = ".г Москва, 3-я улица Строителей, д. 25, кв. 12"
    ),
    User(
        name = "Василий", lastname = "Егорович", patronymic = "Кузякин",
        phoneNumber = "-", address = "Ивановская область, дер. Крутово, д.4"
    ),
    User(
        name = "Людмила",
        lastname = "Прокофьевна",
        patronymic = "Калугина",
        phoneNumber = "+7 495 788 78 78",
        address = ".г Москва, улица Большая Никитская, д. 43, кв. 290"
    ),
)

@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
fun Task7(
    modifier: Modifier = Modifier,
    usersData: List<User> = USERS_DATA,
) {
    val permanentUser = usersData[0]

    LazyColumn(
        modifier = modifier.fillMaxSize(),
    ) {
        item {
            // Type 1
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Имя: ${permanentUser.name}"
                )
                Text(
                    text = "Отчество: ${permanentUser.patronymic}"
                )
                Text(
                    text = "Фамилия: ${permanentUser.lastname}"
                )
                Text(
                    text = "Мобильный телефон: ${permanentUser.phoneNumber}"
                )
                Text(
                    text = "Адрес: ${permanentUser.address}"
                )
            }
        }

        for (user in usersData) {
            item {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .background(Color.LightGray)
                        .padding(8.dp),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(
                        text = "Имя: ${user.name}",
                        textAlign = TextAlign.Center,
                    )
                    Text(
                        text = "Отчество: ${user.patronymic}",
                        textAlign = TextAlign.Center,
                    )
                    Text(
                        text = "Фамилия: ${user.lastname}",
                        textAlign = TextAlign.Center,
                    )
                    Text(
                        text = "Мобильный телефон: ${user.phoneNumber}",
                        textAlign = TextAlign.Center,
                    )
                    Text(
                        text = "Адрес: ${user.address}",
                        textAlign = TextAlign.Center,
                    )
                }
            }
        }

        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .background(Color.LightGray),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                Column(
                    modifier = Modifier
                        .padding(8.dp)
                        .weight(5f),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(
                        text = "Имя: ${permanentUser.name}",
                        textAlign = TextAlign.Center,
                    )
                    Text(
                        text = "Отчество: ${permanentUser.patronymic}",
                        textAlign = TextAlign.Center,
                    )
                    Text(
                        text = "Фамилия: ${permanentUser.lastname}",
                        textAlign = TextAlign.Center,
                    )
                    Text(
                        text = "Мобильный телефон: ${permanentUser.phoneNumber}",
                        textAlign = TextAlign.Center,
                    )
                    Text(
                        text = "Адрес: ${permanentUser.address}",
                        textAlign = TextAlign.Center,
                    )
                }

                Image(
                    modifier = Modifier.weight(1f),
                    painter = painterResource(R.drawable.circle),
                    contentDescription = "Circle"
                )
            }
        }
    }
}

