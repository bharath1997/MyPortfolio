package home.components

import androidx.compose.animation.Crossfade
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import kotlinx.coroutines.delay

@Composable
fun AutoRotatingTexts(list: List<String>, intervalMillis: Long = 5000L,typingSpeedMillis: Long = 50L) {
    var index by rememberSaveable { mutableStateOf(0) }
    LaunchedEffect(Unit) {
        while (true) {
            delay(intervalMillis)
            index = (index + 1) % list.size
        }
    }
    Crossfade(list[index],label = "AutoText"){
        TypingText(it,typingSpeedMillis)
    }
}