package com.yi.oopprinciples;

public class Examples {

    // ABSTRACTION
//    public static class Hero {
//        int damage;
//        public void Talk(){
//            System.out.println("I am here to rescue you!");
//        }
//        public void getDamage(){
//            System.out.println(damage);
//        }
//        public void setDamage(int x){
//            damage = x;
//        }
//    }

    // INHERITANCE: The parent class's code extends to the child class if empty
    public static class WarriorHero extends Hero{
        // Whatever is coded here will override the parent class's code
        public void Talk(){
            System.out.println("I am a level 75 Elvin Warrior!");
        }
    }

    // POLYMORPHISM
    public static class MageHero extends Hero{
        public void Talk(){
            System.out.println("I am a magic man.");
        }
    }

    // ENCAPSULATION: Getters and Setters
    public static class Hero {
        int damage;
        public void Talk(){
            System.out.println("I am here to rescue you!");
        }
        public void getDamage(){
            System.out.println(damage);
        }
        public void setDamage(int x){
            damage = x;
        }
    }

}


