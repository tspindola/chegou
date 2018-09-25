package br.com.peak.chegou.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Shelf(val id: Int,
                 val name: String) : Parcelable