package com.samdev.submission;


public class Place {
    private String nama;
    private String desc;
    private int photo;

    public String getName() {
        return nama;
    }
    public void setName(String nama) {
        this.nama = nama;
    }
    public String getFrom() {
        return desc;
    }
    public void setFrom(String desc) {
        this.desc = desc;
    }

    int getPhoto() {
        return photo;
    }
    void setPhoto(int photo) {
        this.photo = photo;
    }

}
