package com.wong.testlifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class BActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Log.i("onCreate","onCreate Activity");
        Button b_btn = (Button)findViewById(R.id.b_btn);
        b_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(BActivity.this,CActivity.class);
                startActivity(intent);
            }
        });

        Button bb_btn = (Button)findViewById(R.id.bb_btn);
        bb_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        getSupportFragmentManager().beginTransaction().add(R.id.container,new BFragment()).commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("onStart","onStart Activity");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("onResume","onResume Activity");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("onPause","onPause Activity");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("onStop","onStop Activity");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("onRestart","onRestart Activity");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy","onDestroy Activity");

    }
}
