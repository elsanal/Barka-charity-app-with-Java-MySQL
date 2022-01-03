package com.example.barka;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder>
{

    private ArrayList<Post> posts;

    PostClicked activity;


    public PostAdapter (Context context, ArrayList<Post> list ){

        posts = list;
        activity = (PostClicked) context;
    }

    public interface PostClicked {
        void onPostClicked(int index);
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView ivPic;
        TextView tvShortDesc;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivPic = itemView.findViewById(R.id.ivPic);
            tvShortDesc = itemView.findViewById(R.id.tvShortDesc);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    activity.onPostClicked(posts.indexOf((Post) view.getTag()));
                }

            });
        }
    }

    @NonNull
    @Override
    public PostAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.items, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PostAdapter.ViewHolder holder, int position) {
        holder.itemView.setTag(posts.get(position));
        holder.tvShortDesc.setText(posts.get(position).getDescription());

        switch (posts.get(position).getCategory().toString())
        {
            case "Electronics":
                holder.ivPic.setImageResource(R.drawable.computer);
                break;
            case "Books":
                holder.ivPic.setImageResource(R.drawable.book);
                break;
            case "Clothes":
                holder.ivPic.setImageResource(R.drawable.clothes);
                break;
            case "Shoes":
                holder.ivPic.setImageResource(R.drawable.shoe);
                break;
            case "Furniture":
                holder.ivPic.setImageResource(R.drawable.furniture);
                break;
            default:
                holder.ivPic.setImageResource(R.drawable.motobike);
        }

    }

    @Override
    public int getItemCount() {
        return posts.size();
    }
}
