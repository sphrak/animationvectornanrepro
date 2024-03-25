package com.example.animationvectornanrepro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Close
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.unit.dp
import com.example.animationvectornanrepro.ui.theme.AnimationvectornanreproTheme


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AnimationvectornanreproTheme {
                Scaffold(modifier = Modifier.fillMaxSize().systemBarsPadding()) { innerPadding ->

                    val list = remember {
                        mutableStateListOf(*test)
                    }


                    val state = rememberLazyListState()

                    Button(
                        onClick = {
                            list.clear()
                            list.addAll(test)
                        }
                    ) {
                        Text(text = "reset list")
                    }

                    LazyRow(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                            .systemBarsPadding(),
                        contentPadding = PaddingValues(8.dp),
                        flingBehavior = rememberSnapFlingBehavior(lazyListState = state),
                        state = state
                    ) {
                        items(list, key = {it} ) {
                            Item(
                                modifier = Modifier.fillParentMaxWidth().animateItemPlacement(),
                                value = it,
                                onDismiss = {
                                    list.remove(it)
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun Item(
    modifier: Modifier,
    value: String, onDismiss: (value: String) -> Unit) {

    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()
    val scale: Float by animateFloatAsState(if (isPressed) .95f else 1f)

    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
            .scale(scale)
            .clickable(interactionSource = interactionSource, indication = null) {
                // nothing
            }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = value)
            Icon(
                modifier = Modifier.clickable { onDismiss(value) },
                imageVector = Icons.Outlined.Close,
                contentDescription = null,
            )
        }
    }
}

val test: Array<String> = Array(4) {
    "$it"
}
