package com.majesthink.adik.kemendikbud.model;

public class Newest {
    private int id, size;
    private double rate;
    private String app_name, app_developer, app_icon;

    public Newest(){

    }

    public Newest(int id, String app_icon, String app_name, String app_developer, double rate, int size){

        this.id = id;
        this.app_icon = app_icon;
        this.app_name = app_name;
        this.app_developer = app_developer;
        this.rate = rate;
        this.size = size;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApp_icon() {
        return app_icon;
    }

    public void setApp_icon(String app_icon) {
        this.app_icon = app_icon;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getApp_name() {
        return app_name;
    }

    public void setApp_name(String app_name) {
        this.app_name = app_name;
    }

    public String getApp_developer() {
        return app_developer;
    }

    public void setApp_developer(String app_developer) {
        this.app_developer = app_developer;
    }
}
