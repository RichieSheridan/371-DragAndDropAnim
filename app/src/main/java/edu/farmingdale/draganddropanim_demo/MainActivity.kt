package edu.farmingdale.draganddropanim_demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import edu.farmingdale.draganddropanim_demo.ui.theme.DragAndDropAnim_DemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DragAndDropAnim_DemoTheme {

                    DragAndDropBoxes()

            }
        }
    }
}



// This should be completed in a group setting
// ToDo 1: DONE Analyze the requirements for Individual Project 3
// ToDo 2: DONE Show the DragAndDropBoxes composable
// ToDo 3: DONE Change the circle to a rect
// ToDo 4: DONE Replace the command right with a image or icon
// ToDo 5: DONE Make this works in landscape mode only
// ToDo 6: DONE Rotate the rect around itself
// ToDo 7: DONE Move - translate the rect horizontally and vertically
// ToDo 8: DONE Add a button to reset the rect to the center of the screen
// ToDo 9: DONE Enable certain animation based on the drop event (like up or down)
// ToDo 10: DONE Make sure to commit for each one of the above and submit this individually


