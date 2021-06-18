package com.example.tiktok;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ViewPager2 viewPager2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager2=findViewById(R.id.vieww);
        List<Vdosetter> vdosetterList=new ArrayList<>();
        String url="https://player.vimeo.com/external/434006896.sd.mp4?s=984d58cd076af082cf292bf84ee83cc792abe8f5&profile_id=165&oauth2_token_id=57447761";
        String url1="https://player.vimeo.com/external/464188780.sd.mp4?s=41eab155d41703c6959891f082bcc648b305d9af&profile_id=165&oauth2_token_id=57447761";
        String url2="https://player.vimeo.com/external/459370973.sd.mp4?s=18b9132f19180739875395fb97e745b7a3698593&profile_id=165&oauth2_token_id=57447761";
        String url3="https://player.vimeo.com/external/463427867.sd.mp4?s=c2be6e6813c998c16414d775e7878de05fc53e7e&profile_id=165&oauth2_token_id=57447761";
        String url4="https://player.vimeo.com/external/463788256.sd.mp4?s=c2016f96e37cbaa88b1081da4f8ee6a8b2a0e27d&profile_id=165&oauth2_token_id=57447761";
        Vdosetter vdosetter=new Vdosetter(url,"dev__gd","follow @dev__gd for android content");
        Vdosetter vdosetter1=new Vdosetter(url1,"dev__gd","follow @dev__gd for android content");
        Vdosetter vdosetter2=new Vdosetter(url2,"dev__gd","follow @dev__gd for android content");
        Vdosetter vdosetter3=new Vdosetter(url3,"dev__gd","follow @dev__gd for android content");
        Vdosetter vdosetter4=new Vdosetter(url4,"dev__gd","follow @dev__gd for android content");
        vdosetterList.add(vdosetter);
        vdosetterList.add(vdosetter1);
        vdosetterList.add(vdosetter2);
        vdosetterList.add(vdosetter3);
        vdosetterList.add(vdosetter4);
        Vdoadapter vdoadapter=new Vdoadapter(vdosetterList,MainActivity.this);
        viewPager2.setAdapter(vdoadapter);
    }
}