package com.yunwei.map.greedao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "TRACK_POINT".
 */
public class TrackPoint {

    private Long time;
    private Double lat;
    private Double lng;
    private Double x;
    private Double y;
    private Float speed;
    private Float gpsSpeed;
    private Double distance;
    private String Provider;

    public TrackPoint() {
    }

    public TrackPoint(Long time, Double lat, Double lng, Double x, Double y, Float speed, Float gpsSpeed, Double distance, String Provider) {
        this.time = time;
        this.lat = lat;
        this.lng = lng;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.gpsSpeed = gpsSpeed;
        this.distance = distance;
        this.Provider = Provider;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }

    public Float getGpsSpeed() {
        return gpsSpeed;
    }

    public void setGpsSpeed(Float gpsSpeed) {
        this.gpsSpeed = gpsSpeed;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getProvider() {
        return Provider;
    }

    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

}
