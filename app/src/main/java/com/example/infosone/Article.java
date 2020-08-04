package com.example.infosone;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

public class Article implements Parcelable {

    private String mTitle;
    private String mOrigins;
    private String mContent;
    private String mAuthor;
    private String mDate;
    private int mCovertPic;




    public Article (int covertPic ,String title, String origins, String content, String author, String date){
        this.mTitle = title;
        this.mOrigins = origins;
        this.mContent = content;
        this.mAuthor = author;
        this.mDate = date;
        this.mCovertPic = covertPic;

//        this.setTitle(title);
//        this.setOrigins(origins);
//        this.setContent(content);
//        this.setAuthor(author);
//        this.setDate(date);
//        this.setCovertPic(covertPic);
    }


    public void setTitle(String title) {
        mTitle = title;
    }

    public void setOrigins(String origins) {
        mOrigins = origins;
    }

    public void setContent(String content) {
        mContent = content;
    }

    public void setAuthor(String author) {
        mAuthor = author;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public void setCovertPic(int covertPic) {
        mCovertPic = covertPic;
    }

    protected Article(Parcel in) {
        mTitle = in.readString();
        mOrigins = in.readString();
        mContent = in.readString();
        mAuthor = in.readString();
        mCovertPic = in.readInt();
        mDate = in.readString();
    }

    public static final Creator<Article> CREATOR = new Creator<Article>() {
        @Override
        public Article createFromParcel(Parcel in) {
            return new Article(in);
        }

        @Override
        public Article[] newArray(int size) {
            return new Article[size];
        }
    };

    public String getTitle(){
        return mTitle;
    }

    public String getOrigins() {
        return mOrigins;
    }

    public String getContent() {
        return mContent;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getDate() {
        return mDate;
    }

    public int getCovertPic() {
        return mCovertPic;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {


        dest.writeString(mTitle);
        dest.writeString(mOrigins);
        dest.writeString(mContent);
        dest.writeString(mAuthor);
        dest.writeInt(mCovertPic);
        dest.writeString(mDate);
    }
}


