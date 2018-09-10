package com.example.linhnb.androidcore.utils;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public final class BindingUtils {

    private BindingUtils() {
    }

    /**
     * setAdapter For RecyclerView
     */
    @BindingAdapter({"recyclerAdapter"})
    public static void setAdapterForRecyclerView(RecyclerView recyclerView,
                                                 RecyclerView.Adapter adapter) {
        recyclerView.setAdapter(adapter);
    }

    @BindingAdapter({"app:setImageWithGlide"})
    public static void setImageWithGlide(ImageView imageView, int img) {
        Glide.with(imageView.getContext())
                .load(img)
                .into(imageView);
    }
}
