package com.example.peterarchbold.chooseyourownadventure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void startGame(View view){
        Intent intent=new Intent(Main3Activity.this,MainActivity.class);
        startActivity(intent);
    }
}
