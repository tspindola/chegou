package br.com.peak.chegou.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Package(val id: Int,
                   val imagesTotalCount: String,
                   val sender: String,
                   val customMessage: String,
                   val dateReceived: Long,
                   val shelf: Int,
                   val packageType: Int,
                   val trackingNumber:String
                   ) : Parcelable