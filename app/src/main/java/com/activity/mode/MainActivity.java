package com.activity.mode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        initView();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button) {
            startActivity(new Intent(this, StandardActivity.class));
        }
    }

    private void initView() {
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(MainActivity.this);
    }
}
