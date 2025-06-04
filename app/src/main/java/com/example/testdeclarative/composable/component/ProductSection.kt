import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testdeclarative.R

@Composable
fun SectionHeader(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(99.dp, Alignment.Start),
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .requiredWidth(width = 328.dp)
    ) {
        Text(
            text = "Cheap tom section",
            color = Color(0xff1f1f1e),
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.Start),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "View all",
                color = Color(0xff03578a),
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium))
            Image(
                painter = painterResource(id = R.drawable.arrow_right),
                contentDescription = "arrow-right-04",
                colorFilter = ColorFilter.tint(Color(0xff03578a)),
                modifier = Modifier
                    .requiredSize(size = 12.dp))
        }
    }
}

@Preview(widthDp = 328, heightDp = 30)
@Composable
private fun SectionHeaderPreview() {
    SectionHeader(Modifier)
}