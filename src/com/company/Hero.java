package com.company;

public class Hero {
    private String name;
    private boolean magicDamage;
    private boolean physDamage;
    private boolean cleanDamage;
    private int baseMoveSpeed;

    public Hero(String name, boolean magicDamage, boolean physDamage, boolean cleanDamage, int baseMoveSpeed){
        this.name = name;
        this.magicDamage = magicDamage;
        this.physDamage = physDamage;
        this.cleanDamage = cleanDamage;
        this.baseMoveSpeed = baseMoveSpeed;
    }

    public String getName() {
        return name;
    }

    public boolean isMagicDamage() {
        return magicDamage;
    }

    public boolean isPhysDamage() {
        return physDamage;
    }

    public boolean isCleanDamage() {
        return cleanDamage;
    }

    public int getBaseMoveSpeed() {
        return baseMoveSpeed;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", magicDamage=" + magicDamage +
                ", physDamage=" + physDamage +
                ", cleanDamage=" + cleanDamage +
                ", baseMoveSpeed=" + baseMoveSpeed +
                '}';
    }
}
