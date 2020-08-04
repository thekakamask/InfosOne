package com.example.infosone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    private TextView mTitle;
    private TextView mDate;
    private TextView mContent;
    private TextView mAuthor;
    private TextView mOrigins;
    private ImageView mCovertPic;
    private Button mReturnButton;
    //private NestedScrollView mScrollView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//recupere l'intent et les données

        Intent intent = getIntent();
        Article mArticle;
        mArticle = intent.getParcelableExtra("Article selection");

        String tiitre = mArticle.getTitle();
        String origine = mArticle.getOrigins();
        String auuteur = mArticle.getAuthor();
        String daate = mArticle.getDate();
        int couverture = mArticle.getCovertPic();
        String contenu = mArticle.getContent();




        //Intent intent = getIntent();
        //final Article mArticle = intent.getParcelableExtra("Article");


        mTitle = (TextView) findViewById(R.id.titre2);
        mTitle.setText(tiitre);
        mOrigins = (TextView) findViewById(R.id.source2);
        mOrigins.setText(origine);
        mAuthor = (TextView) findViewById(R.id.auteur2);
        mAuthor.setText(auuteur);
        mDate = (TextView) findViewById(R.id.date2);
        mDate.setText(daate);
        mCovertPic= (ImageView) findViewById(R.id.image2);
        mCovertPic.setImageResource(couverture);
        mContent = (TextView) findViewById(R.id.contenu);
        //mScrollView = (NestedScrollView) findViewById(R.id.scrollview1);
        mContent.setText(contenu);
        mContent.setMovementMethod(new ScrollingMovementMethod());

//        mScrollView.post(new Runnable() {
//            @Override
//            public void run() {
//                mScrollView.smoothScrollTo(0,mContent.getBottom());
//            }
//        });






    }




}