package com.example.mascotafeliz2.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(

    primary = RojoClaro,
    primaryVariant = Rojo,
    secondary = RosadoOscuro,
    secondaryVariant = Rosado,
)

private val LightColorPalette = lightColors(

    primary = RojoOscuro,
    primaryVariant = Rojo,
    secondary = RosadoClaro,
    secondaryVariant = Rosado,

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun MascotaFeliz2Theme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes2,
        content = content
    )
}