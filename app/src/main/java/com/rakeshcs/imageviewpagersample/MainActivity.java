package com.rakeshcs.imageviewpagersample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rakeshcs.imageviewpagersample.adapter.ImagePagerAdapter;
import com.rakeshcs.imageviewpagersample.connection.APIClient;
import com.rakeshcs.imageviewpagersample.connection.APIServices;
import com.rakeshcs.imageviewpagersample.model.ImageDetail;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button ib_cancel, ib_next;
    private ImagePagerAdapter mAdapter;
    List<ImageDetail> mImageList = new ArrayList<>();
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ib_cancel = (Button) findViewById(R.id.tutorial_cancel);
        ib_cancel.setOnClickListener(this);

        ib_next = (Button) findViewById(R.id.tutorial_next);
        ib_next.setOnClickListener(this);

        getImageList();

        //mAdapter = new IntroSliderFragmentAdapter(getSupportFragmentManager(),ib_next);
        mAdapter = new ImagePagerAdapter(getSupportFragmentManager(), this, mImageList);
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mAdapter);

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int pos) {
                if (pos == mAdapter.getCount() - 1) {
                }
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
            }

            @Override
            public void onPageScrollStateChanged(int arg0) {
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tutorial_cancel:
                mViewPager.setCurrentItem(getItem(-1), true);
                break;

            case R.id.tutorial_next:
                mViewPager.setCurrentItem(getItem(+1), true);
                break;
        }
    }

    private void getImageList() {
        //Creating an object of our api interface
        APIServices api = APIClient.getApiService();
        Call<List<ImageDetail>> call = api.getImageList();
        call.enqueue(new Callback<List<ImageDetail>>() {
            @Override
            public void onResponse(Call<List<ImageDetail>> call, Response<List<ImageDetail>> response) {
                if (response.isSuccessful()) {
                    mImageList.clear();
                    mImageList.addAll(response.body());
                    //Log.e("mImageList:",""+mImageList.size());
                    //Log.e("mImageList:",""+mImageList.get(0).getImageDesktop());
                    mAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<List<ImageDetail>> call, Throwable t) {

            }
        });
    }

    private int getItem(int i) {
        return mViewPager.getCurrentItem() + i;
    }
}