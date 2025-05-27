package home.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.produceState
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay

@Composable
fun TypingText(
    fullText: String,
    typingSpeedMillis: Long = 50L
) {
    val animatedText by produceState(initialValue = "") {
        value = ""
        for (i in fullText.indices) {
            delay(typingSpeedMillis)
            value = fullText.substring(0, i + 1)
        }
    }

    Text(text = animatedText, fontSize = 18.sp)
}