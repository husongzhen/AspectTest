package com.allen.code.aspecttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @TimeLog
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.text).setOnClickListener(this);
    }

    @AsyncTask
    @Override
    protected void onStart() {
        super.onStart();
        LogUtils.d("onstart");
    }

    public void onClick(View view) {
        mainClick();
    }


    private void mainClick() {
        Toast.makeText(this, "onclick", Toast.LENGTH_SHORT).show();
    }
}
