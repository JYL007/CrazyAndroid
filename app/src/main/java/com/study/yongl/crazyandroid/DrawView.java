package com.study.yongl.crazyandroid;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class DrawView extends View
{
    public float currentX=40;
    public float currentY=50;
    Paint paint=new Paint();
    public DrawView(Context context) {
        super(context);
    }
    public DrawView(Context context,AttributeSet attrs) {
        super(context, attrs);
    }
    @Override
    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        paint.setColor(Color.RED);
        canvas.drawCircle(currentX,currentY,15,paint);
    }
}
