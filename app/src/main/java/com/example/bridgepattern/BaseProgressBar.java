package com.example.bridgepattern;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

import java.security.Provider;

/**
 * Created by W on 2018/12/20.
 */

public abstract class BaseProgressBar {
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 0;
    public static final int CIRCLE = 0;

    protected Paint mPaint;

    /**
     * 构造方法内完成一些具体的初始化信息
     */
    protected BaseProgressBar(){
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);
    }
    /**
     * 获取测量高度，由具体子类实现
     */
    public abstract int getMeasureHeight();
    /**
     * 获取测量宽度，由具体子类实现
     */
    public abstract int getMeasureWidth();

    /**
     * 具体绘制操作，由具体子类实现
     */
    public abstract void draw(View view, Canvas canvas);
}
