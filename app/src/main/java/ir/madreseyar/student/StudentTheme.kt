package ir.madreseyar.student

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = Color(0xFF3156D3),
    secondary = Color(0xFF12A594),
    tertiary = Color(0xFFF59E0B),
    background = Color(0xFFF6F8FC),
    surface = Color.White,
    error = Color(0xFFD93C3C)
)
private val DarkColors = darkColorScheme(
    primary = Color(0xFFAFC2FF),
    secondary = Color(0xFF66D9C7),
    background = Color(0xFF11131A),
    surface = Color(0xFF191C24)
)

@Composable
fun MadreseyarTheme(content: @Composable () -> Unit) {
    MaterialTheme(colorScheme = if (isSystemInDarkTheme()) DarkColors else LightColors, content = content)
}
