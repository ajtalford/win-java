package com.books;
import java.io.IOException;
import java.util.ArrayList;


public class BookStore {

    private String name;
    private String address;
    private int squareFeet;
    private String hasUsed;
    private boolean isOpened;

    public ArrayList<String> getTitles() {
        return titles;
    }

    public void setTitles(ArrayList<String> titles) {
        this.titles = titles;
    }

    private ArrayList<String> titles;
    private String hours;
    //  private boolean isOpenedWeekends;
    //  private boolean isOpenedSundays;
    //  private Date openTime;

    //  private Date closedTime;

    // Constructor
    public BookStore(String name, String address, int squareFeet, String hasUsed, boolean isOpened, String hours,
                     ArrayList<String> titles) {
        this.name = name;
        this.address = address;
        this.squareFeet = squareFeet;
        this.hasUsed = hasUsed;
        this.isOpened = isOpened;
        this.hours = hours;
        this.titles = titles;
        loadTitles();
    }

    public BookStore() {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public String isHasUsed() {
        return hasUsed;
    }

    public void setHasUsed(String hasUsed) {
        this.hasUsed = hasUsed;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }

    //    public boolean isOpenedWeekends() {
    //        return isOpenedWeekends;
    //    }
    //
    //    public void setOpenedWeekends(boolean openedWeekends) {
    //        isOpenedWeekends = openedWeekends;
    //    }
    //
    //    public boolean isOpenedSundays() {
    //        return isOpenedSundays;
    //    }
    //
    //    public void setOpenedSundays(boolean openedSundays) {
    //        isOpenedSundays = openedSundays;
    //    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getHasUsed() {
        return hasUsed;
    }

    private void loadTitles() {
        try {
            Utils.loadStringsToArray(this.titles);
        } catch (IOException e) {
            // for now simply init the array to zero
            System.out.println("Could not initilize the titles");
            // make sure it is empty
            this.titles = new ArrayList<String>();
        }
    }

    public void setTitles() {
    }
}



