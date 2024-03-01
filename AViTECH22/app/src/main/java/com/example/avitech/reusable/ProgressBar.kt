package com.example.avitech.reusable

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp

@Composable
fun ProgressIndicator(
    activeIndex: Int = 0,
    totalSteps: Int = 5,
    activeColor: Color = Color(0xFF9aBC41),
    inactiveColor: Color = Color.Gray,
    radius: Float = 10f
) {
    val density = LocalDensity.current.density

    // Convert dp to pixel for canvas drawing
    val pixelRadius = remember { density * radius }

    Row(
        modifier = Modifier.height(IntrinsicSize.Min),
        verticalAlignment = Alignment.CenterVertically
    ) {
        for (i in 0 until totalSteps) {
            // Draw circles
            Canvas(modifier = Modifier.size((pixelRadius * 2).dp)) {
                val circleColor = if (i <= activeIndex) activeColor else inactiveColor
                drawCircle(
                    color = circleColor,
                    radius = pixelRadius
                )
            }
        }
    }
}