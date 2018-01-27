package com.example.administrator.captchademo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class UnlockSuccessfullyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unlock_successfully);

        Toast.makeText(UnlockSuccessfullyActivity.this,"驗證成功",Toast.LENGTH_SHORT).show();
    }
}
