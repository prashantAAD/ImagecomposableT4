package revengerfitness.imagecomposablet4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import revengerfitness.imagecomposablet4.ui.theme.ImageComposableT4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text(text = "prashant chauhan")
        }
    }
}



@Preview(showBackground = true,name = "hello messege2", showSystemUi = true)
@Composable
private fun PreviewFunction2(){
    Image(painter = painterResource(id =R.drawable.abs  ), contentDescription ="dummy image",
        //colorFilter = ColorFilter.tint(Color.Transparent),
        // contentScale = ContentScale.Inside)
    )
}