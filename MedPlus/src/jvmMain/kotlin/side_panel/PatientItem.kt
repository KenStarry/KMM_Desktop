package side_panel

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import models.Patient

@Composable
fun PatientItem(
    patient: Patient
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        //  image box
        Box(
            modifier = Modifier
                .size(60.dp),
            contentAlignment = Alignment.Center
        ) {

            //  image
            Image(
                painter = painterResource(patient.image),
                contentDescription = "Lady image",
                modifier = Modifier
                    .clip(CircleShape)
                    .fillMaxSize(0.9f),
                contentScale = ContentScale.Crop
            )
        }
    }
}
























