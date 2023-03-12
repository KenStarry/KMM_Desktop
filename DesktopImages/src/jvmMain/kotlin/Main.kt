import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.*
import kotlinx.coroutines.delay

@Composable
@Preview
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }

    MaterialTheme {
        //  image
        Image(
            painter = painterResource("house.jpg"),
            contentDescription = "Sample",
            modifier = Modifier
                .size(300.dp)
                .background(Color.LightGray)
        )
    }
}

fun main() = application {

    var isPerformingTask by remember {
        mutableStateOf(true)
    }

    LaunchedEffect(Unit) {
        delay(2000)
        //  performing some heavy tasks
        isPerformingTask = false
    }

    Tray(
        icon = painterResource("house.jpg"),
        menu = {
            Item(
                text = "Quit App",
                onClick = ::exitApplication
            )
        },
        state = rememberTrayState()
    )

    if (isPerformingTask) {
        Window(
            onCloseRequest = ::exitApplication,
            //  window title
            title = "Loading...",
            state = rememberWindowState(width = 800.dp, height = 700.dp),
            //  window icon
            icon = painterResource("launcher.png"),

            ) {
            App()
        }
    } else {
        Window(
            onCloseRequest = ::exitApplication,
            //  window title
            title = "Images",
            state = rememberWindowState(width = 800.dp, height = 700.dp),
            //  window icon
            icon = painterResource("launcher.png"),

            ) {
            App()
        }
    }
}










