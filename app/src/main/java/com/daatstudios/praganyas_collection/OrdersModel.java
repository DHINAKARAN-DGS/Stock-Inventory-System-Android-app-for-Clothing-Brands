package com.daatstudios.praganyas_collection;

public class OrdersModel {
    String title,price,s,l,m,xl,xxl,xxxl,xl4,xl5,fs;

    public OrdersModel(String title, String price, String s, String l, String m, String xl, String xxl, String xxxl, String xl4, String xl5, String fs) {
        this.title = title;
        this.price = price;
        this.s = s;
        this.l = l;
        this.m = m;
        this.xl = xl;
        this.xxl = xxl;
        this.xxxl = xxxl;
        this.xl4 = xl4;
        this.xl5 = xl5;
        this.fs = fs;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getL() {
        return l;
    }

    public void setL(String l) {
        this.l = l;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public String getXl() {
        return xl;
    }

    public void setXl(String xl) {
        this.xl = xl;
    }

    public String getXxl() {
        return xxl;
    }

    public void setXxl(String xxl) {
        this.xxl = xxl;
    }

    public String getXxxl() {
        return xxxl;
    }

    public void setXxxl(String xxxl) {
        this.xxxl = xxxl;
    }

    public String getXl4() {
        return xl4;
    }

    public void setXl4(String xl4) {
        this.xl4 = xl4;
    }

    public String getXl5() {
        return xl5;
    }

    public void setXl5(String xl5) {
        this.xl5 = xl5;
    }

    public String getFs() {
        return fs;
    }

    public void setFs(String fs) {
        this.fs = fs;
    }
}
