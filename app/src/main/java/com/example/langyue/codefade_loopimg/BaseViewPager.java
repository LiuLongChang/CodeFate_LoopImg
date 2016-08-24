package com.example.langyue.codefade_loopimg;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by langyue on 16/8/23.
 */

public class BaseViewPager extends ViewPager {

    private boolean scrollable = true;

    public BaseViewPager(Context context){
        super(context);
    }

    public BaseViewPager(Context context, AttributeSet attrs){
        super(context,attrs);
    }

    //设置viewpager是否可以滑动
    public void setScrollable(boolean enable){
        scrollable = enable;
    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent event){

        if (scrollable){
            return super.onInterceptTouchEvent(event);
        }else{
            return false;
        }

    }


}
