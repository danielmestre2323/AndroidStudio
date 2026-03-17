package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun MyConstraintLayout(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {

        val (vermell, groc, verd, cian, magenta) = createRefs()

        Box(modifier = Modifier.size(120.dp).background(Color.Red).constrainAs(vermell) {
            centerTo(parent)
        })

        Box(modifier = Modifier.size(120.dp).background(Color.Yellow).constrainAs(groc) {
            end.linkTo(vermell.start)
            bottom.linkTo(vermell.top)
        })

        Box(modifier = Modifier.size(120.dp).background(Color.Green).constrainAs(verd) {
            start.linkTo(vermell.end)
            top.linkTo(vermell.bottom)
        })

        Box(modifier = Modifier.size(120.dp).background(Color.Cyan).constrainAs(cian) {
            end.linkTo(vermell.start)
            top.linkTo(vermell.bottom)
        })

        Box(modifier = Modifier.size(120.dp).background(Color.Magenta).constrainAs(magenta) {
            start.linkTo(vermell.end)
            bottom.linkTo(vermell.top)
        })
    }
}