package com.entropia.cc17_3f_perezja_act9.data

import android.content.Context

interface AppContainer {
    val flightSearchRepository: FlightSearchRepository
}


class AppDataContainer(private val context: Context) : AppContainer {
    override val flightSearchRepository: FlightSearchRepository by lazy {
        OfflineRepository(
            FlightSearchDatabase.getDatabase(context).airportDao(),
            FlightSearchDatabase.getDatabase(context).favoriteDao()
        )
    }

}