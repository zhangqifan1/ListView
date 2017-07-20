package com.example.administrator.listview;

/**
 * Created by Administrator on 2017/7/20.
 */

public class Bean {
    String title,ImageUrl;
//    int type;

    public Bean(String title, String imageUrl) {
        this.title = title;
        ImageUrl = imageUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }


    public String getTitle() {

        return title;
    }

    public String getImageUrl() {
        return ImageUrl;
    }


    public Bean() {
    }
}
