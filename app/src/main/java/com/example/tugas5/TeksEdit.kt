package com.example.tugas5

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FormDataDiri(modifier: Modifier) {
    var nama by remember { mutableStateOf("") }
    var jenisKelamin by remember { mutableStateOf("") }
    var status by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }

    var submittedNama by remember { mutableStateOf("") }
    var submittedJK by remember { mutableStateOf("") }
    var submittedStatus by remember { mutableStateOf("") }
    var submittedAlamat by remember { mutableStateOf("") }

    val genderOptions = listOf(
        stringResource(id = R.string.opsi_laki),
        stringResource(id = R.string.opsi_perempuan)
    )

}






