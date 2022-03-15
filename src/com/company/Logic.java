package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Logic {
    ArrayList<Hero> strength = new ArrayList<>();
    ArrayList<Hero> agility = new ArrayList<>();
    ArrayList<Hero> intelligence = new ArrayList<>();
    ArrayList<Hero> heroes = new ArrayList<>();

    public void menuHandler(){
        startInit();
        System.out.println("Выберете пункт меню:");
        System.out.println("0. Отсортировать героев по атрибутам (сила, ловкость, интеллект");
        System.out.println("1. Выбрать категорию вопроса");
        System.out.println("9. Выход");
        String userInput = null;
        userInput = getUserInput();
        switch (userInput) {
            case "0":
                printStrengthHeroes();
                printAgilityHeroes();
                printIntelligenceHeroes();
                break;
            case "1":
                showSubMenu();
                break;
            case "9":
                closeProgram();
                break;
            default:
                for(;;){menuHandler();}
        }
    }

    public void startInit(){
        initStrengthHeroes();
        initAgilityHeroes();
        initIntelligenceHeroes();
        initHeroes();
    }

    public String getUserInput() {
        String inputLine = null;
        try{
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            inputLine = bf.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputLine;
    }

    public void initStrengthHeroes(){
        strength.add(new Hero("Abbadon", true, false, false, 325));
        strength.add(new Hero("ALESHA", true, false, false, 325));
        strength.add(new Hero("Doom", true, false, true, 285));
        strength.add(new Hero("Pudge", true, false, true, 280));


    }

    public void printStrengthHeroes() {
        System.out.println("Strength");
        for(int i = 0; i < strength.size(); i++){
            System.out.println(strength.get(i).toString());
        }
        System.out.println();
    }

    public void initAgilityHeroes(){
        agility.add(new Hero("Phantom Assassin", false, true, true, 305));
        agility.add(new Hero("Shadow Fiend", true, false, false, 305));
        agility.add(new Hero("Viper", true, false, false, 275));
        agility.add(new Hero("Weaver", true, true, false, 275));
    }

    public void printAgilityHeroes() {
        System.out.println("Agility");
        for(int i = 0; i < agility.size(); i++){
            System.out.println(agility.get(i).toString());
        }
        System.out.println();
    }

    public void initIntelligenceHeroes() {
        intelligence.add(new Hero("Ancient Apparition", true, false, false, 285));
        intelligence.add(new Hero("Bane", false, false, true, 305));
    }

    public void printIntelligenceHeroes() {
        System.out.println("Intelligence");
        for(int i = 0; i < intelligence.size(); i++){
            System.out.println(intelligence.get(i).toString());
        }
        System.out.println();

        continueProgram();
    }

    public void initHeroes() {
        heroes.addAll(strength);
        heroes.addAll(agility);
        heroes.addAll(intelligence);
    }

    public void showSubMenu(){
        System.out.println("0. Показать самых быстрых героев");
        System.out.println("1. Показать героев, кто станит");
        System.out.println("2. Показать самых медленных героев");
        System.out.println("3. Показать героев, у кого чистый урон");
        System.out.println("4. Показать героев, у кого магический урон");
        System.out.println("5. Показать героев, у кого физический урон");
        String userInput = null;
        userInput = getUserInput();
        switch (userInput) {
            case "0":
                initHeroes();
                fastestHero(heroes);
                break;
            case "1":
                stan();
                break;
            case "2":
                initHeroes();
                slowestHero(heroes);
                break;
            default:
                for(;;){showSubMenu();}
        }
    }

    public void continueProgram(){
        String userInput = null;
        System.out.println("Продолжить?");
        System.out.println("0. Да");
        System.out.println("1. Выход");
        userInput = getUserInput();
        switch (userInput){
            case "0":
                menuHandler();
                break;
            case "1":
                closeProgram();
                break;
            default:
                for (;;){continueProgram();}
        }
    }

    public void closeProgram(){
        System.exit(0);
    }

    public void fastestHero(ArrayList<Hero> attributes){
        //ArrayList<Integer> fastestHeroes = new ArrayList<>();

        String name = null;
        int speed = 0;

        for(int i = 0; i < attributes.size(); i++){
            if(speed < attributes.get(i).getBaseMoveSpeed()) {
                speed = attributes.get(i).getBaseMoveSpeed();
                name = attributes.get(i).getName();
                //fastestHeroes.add(i);
            }
        }
        System.out.println(name + " " + speed);

        continueProgram();
    }

    public void slowestHero(ArrayList<Hero> attributes) {
        String name = attributes.get(0).getName();
        int speed = attributes.get(0).getBaseMoveSpeed();

        for(int i = 0; i < attributes.size(); i++){
            if(speed > attributes.get(i).getBaseMoveSpeed()) {
                speed = attributes.get(i).getBaseMoveSpeed();
                name = attributes.get(i).getName();
            }
        }
        System.out.println(name + " " + speed);

        continueProgram();
    }

    public void stan() {
        System.out.println("что-то пошло не так, обратитесь к разработчику");
        continueProgram();
    }
}
