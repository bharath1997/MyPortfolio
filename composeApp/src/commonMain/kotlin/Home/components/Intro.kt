package home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.kodein.emoji.Emoji
import org.kodein.emoji.compose.m3.TextWithNotoAnimatedEmoji
import org.kodein.emoji.mediumDark
import org.kodein.emoji.mediumLight
import org.kodein.emoji.people_body.hand_fingers_open.WavingHand
import ui.theme.AppTheme


/**
 * @author bharathvenkatesan
 * Created 21/06/24 at 1:48 PM
 *
 */

@Composable
fun Intro(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.wrapContentSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextWithNotoAnimatedEmoji(
            text = "Welcome to my portfolio ${Emoji.WavingHand.mediumLight}",
            style = MaterialTheme.typography.titleLarge,
           
        )
        Row{
            Text(
                "Bharath", style = MaterialTheme.typography.titleMedium, // Adjust size

                )
            Text(
                " Venkatesan", style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold// Adjust size
                )
        }
        AutoRotatingTexts(
            listOf(
                "Senior Software Engineer",
                "Android Developer",
                "UI/UX Enthusiast",
                "A Friend :)"
            )
        )
    }
}


@Composable
@Preview
fun IntroPreview() {
    Intro()
}