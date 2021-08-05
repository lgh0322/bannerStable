package com.vaca.bannerstable;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;

import com.bigkoo.convenientbanner.holder.Holder;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;


public class LocalImageHolderView extends Holder<Da> {

    private ImageView iv;

    public LocalImageHolderView(View itemView) {
        super(itemView);
    }

    @Override
    protected void initView(View itemView) {
        iv = itemView.findViewById(R.id.iv_item_banner);

    }

    @Override
    public void updateUI(Da data) {
        int[] gg = {R.drawable.g1, R.drawable.g2, R.drawable.g3};
        Glide.with(itemView.getContext())
                .load(gg[data.getC()])
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(iv);


    }
}