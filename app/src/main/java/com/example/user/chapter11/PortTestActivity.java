package com.example.user.chapter11;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by user on 2017-06-21.
 */

public class PortTestActivity extends Activity {


    EditText mEditText = null;

    Button mButton = null;


    String TAG = "**PortTestActivity**";

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        Log.w(TAG, "onConfigurationChanged()");
        setContentView(R.layout.activity_port_test);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_port_test);
        Log.e(TAG, "onCreate()");

        mEditText = (EditText)findViewById(R.id.edit_text);
        mButton = (Button)findViewById(R.id.savedBt);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v(TAG, "저장 버튼 클릭");
                startActivity(new Intent(PortTestActivity.this, PortTestAvtivity2.class));
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {

        Log.w(TAG, "onSaveInstanceState()");

        String backupString = mEditText.getText().toString();
        outState.putString("BACKUP_STRING", backupString);

        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {

        Log.w(TAG, "onRestoreInstanceState()");

        if (savedInstanceState != null) {
            mEditText.setText(savedInstanceState.getString("BACKUP_STRING"));
        }

        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v(TAG, "onRestart()");

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(TAG, "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(TAG, "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy()");
    }
}
