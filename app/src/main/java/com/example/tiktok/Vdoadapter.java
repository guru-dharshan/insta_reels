package com.example.tiktok;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Vdoadapter extends RecyclerView.Adapter<Vdoadapter.VdoViewHolder>{
    List<Vdosetter> vdosetters=new ArrayList<>();
    Context context;

    public Vdoadapter(List<Vdosetter> vdosetters, Context context) {
        this.vdosetters = vdosetters;
        this.context = context;
    }

    @NonNull
    @Override
    public VdoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VdoViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.videoholder,parent,false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull final VdoViewHolder holder, int position) {
        holder.videoView.setVideoPath(vdosetters.get(position).getVodure());
        holder.title.setText(vdosetters.get(position).getDitle());
        holder.desc.setText(vdosetters.get(position).getDesc());
        holder.videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                holder.progressBar.setVisibility(View.GONE);
                mp.start();

            }
        });
        holder.videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                try {
                    mp.start();
                }catch (Exception e){

                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return vdosetters.size();
    }

    public static class VdoViewHolder extends RecyclerView.ViewHolder{
        VideoView videoView;
        ProgressBar progressBar;
        TextView title,desc;
        public VdoViewHolder(@NonNull View itemView) {
            super(itemView);
            videoView=itemView.findViewById(R.id.vdoview);
            progressBar=itemView.findViewById(R.id.progg);
            title=itemView.findViewById(R.id.titlee);
            desc=itemView.findViewById(R.id.descc);
        }
    }
}
