package com.dhiandra.agsatra.mynotesapp.db;

import android.provider.BaseColumns;

class DatabaseContract {

    static final class NoteColumns implements BaseColumns
    {
        static final String TABLE_NAME = "note";
        static final String TITLE = "title";
        static final String DESCRIPTION = "description";
        static final String DATE = "date";
    }
}
