
package com.rakeshcs.imageviewpagersample.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImageDetail implements Parcelable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("caption")
    @Expose
    private String caption;
    @SerializedName("image_desktop")
    @Expose
    private String imageDesktop;
    @SerializedName("image_desktop_retina")
    @Expose
    private String imageDesktopRetina;
    /*@SerializedName("response")
    @Expose
    private Object response;
    @SerializedName("time_taken")
    @Expose
    private Object timeTaken;
    @SerializedName("completed_at")
    @Expose
    private Object completedAt;*/
    @SerializedName("created_at")
    @Expose
    private Long createdAt;
    @SerializedName("focus_x")
    @Expose
    private Integer focusX;
    @SerializedName("focus_y")
    @Expose
    private Integer focusY;
    public final static Creator<ImageDetail> CREATOR = new Creator<ImageDetail>() {


        @SuppressWarnings({
            "unchecked"
        })
        public ImageDetail createFromParcel(Parcel in) {
            ImageDetail instance = new ImageDetail();
            instance.id = ((String) in.readValue((String.class.getClassLoader())));
            instance.position = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.caption = ((String) in.readValue((String.class.getClassLoader())));
            instance.imageDesktop = ((String) in.readValue((String.class.getClassLoader())));
            instance.imageDesktopRetina = ((String) in.readValue((String.class.getClassLoader())));
            //instance.response = ((Object) in.readValue((Object.class.getClassLoader())));
            //instance.timeTaken = ((Object) in.readValue((Object.class.getClassLoader())));
            //instance.completedAt = ((Object) in.readValue((Object.class.getClassLoader())));
            instance.createdAt = ((Long) in.readValue((Long.class.getClassLoader())));
            instance.focusX = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.focusY = ((Integer) in.readValue((Integer.class.getClassLoader())));
            return instance;
        }

        public ImageDetail[] newArray(int size) {
            return (new ImageDetail[size]);
        }

    }
    ;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ImageDetail() {
    }

    /**
     * 
     * @param response
     * @param position
     * @param id
     * @param focusX
     * @param imageDesktop
     * @param focusY
     * @param imageDesktopRetina
     * @param createdAt
     * @param timeTaken
     * @param caption
     * @param completedAt
     */
    public ImageDetail(String id, Integer position, String caption, String imageDesktop, String imageDesktopRetina, Object response, Object timeTaken, Object completedAt, Long createdAt, Integer focusX, Integer focusY) {
        super();
        this.id = id;
        this.position = position;
        this.caption = caption;
        this.imageDesktop = imageDesktop;
        this.imageDesktopRetina = imageDesktopRetina;
        /*this.response = response;
        this.timeTaken = timeTaken;
        this.completedAt = completedAt;*/
        this.createdAt = createdAt;
        this.focusX = focusX;
        this.focusY = focusY;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getImageDesktop() {
        return imageDesktop;
    }

    public void setImageDesktop(String imageDesktop) {
        this.imageDesktop = imageDesktop;
    }

    public String getImageDesktopRetina() {
        return imageDesktopRetina;
    }

    public void setImageDesktopRetina(String imageDesktopRetina) {
        this.imageDesktopRetina = imageDesktopRetina;
    }

    /*public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    public Object getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(Object timeTaken) {
        this.timeTaken = timeTaken;
    }

    public Object getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(Object completedAt) {
        this.completedAt = completedAt;
    }*/

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getFocusX() {
        return focusX;
    }

    public void setFocusX(Integer focusX) {
        this.focusX = focusX;
    }

    public Integer getFocusY() {
        return focusY;
    }

    public void setFocusY(Integer focusY) {
        this.focusY = focusY;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(position);
        dest.writeValue(caption);
        dest.writeValue(imageDesktop);
        dest.writeValue(imageDesktopRetina);
        /*dest.writeValue(response);
        dest.writeValue(timeTaken);
        dest.writeValue(completedAt);*/
        dest.writeValue(createdAt);
        dest.writeValue(focusX);
        dest.writeValue(focusY);
    }

    public int describeContents() {
        return  0;
    }

}
