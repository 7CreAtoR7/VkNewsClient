package ru.ilya.vknewsclient.ui.theme

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource

@Composable
fun MainScreen() {
    Scaffold(
        bottomBar = {
            BottomNavigation {
                val items = listOf(NavigationItem.Home, NavigationItem.Favourite, NavigationItem.Profile)

                items.forEach {
                    BottomNavigationItem(
                        selected = true,
                        onClick = { },
                        icon = {
                            Icon(it.icon, contentDescription = null)
                        },
                        label = {
                            Text(text = stringResource(id = it.titleResId))
                        }
                    )
                }
            }
        }
    ) {

    }
}