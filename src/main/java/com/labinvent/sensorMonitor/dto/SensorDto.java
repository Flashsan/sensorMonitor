package com.labinvent.sensorMonitor.dto;


import java.io.Serializable;

public class SensorDto implements Serializable {
    private long id;
    private String name;
    private String model;
    private long rangeFrom;
    private long rangeTo;
    private long type;
    private long unit;
    private String location;
    private String description;

    public SensorDto() {

    }

    public SensorDto(long id, String name, String model, long rangeFrom, long rangeTo, long type, long unit, String location, String description) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.rangeFrom = rangeFrom;
        this.rangeTo = rangeTo;
        this.type = type;
        this.unit = unit;
        this.location = location;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getRangeFrom() {
        return rangeFrom;
    }

    public void setRangeFrom(long rangeFrom) {
        this.rangeFrom = rangeFrom;
    }

    public long getRangeTo() {
        return rangeTo;
    }

    public void setRangeTo(long rangeTo) {
        this.rangeTo = rangeTo;
    }

    public long getType() {
        return type;
    }

    public void setType(long type) {
        this.type = type;
    }

    public long getUnit() {
        return unit;
    }

    public void setUnit(long unit) {
        this.unit = unit;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}