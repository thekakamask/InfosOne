package com.example.infosone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Date;

public class MainActivity2 extends AppCompatActivity {

    private Article mArticle;

    private TextView mTitle;
    private TextView mDate;
    private TextView mContent;
    private TextView mAuthor;
    private TextView mOrigins;
    private ImageView mCovertPic;
    private Button mReturnButton;

    public MainActivity2(Article article) {
        mArticle = article;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mTitle = (TextView) findViewById(R.id.titre2);
        mOrigins = (TextView) findViewById(R.id.source2);
        mAuthor = (TextView) findViewById(R.id.auteur2);
        mDate = (TextView) findViewById(R.id.date2);
        mCovertPic= (ImageView) findViewById(R.id.image2);
        mContent = (TextView) findViewById(R.id.contenu);
        mReturnButton = (Button) findViewById(R.id.button_return);

        makedata();

    }


    private void makedata (int resource, String sourceText, String titleText, String contentText, String authorText, Date dateText ) {
        mCovertPic.setImageResource(resource);
        mOrigins.setText(sourceText);
        mTitle.setText(titleText);
        mContent.setText(contentText);
        mAuthor.setText(authorText);
        //mDate.setText(dateText);
        mDate.setText("21/10/1993");
    }
}