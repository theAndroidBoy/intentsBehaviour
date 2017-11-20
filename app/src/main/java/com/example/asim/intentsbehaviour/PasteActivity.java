package com.example.asim.intentsbehaviour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


public class PasteActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.i("flow", "onCreate: PasteActivity");
    }
}