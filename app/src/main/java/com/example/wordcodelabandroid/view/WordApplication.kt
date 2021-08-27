package com.example.wordcodelabandroid.view

import android.app.Application
import com.example.wordcodelabandroid.data.WordRepository
import com.example.wordcodelabandroid.data.WordRoomDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class WordApplication: Application() {
    val apllicationScope = CoroutineScope(SupervisorJob())
    val database by lazy { WordRoomDatabase.getDataBase(this, apllicationScope) }
    val repository by lazy { WordRepository(database.wordDao()) }
}