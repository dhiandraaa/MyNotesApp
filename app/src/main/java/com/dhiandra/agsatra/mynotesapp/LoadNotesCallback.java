package com.dhiandra.agsatra.mynotesapp;

import com.dhiandra.agsatra.mynotesapp.entity.Note;

import java.util.ArrayList;


public interface LoadNotesCallback {

    void preExecute();

    void postExecute(ArrayList<Note> notes);
}

