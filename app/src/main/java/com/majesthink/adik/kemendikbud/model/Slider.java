package com.majesthink.adik.kemendikbud.model;

public class Slider {

    private String title, SLIDER_THUMBNAIL;

    public Slider(){

    }

    public Slider(String title, String SLIDER_THUMBNAIL) {
        this.title = title;
        this.SLIDER_THUMBNAIL = SLIDER_THUMBNAIL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSLIDER_THUMBNAIL() {
        return SLIDER_THUMBNAIL;
    }

    public void setSLIDER_THUMBNAIL(String SLIDER_THUMBNAIL) {
        this.SLIDER_THUMBNAIL = SLIDER_THUMBNAIL;
    }
}
