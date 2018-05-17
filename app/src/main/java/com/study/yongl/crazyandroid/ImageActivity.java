package com.study.yongl.crazyandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ImageActivity extends Activity {

    int[] images=new int[]
    {
         R.drawable.image_1,
         R.drawable.image_2,
         R.drawable.image_3,
         R.drawable.image_4,
         R.drawable.image_5,
         R.drawable.image_6,
    };
    int currentImg=0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        LinearLayout main=(LinearLayout)findViewById(R.id.root);
        final ImageView image=new ImageView(this);
        image.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        main.addView(image);

        image.setImageResource(images[0]);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(images[++currentImg%images.length]);
            }
        });
    }
}
