package com.company;

public class Main {

    public static void main(String[] args) {
        Boss murat = new Boss();
        murat.setHealth(500);
        murat.setDamage(200);
        murat.setShit("Protection");
        System.out.println("Mурат здоровье:" + murat.getHealth() + " урон:" + murat.getDamage() + " защита:" + murat.getShit());
        creatHeroes();
    }

    public static Hero[] creatHeroes() {
        Hero venom = new Hero("venom", 400, 100, "iron");
        Hero invisible = new Hero("invisidle", 600, 300, "ignorant");
        Hero aquamen = new Hero("aquamen", 500, 300);
        Hero[] heroes = {venom, invisible, aquamen};
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].getName() + " " + heroes[i].getHaelth() + "здоровье " + heroes[i].getDamage() + "урон " + heroes[i].getPower() + "");

        }
        return heroes;
    }


}
