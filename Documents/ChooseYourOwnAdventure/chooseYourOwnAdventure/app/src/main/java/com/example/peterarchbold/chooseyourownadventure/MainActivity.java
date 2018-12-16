package com.example.peterarchbold.chooseyourownadventure;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.transition.Scene;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.github.chrisbanes.photoview.PhotoView;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {
   // MediaPlayer mediaPlayer;
    Context context;
    int counter=0;
    public class scene {
        private String sceneID;

        private String text;
        private String previousScene;
        private String choice1;
        private String choice1Title;
        private String choice2;
        private String choice2Title;
        private int image;
        private int Sound;

        public scene(String sceneID, String text, String previousScene, String choice1,String choice1Title,String choice2,String choice2Title,int image,int Sound) {
            this.sceneID = sceneID;
            this.text = text;
            this.previousScene = previousScene;
            this.choice1 = choice1;
            this.choice1Title=choice1Title;
            this.choice2 = choice2;
            this.choice2Title=choice2Title;
            this.image=image;
            this.Sound=Sound;

        }

        public String getSceneID() {
            return sceneID;
        }

        public String getText() {
            return text;
        }

        public String getPreviousScene() {
            return previousScene;
        }

        public String getChoice1() {
            return choice1;
        }
        public String getChoice1Title(){
            return choice1Title;
        }

        public String getChoice2() {
            return choice2;
        }

        public String getChoice2Title(){
            return choice2Title;
        }

        public int getImage(){return image;}




        public void setSceneID(String sceneID) {
            this.sceneID = sceneID;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setPreviousScene(String previousScene) {
            this.previousScene = previousScene;
        }

        public void setChoice1(String choice1) {
            this.choice1 = choice1;
        }

        public void setChoice1Title(String choice1Title){
            this.choice1Title=choice1Title;
        }

        public void setChoice2(String choice2) {
            this.choice2 = choice2;
        }

        public void setChoice2Title(String choice2Title){
            this.choice2Title=choice2Title;
        }

        public void setImage(int image){
            this.image=image;
        }


    }

    ArrayList<scene> sceneArray=new ArrayList<scene>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);

        scene s1=new scene("0","Kolb took his favorite axe and shield and walked to the pass, where he found a cold cave, a windy cave, and a narrow trail.",
                "-1","1","Enter the cold cave ","2","Walk up the trail",R.mipmap.skyrimcity,R.raw.skyrim);

        scene s2=new scene("1","Kolb stepped into the frozen cave, but his Nord blood kept him warm. A smelly tunnel climbed ahead of him, and wind howled from another to his left. A ladder was nearby as well."
                ,
                "0","3","Not Finished Yet","4","Not finished yet",R.mipmap.icecave,R.raw.skyrim);

        scene s3=new scene("2","\n" +
                "Climbing up, Kolb found a camp. He met a wise man who shared bread and showed two paths to the dragon's lair. One went through the hills, the other through a marsh.",
                "0","5","Not finished Yet","6","Not finished yet",R.mipmap.trail,R.raw.skyrim);


        sceneArray.add(s1);
        sceneArray.add(s2);
        sceneArray.add(s3);

        TextView t1=(TextView)findViewById(R.id.textView);
        t1.setText(sceneArray.get(0).text);
        t1.setMovementMethod(new ScrollingMovementMethod());
        Button b1=(Button)findViewById(R.id.choice1);
        b1.setText(""+sceneArray.get(0).getChoice1Title());
        Button b2=(Button)findViewById(R.id.choice2);
        b2.setText(""+sceneArray.get(0).getChoice2Title());
        t1.setCompoundDrawablesWithIntrinsicBounds(0,sceneArray.get(0).image,0,0);
        TextViewCompat.setAutoSizeTextTypeWithDefaults(t1,TextViewCompat.AUTO_SIZE_TEXT_TYPE_UNIFORM);


    }

    public void choice1(View view){
//        mediaPlayer.stop();
        ScrollView s1=(ScrollView)findViewById(R.id.scrollID) ;
        s1.scrollTo(0, 0);
        TextView t1=(TextView)findViewById(R.id.textView);
        Button b1=(Button)findViewById(R.id.choice1);
        Button b2=(Button)findViewById(R.id.choice2);

        String choice1= sceneArray.get(counter).getChoice1();
        for(int i=0;i<sceneArray.size();i++){
            if(choice1.equals(sceneArray.get(i).getSceneID())){
                t1.setText(sceneArray.get(i).getText());
                b1.setText(sceneArray.get(i).getChoice1Title());
                b2.setText(sceneArray.get(i).getChoice2Title());
                t1.setCompoundDrawablesWithIntrinsicBounds(0,sceneArray.get(i).image,0,0);

                counter=i;
            }
        }


    }

    public void choice2(View view){
     //   mediaPlayer.stop();
        ScrollView s1=(ScrollView)findViewById(R.id.scrollID) ;
        s1.scrollTo(0, 0);
        TextView t1=(TextView)findViewById(R.id.textView);
        Button b1=(Button)findViewById(R.id.choice1);
        Button b2=(Button)findViewById(R.id.choice2);

        String choice2= sceneArray.get(counter).getChoice2();
        for(int i=0;i<sceneArray.size();i++){
            if(choice2.equals(sceneArray.get(i).getSceneID())){
                t1.setText(sceneArray.get(i).getText());
                b1.setText(sceneArray.get(i).getChoice1Title());
                b2.setText(sceneArray.get(i).getChoice2Title());
                t1.setCompoundDrawablesWithIntrinsicBounds(0,sceneArray.get(i).image,0,0);

                counter=i;
            }
        }

    }

    public void back(View view){
     //   mediaPlayer.stop();
        ScrollView s1=(ScrollView)findViewById(R.id.scrollID) ;
        s1.scrollTo(0, 0);


        TextView t1=(TextView)findViewById(R.id.textView);
        Button b1=(Button)findViewById(R.id.choice1);
        Button b2=(Button)findViewById(R.id.choice2);
        String previous=sceneArray.get(counter).previousScene;
        for(int i=0;i<sceneArray.size();i++){
            if(previous.equals(sceneArray.get(i).getSceneID())){
                t1.setText(sceneArray.get(i).getText());
                b1.setText(sceneArray.get(i).getChoice1Title());
                b2.setText(sceneArray.get(i).getChoice2Title());
                t1.setCompoundDrawablesWithIntrinsicBounds(0,sceneArray.get(i).image,0,0);

                counter=i;
            }
            else if(Integer.parseInt(previous)<0) {
               // mediaPlayer.stop();
                this.finish();
            }
        }
    }

    public void imageZoom(View view){

        TextView t1=(TextView)findViewById(R.id.textView);
        Intent change=new Intent(MainActivity.this,MainActivity2.class);
        change.putExtra("DrawableInt",sceneArray.get(counter).image);

        startActivity(change);






    }
}

