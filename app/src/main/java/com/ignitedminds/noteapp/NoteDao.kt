package com.ignitedminds.noteapp

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertNote(note : Note)

    @Delete
    suspend fun deleteNote(note : Note)

    @Query("Select * from notes_table order by note_id ASC")
    fun getAllNotes() : LiveData<List<Note>>
}