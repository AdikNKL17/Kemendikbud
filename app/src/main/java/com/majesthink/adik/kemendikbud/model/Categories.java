package com.majesthink.adik.kemendikbud.model;

public class Categories {
    private String name, CATEGORIES_ICON;

    public Categories(){

    }

    public Categories(String name, String CATEGORIES_ICON){
        this.name = name;
        this.CATEGORIES_ICON = CATEGORIES_ICON;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCATEGORIES_ICON() {
        return CATEGORIES_ICON;
    }

    public void setCATEGORIES_ICOM(String CATEGORIES_ICON) {
        this.CATEGORIES_ICON = CATEGORIES_ICON;
    }
}
