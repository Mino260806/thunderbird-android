package app.k9mail.core.ui.compose.designsystem.atom.text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import app.k9mail.core.ui.compose.theme.MainTheme
import app.k9mail.core.ui.compose.theme.PreviewWithThemes
import androidx.compose.material.Text as MaterialText

@Composable
fun TextHeadline3(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
) {
    MaterialText(
        text = text,
        style = MainTheme.typography.h3,
        modifier = modifier,
        color = color,
    )
}

@Composable
fun TextHeadline3(
    text: AnnotatedString,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
) {
    MaterialText(
        text = text,
        style = MainTheme.typography.h3,
        modifier = modifier,
        color = color,
    )
}

@Preview(showBackground = true)
@Composable
internal fun TextHeadline3Preview() {
    PreviewWithThemes {
        TextHeadline3(text = "TextHeadline3")
    }
}

@Preview(showBackground = true)
@Composable
internal fun TextHeadline3WithAnnotatedStringPreview() {
    PreviewWithThemes {
        TextHeadline3(
            text = buildAnnotatedString {
                append("Normal")
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                    append("Annotated")
                }
            },
        )
    }
}
