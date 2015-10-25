package com.example.mandiow.traceapp;

import android.os.Debug;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    public int[] InputQuick ={20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};
    public int[] InputSelection ={20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};
    public Prime prime = new Prime();
    public Quicksort quicksort = new Quicksort();
    public Factorial factorial = new Factorial();
    public SelectionSort selectionSort = new SelectionSort();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        quicksort.Fill(InputQuick);
        factorial.Factorial();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        //Debug.startMethodTracing("trace");

        //prime
        //prime.OnCall(10000);


        //All Algorithms are working k?
        //Quicksort
        //quicksort.Sort(0,InputQuick.length - 1);

        //SelectionSort
        //selectionSort.Sort(InputSelection);

        //Factorial
        //factorial.Iterative(10);
        //factorial.Recursive(10);


        //Debug.stopMethodTracing();

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
