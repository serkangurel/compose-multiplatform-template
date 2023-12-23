import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable

actual fun getPlatformName(): String = "Android"

@Composable
fun MainView() = App(
    darkTheme = isSystemInDarkTheme(),
    dynamicColor = true
)