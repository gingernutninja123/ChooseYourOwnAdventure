package com.example.peterarchbold.chooseyourownadventure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.chrisbanes.photoview.PhotoView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       int drawableInt=getIntent().getIntExtra("DrawableInt",0);
        PhotoView photoView = (PhotoView) findViewById(R.id.photo_view);
        photoView.setImageResource(drawableInt);



    }

    public void close(View view){
       this.finish();




    }
}
