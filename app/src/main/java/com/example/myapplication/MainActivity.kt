package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.myapplication.sceen.QuestionVivemodel
import com.example.myapplication.ui.theme.MyApplicationTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyApp()
                }
            }
        }
    }
}
@Composable
fun MyApp(viewMode: QuestionVivemodel = hiltViewModel()){
    Questions(viewMode)
}
@Composable
fun Questions(viewMode: QuestionVivemodel){
    val question = viewMode.data.value.data?.toMutableList()
  if (viewMode.data.value.loading == true) {
      Log.d("Loadingg", "Questions: Lodinnnnnnng")
  } else{
      Log.d("Loadingg", "Questions: ${question?.size} ......")
      question?.forEach{
          Log.d("Loadingg", "Questions: ${it.question}")
      }
  }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        MyApp()
    }
}