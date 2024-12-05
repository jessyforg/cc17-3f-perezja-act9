package com.entropia.cc17_3f_perezja_act9

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.entropia.cc17_3f_perezja_act9.ui.FlightSearchViewModel
import com.entropia.cc17_3f_perezja_act9.ui.HomeScreen
import com.entropia.cc17_3f_perezja_act9.ui.theme.FlightSearchTheme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FlightSearchTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val viewModel: FlightSearchViewModel =
                        viewModel(factory = FlightSearchViewModel.factory)
                    HomeScreen(
                        viewModel = viewModel,
                        modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_small))
                    )
                }
            }
        }
    }
}

