package com.example.populargame;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Holder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ImageView mImageView;
    TextView mTitle, mDes;
    ItemClick itemClickListener;

    Holder(@NonNull View itemView) {
        super(itemView);

        this.mImageView = itemView.findViewById(R.id.image1);
        this.mTitle = itemView.findViewById(R.id.titleText);
        this.mDes = itemView.findViewById(R.id.descriptionTv);

        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        this.itemClickListener.onItemClick(v, getLayoutPosition());

    }

    public void setItemClickListener(ItemClick ic){

        this.itemClickListener = ic;

    }
}
