package com.example;

import java.time.LocalDate;

@SuppressWarnings("unused")
public class Helyek {
    private String place;
    private String finish;


    public Helyek(String place, String finish) {
        this.place = place;
    }

    public Helyek() {
        //TODO Auto-generated constructor stub
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

}
