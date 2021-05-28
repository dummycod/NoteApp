package com.ignitedminds.noteapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes_table")
data class Note(@ColumnInfo(name="text") val note: String){
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "note_id") var id: Int = 0
}