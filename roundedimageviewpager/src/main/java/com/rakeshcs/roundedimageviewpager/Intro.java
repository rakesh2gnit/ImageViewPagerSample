package com.rakeshcs.roundedimageviewpager;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by gleecus on 5/8/17.
 */

public class Intro implements Parcelable {

    private int icon;
    private String title;
    private String subtitle;


    public Intro(int icon, String title, String subtitle) {
        this.icon = icon;
        this.title = title;
        this.subtitle = subtitle;
    }

    protected Intro(Parcel in) {
        icon = in.readInt();
        title = in.readString();
        subtitle = in.readString();
    }

    public static final Creator<Intro> CREATOR = new Creator<Intro>() {
        @Override
        public Intro createFromParcel(Parcel in) {
            return new Intro(in);
        }

        @Override
        public Intro[] newArray(int size) {
            return new Intro[size];
        }
    };

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(icon);
        dest.writeString(title);
        dest.writeString(subtitle);
    }
}
