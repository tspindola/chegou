package br.com.peak.chegou.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Recipient(val id: String,
                     val name: String,
                     val address: String,
                     val email: String,
                     val phone: Long) : Parcelable