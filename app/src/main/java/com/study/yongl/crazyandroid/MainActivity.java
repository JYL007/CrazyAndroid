package com.study.yongl.crazyandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int KEY=1000;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        LinearLayout layout=new LinearLayout(this);
        super.setContentView(layout);
        layout.setOrientation(LinearLayout.VERTICAL);
        final TextView show=new TextView(this);
        Button bn=new Button(this);
        Button bt=new Button(this);
        Button bt1=new Button(this);
        bn.setText("进入跟随小球");
        bt.setText("进入图片切换");
        bt1.setText("进入霓虹灯效果");
        bn.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
        bt.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
        bt1.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
        layout.addView(bn);
        layout.addView(bt);
        layout.addView(bt1);
        layout.addView(show);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setText(R.string.Hello+",Android,"+new java.util.Date());
                Intent intent=new Intent(MainActivity.this,CustomView.class);
                startActivity(intent);
            }
        });
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setText(R.string.Hello+",Android,"+new java.util.Date());
                Intent intent=new Intent(MainActivity.this,ImageActivity.class);
                startActivity(intent);
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setText(R.string.Hello+",Android,"+new java.util.Date());
                Intent intent=new Intent(MainActivity.this,FrameLayoutView.class);
                startActivity(intent);
            }
        });
    }
}
