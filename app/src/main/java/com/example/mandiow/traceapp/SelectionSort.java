package com.example.mandiow.traceapp;

/**
 * Created by Mandiow on 25/10/2015.
 */
public class SelectionSort {

    private int Index, Index2;
    private int Pos;
    private int Selected;

    public void Sort(int[] Input){

        for (Index = 0; Index < Input.length - 1; Index++)
        {
            Pos = Index;
            for (Index2= Index + 1; Index2 < Input.length; Index2++)
                if (Input[Index2] < Input[Pos])
                    Pos = Index2;

            Selected = Input[Pos];
            Input[Pos] = Input[Index];
            Input[Index] = Selected;
        }
    }
}
