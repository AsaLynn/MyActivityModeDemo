package com.activity.mode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SingleInstanceActivity extends AppCompatActivity implements View.OnClickListener {
    protected Button button;
    protected Button button2;
    private String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_single_instance);
        Log.i(TAG, this + ILogTag.ARROW + "onCreate: ");
        initView();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, this + ILogTag.ARROW + "onStop: ");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i(TAG, this + ILogTag.ARROW + "onNewIntent: ");
    }


    private void initView() {
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(SingleInstanceActivity.this);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(SingleInstanceActivity.this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button) {
            Log.i(TAG, this + ILogTag.ARROW + ":navigate to SingleInstanceActivity");
            startActivity(new Intent(this, SingleInstanceActivity.class));
        } else if (view.getId() == R.id.button2) {
            Log.i(TAG, this + ILogTag.ARROW + ":navigate to TempActivity");
            startActivity(new Intent(this, TempActivity.class));
        }
    }
}
