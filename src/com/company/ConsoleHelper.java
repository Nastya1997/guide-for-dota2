package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ConsoleHelper extends InitHelper {

    public void showMenu(){
        initHeroes();
        System.out.println("Выберете пункт меню:");
        System.out.println("0. Отсортировать героев по атрибутам (сила, ловкость, интеллект");
        System.out.println("1. Показать самых быстрых героев");
        System.out.println("2. Показать героев, кто станит");
        System.out.println("3. Показать самых медленных героев");
        System.out.println("4. Показать героев, у кого чистый урон");
        System.out.println("5. Показать героев, у кого магический урон");
        System.out.println("6. Показать героев, у кого физический урон");
        System.out.println("9. Выход");
        String userInput = null;
        userInput = getUserInput();
        switch (userInput) {
            case "0":
                printHeroes();
                break;
            case "1":
                fastestHero(heroes);
                break;
            case "2":
                stan();
                break;
            case "3":
                slowestHero(heroes);
                break;
            case "9":
                closeProgram();
                break;
            default:
                for(;;){
                    showMenu();}
        }
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

    private void printHeroes() {
        System.out.println("Strength");
        for(int i = 0; i < strength.size(); i++){
            System.out.println(strength.get(i).toString());
        }
        System.out.println();
        System.out.println("Agility");
        for(int i = 0; i < agility.size(); i++){
            System.out.println(agility.get(i).toString());
        }
        System.out.println();
        System.out.println("Intelligence");
        for(int i = 0; i < intelligence.size(); i++){
            System.out.println(intelligence.get(i).toString());
        }
        System.out.println();

        showMenu();
    }

    public void closeProgram(){
        System.exit(0);
    }

    public void fastestHero(ArrayList<Hero> attributes){
        //ArrayList<Integer> fastestHeroes = new ArrayList<>();

        String name = null;
        int speed = 0;

        for(int i = 0; i < attributes.size(); i++) {
            for (int j = 0; j < attributes.size(); j++){
                if (speed < attributes.get(j).getBaseMoveSpeed()) {
                    speed = attributes.get(j).getBaseMoveSpeed();
                    name = attributes.get(j).getName();
                    //fastestHeroes.add(i);
                }
            }
        }
        System.out.println(name + " " + speed);

        showMenu();
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

        showMenu();
    }

    public void stan() {
        System.out.println("что-то пошло не так, обратитесь к разработчику");
        showMenu();
    }
}
