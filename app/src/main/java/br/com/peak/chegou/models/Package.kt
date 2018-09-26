package br.com.peak.chegou.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Package(val id: String,
                   val imagesTotalCount: String,
                   val sender: String,
                   val customMessage: String,
                   val dateReceived: Long,
                   val shelfId: String,
                   val packageType: Int,
                   val trackingNumber:String,
                   val recipientId:String
                   ) : Parcelable