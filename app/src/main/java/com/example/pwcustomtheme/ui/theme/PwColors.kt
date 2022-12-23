package com.example.pwcustomtheme.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

private val colorButton = Color(0xFFFFB400)
private val colorSecondary = Color(0xFFDDDDDD)
private val colorLightTextSecondary = Color(0xFF6C727A)
private val colorLightError = Color(0xFFFF0000)
private val colorWhite = Color(0xFFFFFFFF)

private val colorDarkPrimary = Color(0xFF000000)
private val colorDarkSecondary = Color(0xFFDDDDDD)
private val colorDarkTextSecondary = Color(0xFF6C727A)
private val colorDarkError = Color(0xFFFF0000)

open class PwColors(
    open val primaryColor: Color = colorWhite,
    open val secondaryColor: Color = colorSecondary,
    open val colorTextSecondary: Color = colorLightTextSecondary,
    open val colorError: Color = colorLightError,
    open val buttonColor: Color = colorLightError,
)

data class PwDarkColors(
    override val primaryColor: Color = colorDarkPrimary,
    override val secondaryColor: Color = colorDarkSecondary,
    override val colorTextSecondary: Color = colorDarkTextSecondary,
    override val colorError: Color = colorDarkError,
    override val buttonColor: Color = colorButton
) : PwColors()

data class PwLightColors(
    override val primaryColor: Color = colorWhite,
    override val secondaryColor: Color = colorSecondary,
    override val colorTextSecondary: Color = colorLightTextSecondary,
    override val colorError: Color = colorLightError,
    override val buttonColor: Color = colorButton
) : PwColors()

val LocalColors = staticCompositionLocalOf { PwColors() }