package com.example.asim.intentsbehaviour;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;


public class MainActivity extends Activity {

    String TAG="flow";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //......................................................
    public void implicit(View view) {
        Log.i(TAG, "implicit: testing implicit intents ");
        logSleep(300);
        Log.i("flow", "implicit: button clicked ");
        logSleep(300);
        Log.i("flow", "implicit: testing what will happen if !");
        logSleep(300);
        Log.i("flow", "implicit: our app starts an intent with an action(predefined by android) ");
        logSleep(300);
        Log.i("flow", "implicit:  and its already in the intent Filter of one of our Activity");
        logSleep(300);
        Log.i(TAG, "implicit: setAction to Intent.ACTION_PASTE ,and startActivity");
        Intent i = new Intent();
        i.setAction(Intent.ACTION_PASTE);
        startActivity(i);
    }
//..................................................

    public void explicit(View view) {
        Log.i("flow", "explicit: button clicked");
        Intent i = new Intent(this, PasteActivity.class);
        startActivity(i);
    }
//..............................................

    public void custom(View view) {
        Log.i("flow", "custom: button clicked");
        logSleep(300);
        Log.i(TAG, "custom: testing custom Actions !");
        logSleep(300);
        Log.i(TAG, "custom: this is a custom intent that we created ");
        logSleep(300);
        Log.i(TAG, "custom: and we set an action named 'out_intent' ");
        logSleep(300);
        Log.i(TAG, "custom: which is just a string for testing purposes");
        logSleep(300);
        Log.i(TAG, "custom: we have put this action 'our_intent' in intent filter of one of our Activity");
        logSleep(300);
        Log.i(TAG, "custom: in other words one of our activity says 'i can handle an intent" +
                " with which demands this action");
        logSleep(300);
        Intent i = new Intent();
        logSleep(300);
        i.setAction("out_intent");
        startActivity(i);
    }

    private void logSleep(long i)
    {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}