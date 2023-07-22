package com.rakeshcs.imageviewpagersample.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.rakeshcs.imageviewpagersample.R;
import com.rakeshcs.imageviewpagersample.model.ImageDetail;
import com.squareup.picasso.Picasso;

/**
 * Created by gleecusdev on 18/04/17.
 */

public class ImageFragment extends Fragment {

    ImageDetail imageDetail;
    ImageView imgView;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_item,
                null);

        imgView = (ImageView) rootView.findViewById(R.id.imgView);

        imageDetail = getArguments().getParcelable("image");
        int pos = getArguments().getInt("pos");

        Picasso.with(getActivity()).load(imageDetail.getImageDesktop()).into(imgView);

        return rootView;
    }

}
