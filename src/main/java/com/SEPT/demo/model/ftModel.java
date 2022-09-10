package com.SEPT.demo.model;

public class ftModel {
    private int id;
    private String name;
    private String desc;
    private double rate;

    public ftModel() {

    }

    public ftModel(int id, String name, String desc, double rate) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.rate = rate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Item [id=" + id + ", name=" + name + ", desc=" + desc + ", rate=" + rate + "]";
    }

}
