package side_panel

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.ExitToApp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
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

            //  circle indicator
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(4.dp),
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.Bottom
            ) {
                Box(
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(18.dp)
                        .background(Color.White)
                        .border(
                            color = Color(0xFF008CFF),
                            width = 4.dp,
                            shape = CircleShape
                        )
                )
            }
        }

        //  user name and gender
        Column(
            modifier = Modifier
                .weight(2f)
                .wrapContentHeight()
                .padding(horizontal = 8.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            //  patient name
            Text(
                text = patient.name,
                fontSize = MaterialTheme.typography.body2.fontSize,
                fontWeight = FontWeight.SemiBold,
                color = Color.White
            )

            //  patient gender
            Text(
                text = "${patient.gender} ${patient.age}",
                fontSize = MaterialTheme.typography.body1.fontSize,
                fontWeight = FontWeight.Normal,
                color = Color.White.copy(alpha = 0.5f)
            )
        }

        //  x button
        IconButton(
            onClick = {},
            modifier = Modifier
                .clip(CircleShape)
                .background(Color.White.copy(alpha = 0.3f))
                .size(35.dp)
        ) {
            Icon(
                imageVector = Icons.Outlined.ExitToApp,
                contentDescription = "Remove Icon",
                tint = Color.White.copy(alpha = 0.8f),
                modifier = Modifier
                    .size(20.dp)
            )
        }
    }
}
























