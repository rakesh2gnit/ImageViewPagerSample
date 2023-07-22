package com.rakeshcs.roundedimageviewpager;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gleecusdev on 18/04/17.
 */

public class IntroPagerAdapter extends FragmentStatePagerAdapter {

    Context mCtx;
    List<Intro> introList = new ArrayList<>();

    public IntroPagerAdapter(FragmentManager fm, Context ctx, List<Intro> introList) {
        super(fm);
        this.mCtx = ctx;
        this.introList = introList;
    }

    @Override
    public int getCount() {
        return introList.size();
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag = new IntroFragment();
        Bundle args = new Bundle();
        args.putParcelable("intro", introList.get(position));
        args.putInt("pos", position);
        frag.setArguments(args);
        return frag;
    }

    public void setStoreList(List<Intro> storeList) {
        this.introList = new ArrayList<Intro>(storeList);
//        Singleton.getInstance().setFilteredNetworkPostList(mNetworkPostList);
        notifyDataSetChanged();
    }

    @Override
    public int getItemPosition(Object object) {
        // TODO Auto-generated method stub
        return POSITION_NONE;
    }
}
