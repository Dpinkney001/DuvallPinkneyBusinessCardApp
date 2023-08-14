package com.example.duvallpinkneybusinesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.duvallpinkneybusinesscardapp.ui.theme.DuvallPinkneyBusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DuvallPinkneyBusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(
                        stringResource(R.string.full_name_text),
                        stringResource(R.string.title_text),
                        stringResource(R.string.phone_text),
                        stringResource(R.string.website_text),
                        stringResource(R.string.email_text),
                        stringResource(R.string.linkedin_text)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(name: String, website: String,phone: String, title: String, email: String, linkedin: String, modifier: Modifier = Modifier) {
    // Create a column so that texts don't overlap
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = name,
            color = Color(0xFF3ddc84),
            fontSize = 20.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 16.dp)
        )
        Text(
            text = title,
            color = Color(0xFF3ddc84),
            fontSize = 20.sp,
            modifier = Modifier
                .padding(top = 16.dp)
                .padding(end = 16.dp)
                .align(alignment = Alignment.End)
        )

        // Create a column so that texts don't overlap
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = modifier
        ) {
            Text(
                text = website,
                fontSize = 20.sp,
                color = Color(0xFF3ddc84),
                //lineHeight = 116.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 16.dp)
            )
            Text(
                text = email,
                fontSize = 20.sp,
                color = Color(0xFF3ddc84),
                modifier = Modifier
                    .padding(top = 16.dp)
                    .padding(end = 16.dp)
                    .align(alignment = Alignment.End)
            )
            Text(
                text = linkedin,
                fontSize = 20.sp,
                color = Color(0xFF3ddc84),
                //lineHeight = 116.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 16.dp)
            )
            Text(
                text = phone,
                color = Color(0xFF3ddc84),
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(top = 16.dp)
                    .padding(end = 16.dp)
                    .align(alignment = Alignment.End)
            )
        }
    }
}

@Composable
fun GreetingImage(name: String, website: String,phone: String, title: String, email: String, linkedin: String, modifier: Modifier = Modifier) {
    // Create a box to overlap image and texts
    Box(modifier) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
        GreetingText(
            name = name,
            title = title,
            website = website,
            email = email,
            linkedin = linkedin,
            phone = phone,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun DuvallPinkneyBusinessCardAppPreview() {
    DuvallPinkneyBusinessCardAppTheme {
        GreetingImage(
            stringResource(R.string.full_name_text),
            stringResource(R.string.title_text),
            stringResource(R.string.phone_text),
            stringResource(R.string.website_text),
            stringResource(R.string.email_text),
            stringResource(R.string.linkedin_text)
        )
    }
}