package com.example.pwcustomtheme

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.pwcustomtheme.ui.theme.PwTheme

@Composable
fun PwPrimaryButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        shape = PwTheme.shapes.minimumShape,
        onClick = onClick,
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = PwTheme.colors.buttonColor,
        )
    ){
        ProvideTextStyle(
            value = PwTheme.typography.body
        ) {
            content()
        }
    }
}

