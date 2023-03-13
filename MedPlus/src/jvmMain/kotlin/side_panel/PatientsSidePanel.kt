package side_panel

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import models.Patient

@Composable
fun PatientsSidePanel(
    modifier: Modifier = Modifier
) {

    val listState = rememberLazyListState()

    val patientsList = listOf(
        Patient("lady1.webp", "S. Chichi", "Female", 25),
        Patient("lady1.webp", "N. Starry", "Male", 19),
        Patient("lady1.webp", "K. Pookie", "Female", 28),
        Patient("lady1.webp", "T. Kenny", "Male", 24),
    )

    LazyColumn(
        state = listState,
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(patientsList) { patient ->



        }
    }

}