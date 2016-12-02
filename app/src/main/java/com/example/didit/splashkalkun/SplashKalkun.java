package com.example.didit.splashkalkun;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashKalkun extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_kalkun);
        Thread  thread = new Thread(){
            public void run (){
                try{
                    sleep(4000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    startActivity(new Intent(SplashKalkun.this,MainActivity.class));
                    finish();
                }
            }

        };
        thread.start();
    }
}
