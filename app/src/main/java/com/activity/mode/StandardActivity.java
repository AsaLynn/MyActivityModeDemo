package com.activity.mode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class StandardActivity extends AppCompatActivity implements View.OnClickListener {

    protected Button button;
    private String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_standard);
        initView();
        Log.i(TAG, this + ILogTag.ARROW + "onCreate: ".concat(ILogTag.ARROW));
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.setTitle(this.getClass().getSimpleName());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, this + ILogTag.ARROW + "onDestroy: ".concat(ILogTag.ARROW));
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, this + ILogTag.ARROW + "onStop: ".concat(ILogTag.ARROW));
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button) {
            Log.i(TAG, this + ":navigate to StandardActivity".concat(ILogTag.ARROW));
            startActivity(new Intent(this, StandardActivity.class));
        }
    }

    private void initView() {
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(StandardActivity.this);
    }
}
