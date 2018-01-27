package com.example.administrator.captchademo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.luozm.captcha.Captcha;

public class MainActivity extends AppCompatActivity {

    private Captcha captcha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        captcha = (Captcha) findViewById(R.id.captCha);
        captcha.setCaptchaListener(new Captcha.CaptchaListener() {
            @Override
            public void onAccess(long time) {
                recreate();
                Intent intent = new Intent(MainActivity.this, UnlockSuccessfullyActivity.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
            }

            @Override
            public void onFailed() {
                Toast.makeText(MainActivity.this,"驗證失敗",Toast.LENGTH_SHORT).show();
                recreate();
            }
        });
    }
}
