package com.example.tiktok;

public class Vdosetter {
    String vodure;
    String ditle;
    String desc;

    public Vdosetter() {
    }

    public Vdosetter(String vodure, String ditle, String desc) {
        this.vodure = vodure;
        this.ditle = ditle;
        this.desc = desc;
    }

    public String getVodure() {
        return vodure;
    }

    public void setVodure(String vodure) {
        this.vodure = vodure;
    }

    public String getDitle() {
        return ditle;
    }

    public void setDitle(String ditle) {
        this.ditle = ditle;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
