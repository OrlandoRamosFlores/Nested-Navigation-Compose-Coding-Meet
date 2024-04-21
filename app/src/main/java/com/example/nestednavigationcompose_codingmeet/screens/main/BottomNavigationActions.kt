package com.example.nestednavigationcompose_codingmeet.screens.main

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import com.example.nestednavigationcompose_codingmeet.navigation.bottomNavigationDestinations

@Composable
fun BottomNavigationActions(
    currentScreen: String
) {

    when (currentScreen) {
        bottomNavigationDestinations[0].title -> {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Outlined.Search,
                    contentDescription = "search"
                )
            }
        }

        bottomNavigationDestinations[1].title -> {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Outlined.Settings,
                    contentDescription = "settings"
                )
            }
        }

        bottomNavigationDestinations[2].title -> {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Outlined.Star,
                    contentDescription = "star"
                )
            }
        }

        bottomNavigationDestinations[3].title -> {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Outlined.Phone,
                    contentDescription = "Phone"
                )
            }
        }
    }
}