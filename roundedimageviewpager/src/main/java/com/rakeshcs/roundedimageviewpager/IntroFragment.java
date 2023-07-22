package com.rakeshcs.roundedimageviewpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * Created by gleecusdev on 18/04/17.
 */

public class IntroFragment extends Fragment {

    Intro intro;
    ImageView imgView;
    private TextView txtViewSub, txtView;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_intro_item,
                null);

        imgView = (ImageView) rootView.findViewById(R.id.imgView);

        intro = getArguments().getParcelable("intro");
        int pos = getArguments().getInt("pos");

        imgView.setImageResource(intro.getIcon());
        return rootView;
    }

}
