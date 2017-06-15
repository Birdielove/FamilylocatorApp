package com.example.suraj.familylocatorapp;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by suraj on 15-06-2017.
 */

public class GlobalInfo {
    public static String PhoneNumber = "";

    public static void UpdateInfo(String UserPhone)
    {
        DateFormat df = new SimpleDateFormat("yyyy/dd HH:MM:ss");
        Date date = new Date();
        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.child("Users").child(PhoneNumber).child("Updates").setValue(df.format(date).toString());

    }


}
