package com.company;

public class Hero {
    private int haelth;
    private int damage;
    private  String power;
    private String name;
    public Hero(String name,int haelth, int damage, String power) {
        this.haelth = haelth;
        this.damage = damage;
        this.power = power;
        this.name = name;
    }

    public Hero(String name, int haelth, int damage) {
        this.haelth = haelth;
        this.damage = damage;
        this.name=name;
    }

    public int getHaelth() {
        return haelth;
    }

    public int getDamage() {
        return damage;
    }

    public String getPower() {
        return power;
    }
    public String getName() {
        return name;
    }
}
