package com.rakeshcs.roundedimageviewpager;

/**
 * Created by gleecus on 30/12/16.
 */

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;


public class ViewIntroSliderScreens extends AppCompatActivity implements View.OnClickListener {

    //private IntroSliderFragmentAdapter mAdapter;
    private IntroPagerAdapter mAdapter;
    private ViewPager mViewPager;
    private TextView ib_cancel, ib_next;
    private boolean lastSlide=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewintroslider);

        //tv_Done = (TextView) findViewById(R.id.tv_Done);
        ib_cancel = (TextView) findViewById(R.id.tutorial_cancel);
        //ib_cancel.setBackgroundColor(0x00000000);
        ib_cancel.setOnClickListener(this);

        ib_next = (TextView) findViewById(R.id.tutorial_next);
        //ib_next.setBackgroundColor(0x00000000);
        ib_next.setOnClickListener(this);

        //mAdapter = new IntroSliderFragmentAdapter(getSupportFragmentManager(),ib_next);
        mAdapter = new IntroPagerAdapter(getSupportFragmentManager(),this, generateData());
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mAdapter);

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int pos) {
                if (pos == mAdapter.getCount() - 1) {
                }

                if(pos==7){
                    ib_next.setText("DONE");
                    lastSlide=true;
                }
                else{
                    ib_next.setText("NEXT");
                    lastSlide=false;
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

    private ArrayList<Intro> generateData(){
        ArrayList<Intro> models = new ArrayList<Intro>();
        models.add(new Intro(R.drawable.intro_add_hotspot,"Add hotspots to your Images.","Want to highlight an area, object, person or context in your image?\nJust add a hotspot to it with a label."));
        models.add(new Intro(R.drawable.intro_add_attachments,"Enrich your Hotspots.\nMake them Interesting.","Add Media to them like url,audio,video or Images.Make them shine."));
        models.add(new Intro(R.drawable.intro_share_privately,"Sharing is Everything.\nShare Privately.","Share your hotspots “selectively” with your friends and groups on Rnyoo."));
        models.add(new Intro(R.drawable.intro_share_publicly,"Sharing is Everything.\nShare Publicly.","Want to show off your content outside your network?\nPost it to public feed."));
        return models;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tutorial_cancel:
                // if user is not logged in redirect him to Login Activity
                /*Intent i = new Intent(ViewIntroSliderScreens.this, LoginActivity.class);
                startActivity(i);
                finish();*/
                mViewPager.setCurrentItem(getItem(-1), true);
                break;

            case R.id.tutorial_next:
                /*if(lastSlide){
                    Intent iu = new Intent(ViewIntroSliderScreens.this, LoginActivity.class);
                    startActivity(iu);
                    finish();
                }
                else {*/
                    mViewPager.setCurrentItem(getItem(+1), true);
                //}
                break;
        }
    }

    private int getItem(int i) {
        return mViewPager.getCurrentItem() + i;
    }
}
