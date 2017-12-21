package com.example.droodsunny.viplayer;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by DroodSunny on 2017/12/20.
 */

public class playerAdapter extends RecyclerView.Adapter<playerAdapter.ViewHolder>{


    private List<String> mList;


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        String title=mList.get(position);
        holder.title.setText(title);

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
    public playerAdapter(List<String> listtltle){
        mList=listtltle;

    }
    class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView mImageView;
        private TextView title;
        public ViewHolder(View itemView) {
            super(itemView);
            mImageView=itemView.findViewById(R.id.image);
            title=itemView.findViewById(R.id.title);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });

        }

    }
}
