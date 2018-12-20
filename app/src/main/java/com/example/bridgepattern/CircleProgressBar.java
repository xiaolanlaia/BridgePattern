package com.example.bridgepattern;

import android.graphics.Canvas;
import android.view.View;

/**
 * Created by W on 2018/12/20.
 */

public class CircleProgressBar extends BaseProgressBar {
    @Override
    public int getMeasureHeight(){
        return 500;
    }
    @Override
    public int getMeasureWidth(){
        return 500;
    }
    @Override
    public void draw(View view, Canvas canvas){
        //这里可以进行具体的绘制水平进度条操作;
    }
}
