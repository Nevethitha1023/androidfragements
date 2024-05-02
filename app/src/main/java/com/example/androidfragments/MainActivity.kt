package com.example.androidfragments

import android.os.Bundle
import androidx.activity.ComponentActivity

import android.view.View
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidfragments.ui.theme.AndroidfragmentsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
        }

        fun showBasicDetails(view: View) {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.basicDetailsFragmentContainer, StudentBasicDetailsFragment())
                commit()
            }
            findViewById<FrameLayout>(R.id.basicDetailsFragmentContainer).visibility = View.VISIBLE
            findViewById<FrameLayout>(R.id.markFragmentContainer).visibility = View.GONE
        }

        fun showMark(view: View) {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.markFragmentContainer, StudentMarkFragment())
                commit()
            }
            findViewById<FrameLayout>(R.id.basicDetailsFragmentContainer).visibility = View.GONE
            findViewById<FrameLayout>(R.id.markFragmentContainer).visibility = View.VISIBLE
        }
    }
