package com.example.myapplication.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.util.AppColors


@Composable
fun quetionTracker(curr: Int = 10, outOf: Int = 100){
    Text(buildAnnotatedString {
        withStyle(style =  ParagraphStyle(textIndent = TextIndent.None)){
            withStyle(style = SpanStyle(color = AppColors.mLightGray, fontWeight = FontWeight.Bold,
                fontSize = 27.sp)){
                append("Question  $curr/")
            }
            withStyle(style = SpanStyle(color = AppColors.mLightGray, fontWeight = FontWeight.Light,
                fontSize = 14.sp)){
                append("$outOf")
            }
        }
    }, modifier = Modifier.padding(20.dp))
}