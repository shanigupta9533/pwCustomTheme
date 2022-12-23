package com.example.pwcustomtheme.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.ViewCompat

object PwTheme {

    val colors: PwColors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

    val typography: PwTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current

    val dimensions: PwDimensions
        @Composable
        @ReadOnlyComposable
        get() = LocalDimensions.current

    val shapes: PwShapes
        @Composable
        @ReadOnlyComposable
        get() = LocalShapes.current
}

@Composable
fun PwAppTheme(
    isDarkMode: Boolean = isSystemInDarkTheme(),
    typography: PwTypography = PwTheme.typography,
    dimensions: PwDimensions = PwTheme.dimensions,
    shapes: PwShapes = PwTheme.shapes,
    content: @Composable () -> Unit
) {

    val colorScheme: PwColors = when {
        isDarkMode -> PwDarkColors()
        else -> PwLightColors()
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            (view.context as Activity).window.statusBarColor = colorScheme.primaryColor.toArgb()
            ViewCompat.getWindowInsetsController(view)?.isAppearanceLightStatusBars = isDarkMode
        }
    }

    CompositionLocalProvider(
        LocalColors provides colorScheme,
        LocalDimensions provides dimensions,
        LocalTypography provides typography,
        LocalShapes provides shapes
    ) {
        content()
    }
}
