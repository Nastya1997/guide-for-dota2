package com.company;

import java.util.ArrayList;

public class InitHelper {
    protected ArrayList<Hero> strength = new ArrayList<>();
    protected ArrayList<Hero> agility = new ArrayList<>();
    protected ArrayList<Hero> intelligence = new ArrayList<>();
    protected ArrayList<Hero> heroes = new ArrayList<>();

    public void initHeroes() {
        initStrengthHeroes();
        initAgilityHeroes();
        initIntelligenceHeroes();
        heroes.addAll(strength);
        heroes.addAll(agility);
        heroes.addAll(intelligence);
    }

    public void initStrengthHeroes(){
        strength.add(new Hero("Abbadon", true, false, false, 325));
        strength.add(new Hero("ALESHA", true, false, false, 325));
        strength.add(new Hero("Doom", true, false, true, 285));
        strength.add(new Hero("Pudge", true, false, true, 280));
    }

    public void initAgilityHeroes(){
        agility.add(new Hero("Phantom Assassin", false, true, true, 305));
        agility.add(new Hero("Shadow Fiend", true, false, false, 305));
        agility.add(new Hero("Viper", true, false, false, 275));
        agility.add(new Hero("Weaver", true, true, false, 275));
    }

    public void initIntelligenceHeroes() {
        intelligence.add(new Hero("Ancient Apparition", true, false, false, 285));
        intelligence.add(new Hero("Bane", false, false, true, 305));
    }
}
