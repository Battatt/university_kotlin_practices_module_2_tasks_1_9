package com.example.module2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.module2.tasks.Hello
import com.example.module2.tasks.Task4ButtonScreen
import com.example.module2.tasks.Task5
import com.example.module2.tasks.Task6First
import com.example.module2.tasks.Task6Second
import com.example.module2.tasks.Task7
import com.example.module2.tasks.WaterTracker
import com.example.module2.ui.theme.Module2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Module2Theme {
//                Hello(
//                    name = null,
//                )

//                Task4ButtonScreen()

//                Task5()

//                Task6Second()

//                Task7()

                WaterTracker()
            }
        }
    }
}
