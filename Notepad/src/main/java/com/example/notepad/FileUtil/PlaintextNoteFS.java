package com.example.notepad.FileUtil;


import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import com.example.notepad.note.INote;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by edmundd on 09/11/2013.
 */
public class PlaintextNoteFS {

    public static boolean SaveFile(INote note, String fileLocation, Context con)
    {

        PackageManager m = con.getPackageManager();
        String s = con.getPackageName();
        try{
            PackageInfo p = m.getPackageInfo(s, 0);
            s = p.applicationInfo.dataDir;
        }catch (Exception ex)
        {
            return false;
        }


        try{
            File file = new File(s, fileLocation);
            FileOutputStream fs = new FileOutputStream(file);
            fs.write(note.getNoteAsString().getBytes());
            fs.close();
        }
        catch (IOException ioEx){
            return false;
        }

        return true;
    }

}
