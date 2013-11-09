package com.example.notepad.note;

/**
 * Created by edmundd on 09/11/2013.
 */
public class PlaintextNote implements INote {

    private String noteText;

    public PlaintextNote(String noteText){
        this.noteText = noteText;
    }

    @Override
    public String getNoteAsString() {
        return noteText;
    }
}
