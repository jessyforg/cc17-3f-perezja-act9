package com.entropia.cc17_3f_perezja_act9

import android.app.Application
import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import com.entropia.cc17_3f_perezja_act9.data.FlightSearchDatabase
import com.entropia.cc17_3f_perezja_act9.data.UserPreferencesRepository

private const val INPUT_PREFERENCE_NAME = "input_string"
private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(
    name = INPUT_PREFERENCE_NAME
)

class FlightSearchApplication : Application() {
    lateinit var userPreferencesRepository: UserPreferencesRepository
    val database: FlightSearchDatabase by lazy { FlightSearchDatabase.getDatabase(this) }
    override fun onCreate() {
        super.onCreate()
        userPreferencesRepository = UserPreferencesRepository(dataStore)
    }

}