package ru.samsung.itschool.book.normalniy;

import android.graphics.Bitmap;

/**
 * Created by Максим on 10.03.2018.
 */

public class Museum {

    String name;
    String adress;
    String url;
    Bitmap poster;

    public Museum(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public Museum(String name, String adress, String url) {
        this.name = name;
        this.adress = adress;
        this.url = url;
    }

    public Museum() {

    }

    public Bitmap getPoster() {
        return poster;
    }

    public void setPoster(Bitmap poster) {
        this.poster = poster;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return adress;
    }

    public void setYear(String adress) {
        this.adress = adress;
    }
}
