package com.majesthink.adik.kemendikbud.model;

public class SliderDetail {

    private String name, SLIDER_IMG;

    public SliderDetail(){

    }

    public SliderDetail(String name, String SLIDER_IMG) {
        this.name = name;
        this.SLIDER_IMG = SLIDER_IMG;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSLIDER_IMG() {
        return SLIDER_IMG;
    }

    public void setSLIDER_IMG(String SLIDER_IMG) {
        this.SLIDER_IMG = SLIDER_IMG;
    }
}
