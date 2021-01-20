package com.example.desafiomarveldh.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Creators(
        val available: Int,
        val collectionURI: String,
        val items: List<CharactersItem>,
        val returned: Int
): Parcelable