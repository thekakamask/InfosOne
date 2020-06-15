package com.example.infosone;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Date;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<Article> mesArticles;
    private InterIntent mInterIntent;
    private Article mArticle;


    public Adapter(List<Article> mesArticles, InterIntent interIntent) {
        this.mesArticles = mesArticles;
        this.mInterIntent = interIntent;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int resource = mesArticles.get(position).getCovertPic();
        String title = mesArticles.get(position).getTitle();
        String origins = mesArticles.get(position).getOrigins();
        String author = mesArticles.get(position).getAuthor();
        Date date = mesArticles.get(position).getDate();
        holder.setData(resource, origins, title, author, date);


    }

    @Override
    public int getItemCount() {
        return mesArticles.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {


        private TextView mSource;
        private TextView mTitle;
        private ImageView mImageView;
        private TextView mAuthor;
        private TextView mDate;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mSource = itemView.findViewById(R.id.text_View);
            mTitle = itemView.findViewById(R.id.text_View2);
            mImageView = itemView.findViewById(R.id.image_View);
            mAuthor = itemView.findViewById(R.id.text_View3);
            mDate = itemView.findViewById(R.id.text_View4);
        }

        private void setData(int resource, String sourceText, String titleText, String authorText, Date dateText ) {
            mImageView.setImageResource(resource);
            mImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        mInterIntent.GotoSecondActivity(mArticle);
                }
            });
            mSource.setText(sourceText);
            mTitle.setText(titleText);
            mAuthor.setText(authorText);
            //mDate.setText(dateText);
            mDate.setText("21/10/1993");
        }
    }

}

