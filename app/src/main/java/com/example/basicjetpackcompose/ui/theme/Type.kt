package com.example.basicjetpackcompose.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineBreak
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )

)

object CustomTypography {
   val  header = TextStyle(
       fontFamily = FontFamily.SansSerif,
       fontWeight = FontWeight.Bold,
       fontSize = 32.sp,

   )
    val  titleSmall = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontSize = 14.sp,
        )

    val  titleMedium = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontSize = 20.sp,
        lineHeight = 3.sp,
        textAlign = TextAlign.Center

    )
    val  titleLarge = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontSize = 28.sp,

    )
    val  titleItalic = TextStyle(
        fontFamily = FontFamily.Cursive,
        fontSize = 28.sp,
        fontStyle = FontStyle.Italic
        )
    val  titleDecoration = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontSize = 28.sp,
        color = Color(0xFFD90707),
        fontWeight = FontWeight.Medium,

    )

    val  titleShadow = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontSize = 28.sp,
        shadow = Shadow(
            color = Color.Gray,
            offset = Offset(5f, 5f),
            blurRadius = 4f
        )

        )

    val  titleUnderLine = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontSize = 28.sp,
        textDecoration = TextDecoration.Underline

        )
}