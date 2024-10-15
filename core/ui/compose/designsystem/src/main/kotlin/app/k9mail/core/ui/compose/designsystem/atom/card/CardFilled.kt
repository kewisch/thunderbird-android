package app.k9mail.core.ui.compose.designsystem.atom.card

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Card as Material3Card

@Composable
fun CardFilled(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    content: @Composable ColumnScope.() -> Unit,
) {
    Material3Card(
        onClick = onClick,
        modifier = modifier,
        content = content,
    )
}