package com.study.yongl.crazyandroid;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class FrameLayoutView extends Activity {

    private int currentColor=0;
    final int[] colors=new int[]{
            R.color.color1,
            R.color.color2,
            R.color.color3,
            R.color.color4,
            R.color.color5,
            R.color.color6,
            R.color.color7
    };
    final int[] names=new int[]
    {
            R.id.textView01,
            R.id.textView02,
            R.id.textView03,
            R.id.textView04,
            R.id.textView05,
            R.id.textView06,
            R.id.textView07
    };
    TextView[] views=new TextView[7];

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_frame);
        for(int i=0;i<7;i++)
        {
            views[i]=(TextView)findViewById(names[i]);
        }
        final Handler handler=new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                if(msg.what==0x1122)
                {
                    for(int i=0;i<7-currentColor;i++)
                    {
                        views[i].setBackgroundResource(colors[i+currentColor]);
                    }
                    for(int i=7-currentColor,j=0;i<7;i++,j++)
                    {
                        views[i].setBackgroundResource(colors[j]);
                    }
                }
                super.handleMessage(msg);
            }
        };
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                currentColor++;
                if(currentColor>=6)
                {
                    currentColor=0;
                }
                Message m=new Message();
                m.what=0x1122;
                handler.sendMessage(m);
            }
        },0,100);
    }
}
