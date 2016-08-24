package com.example.langyue.codefade_loopimg;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;

import static android.content.ContentValues.TAG;

/**
 * Created by langyue on 16/8/23.
 */

public class ViewFactory {

    public static ImageView getImageView(Context context,String url){

        ImageView imageView = (ImageView) LayoutInflater.from(context).inflate(R.layout.view_banner,null);
        ImageLoader.getInstance().displayImage(url, imageView, new ImageLoadingListener() {
            @Override
            public void onLoadingStarted(String s, View view) {
                Log.i("TAG_Img", "onLoadingStarted: ");
            }

            @Override
            public void onLoadingFailed(String s, View view, FailReason failReason) {
                Log.i("TAG_Img","onLoadingFailed: ");
            }

            @Override
            public void onLoadingComplete(String s, View view, Bitmap bitmap) {
                Log.i("TAG_Img", "onLoadingComplete: ");
            }

            @Override
            public void onLoadingCancelled(String s, View view) {
                Log.i("TAG_Img", "onLoadingCancelled: ");
            }
        });

        Log.d(TAG, "getImageView:" + url);

        return imageView;
    }


}
