package com.project.clapp.models;

import org.parceler.Parcel;

import java.util.ArrayList;

/**
 * Created by ruigo on 12/03/2018.
 */

@Parcel
public class Event {

    public String id;
    public String name;
    public String uID;
    public String imgURL;
    public String place;
    public String local;
    public double latitude;
    public double longitude;
    public String date;
    public String time;
    public String duration;
    public String descr;
    public int numRegister;
    public int maxRegisters;
    public double priceEvent;
    public ArrayList<String> tags;
    public ArrayList<String> userList;

    public Event() {}

    public Event(String id, String name, String uID, String imgURL, String place, String local, double latitude, double longitude, String date, String time, String duration, String descr, int numRegister, int maxRegisters, double priceEvent) {
        this.id = id;
        this.name = name;
        this.uID = uID;
        this.imgURL = imgURL;
        this.place = place;
        this.local = local;
        this.latitude = latitude;
        this.longitude = longitude;
        this.date = date;
        this.time = time;
        this.duration = duration;
        this.descr = descr;
        this.numRegister = numRegister;
        this.maxRegisters = maxRegisters;
        this.priceEvent = priceEvent;
    }

    public Event(String id, String name, String uID, String imgURL, String place, String local, double latitude, double longitude, String date, String time, String duration, String descr, ArrayList<String> userList, int numRegister, int maxRegisters, double priceEvent, ArrayList<String> tags) {
        this.id = id;
        this.name = name;
        this.uID = uID;
        this.imgURL = imgURL;
        this.place = place;
        this.local = local;
        this.latitude = latitude;
        this.longitude = longitude;
        this.date = date;
        this.time = time;
        this.duration = duration;
        this.descr = descr;
        this.userList = userList;
        this.numRegister = numRegister;
        this.maxRegisters = maxRegisters;
        this.priceEvent = priceEvent;
        this.tags = tags;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getuID() {
        return uID;
    }

    public void setuID(String uID) {
        this.uID = uID;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public ArrayList<String> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<String>userList) { this.userList = userList; }

    public int getNumRegister() {
        return numRegister;
    }

    public void setNumRegister(int numRegister) {
        this.numRegister = numRegister;
    }

    public int getMaxRegisters() {
        return maxRegisters;
    }

    public void setMaxRegisters(int maxRegisters) {
        this.maxRegisters = maxRegisters;
    }

    public double getPriceEvent() {
        return priceEvent;
    }

    public void setPriceEvent(double priceEvent) {
        this.priceEvent = priceEvent;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
