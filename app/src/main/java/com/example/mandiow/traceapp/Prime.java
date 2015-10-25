package com.example.mandiow.traceapp;


import android.app.Activity;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Mandiow on 24/10/2015.
 */
public class Prime {


    private int testNumber;
    private int divide;

    public Prime(){

    }


    public void OnCall(int Max)
    {
        //Log.w("MAN","heeelloooooooo");
        //int Max = 1000000;
        testNumber = 2;
        divide = 2;
        while (testNumber < Max) {
            if (testNumber % divide == 0) {
                testNumber++;
                divide = 1;

            }
            if (testNumber % divide != 0 && divide == testNumber - 1) {

                divide = 1;
                testNumber++;


            }
            divide++;

        }
    }
}
