package com.example.pwcustomtheme.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.staticCompositionLocalOf

data class PwShapes(
    val mediumShapes: RoundedCornerShape = RoundedCornerShape(percent = 50),
    val circleShape: RoundedCornerShape = RoundedCornerShape(percent = 100),
    val minimumShape: RoundedCornerShape = RoundedCornerShape(percent = 35)
)

internal val LocalShapes = staticCompositionLocalOf { PwShapes() }