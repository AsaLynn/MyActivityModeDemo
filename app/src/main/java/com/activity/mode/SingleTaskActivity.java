package com.activity.mode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SingleTaskActivity extends AppCompatActivity implements View.OnClickListener {

    protected Button button;
    protected Button button2;
    private String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_single_task);
        initView();
        Log.i(TAG, this + ILogTag.ARROW + "onCreate: ");
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button) {
            Log.i(TAG, this + ILogTag.ARROW + ":navigate to SingleTaskActivity");
            startActivity(new Intent(this, SingleTaskActivity.class));
        } else if (view.getId() == R.id.button2) {
            Log.i(TAG, this + ILogTag.ARROW + ":navigate to TempActivity");
            startActivity(new Intent(this, TempActivity.class));
        }
    }

    private void initView() {
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(SingleTaskActivity.this);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(SingleTaskActivity.this);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i(TAG, this + ILogTag.ARROW + "onNewIntent: ");
    }
}
