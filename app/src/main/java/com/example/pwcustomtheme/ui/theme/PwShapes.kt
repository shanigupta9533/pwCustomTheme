package com.example.pwcustomtheme.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.staticCompositionLocalOf

data class PwShapes(
    val mediumShapes: RoundedCornerShape = RoundedCornerShape(50),
    val circleShape: RoundedCornerShape = RoundedCornerShape(100),
    val minimumShape: RoundedCornerShape = RoundedCornerShape(35)
)

internal val LocalShapes = staticCompositionLocalOf { PwShapes() }