package com.farhanryanda.tugastopikdua

import android.os.Parcel
import android.os.Parcelable

data class DataParcelable(
    val umur: String?, val tinggi: String?,
    val berat: String?, val bmi: Double, val kategori: String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readDouble(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(umur)
        parcel.writeString(tinggi)
        parcel.writeString(berat)
        parcel.writeDouble(bmi)
        parcel.writeString(kategori)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DataParcelable> {
        override fun createFromParcel(parcel: Parcel): DataParcelable {
            return DataParcelable(parcel)
        }

        override fun newArray(size: Int): Array<DataParcelable?> {
            return arrayOfNulls(size)
        }
    }
}
