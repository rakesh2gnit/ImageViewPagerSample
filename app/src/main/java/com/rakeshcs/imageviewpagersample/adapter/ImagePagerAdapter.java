package com.rakeshcs.imageviewpagersample.adapter;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.rakeshcs.imageviewpagersample.fragment.ImageFragment;
import com.rakeshcs.imageviewpagersample.model.ImageDetail;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gleecusdev on 18/04/17.
 */

public class ImagePagerAdapter extends FragmentStatePagerAdapter {

    Context mCtx;
    List<ImageDetail> imageList = new ArrayList<>();

    public ImagePagerAdapter(FragmentManager fm, Context ctx, List<ImageDetail> imageList) {
        super(fm);
        this.mCtx = ctx;
        this.imageList = imageList;
    }

    @Override
    public int getCount() {
        return imageList.size();
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag = new ImageFragment();
        Bundle args = new Bundle();
        args.putParcelable("image", imageList.get(position));
        args.putInt("pos", position);
        frag.setArguments(args);
        return frag;
    }

    public void setStoreList(List<ImageDetail> storeList) {
        this.imageList = new ArrayList<ImageDetail>(storeList);
//        Singleton.getInstance().setFilteredNetworkPostList(mNetworkPostList);
        notifyDataSetChanged();
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }
}
