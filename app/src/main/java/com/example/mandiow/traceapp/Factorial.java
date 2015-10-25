package com.example.mandiow.traceapp;

import android.content.Intent;

/**
 * Created by Mandiow on 25/10/2015.
 */
public class Factorial {

    private int Index;
    private int Result;



    public void Factorial(){
        Index = 1;
        Result = 1;

    }



    public int Iterative(int Number){

            for(;Index <= Number; Index++){
                Result = Result * Index;
            }
        return Result;
    }

    public int Recursive(int Number){
        if (Number <2)
            return 1;
        else
            return Result = Number * Recursive(Number -1);
    }

}
