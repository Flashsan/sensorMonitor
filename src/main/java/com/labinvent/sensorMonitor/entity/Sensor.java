package com.labinvent.sensorMonitor.entity;

import javax.persistence.*;

@Entity
@Table(name = "sensor")
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "model")
    private String model;

    @Column(name = "range_from")
    private long rangeFrom;

    @Column(name = "range_to")
    private long rangeTo;

    @Column(name = "type")
    private long type;

    @Column(name = "unit")
    private long unit;

    @Column(name = "location")
    private String location;

    @Column(name = "description")
    private String description;

    public Sensor() {
    }

    public Sensor(long id, String name, String model, long rangeFrom, long rangeTo, long type, long unit, String location, String description) {
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

    @Override
    public String toString() {
        return "Sensor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", rangeFrom=" + rangeFrom +
                ", rangeTo=" + rangeTo +
                ", type=" + type +
                ", unit=" + unit +
                ", location='" + location + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
