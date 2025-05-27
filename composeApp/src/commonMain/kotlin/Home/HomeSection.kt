package Home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import home.components.AutoRotatingTexts
import home.components.Intro
import home.components.ProfileImage
import home.components.ResponsiveImageSummary

/**
 * @author bharathvenkatesan
 * Created 21/06/24 at 1:47 PM
 */

@Composable
fun HomeSection(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        ResponsiveImageSummary({ ProfileImage(modifier) }, {
            Column {
                Intro(modifier)

            }
        })
    }
} 