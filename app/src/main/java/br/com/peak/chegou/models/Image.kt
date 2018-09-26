package br.com.peak.chegou.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Image(val id: String,
                 val packageId: String,
                 val type: Int, // 1 - Foto entrada, 2 - Foto saida, 3 - Assinatura
                 val url: String) : Parcelable