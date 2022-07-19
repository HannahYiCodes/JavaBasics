package com.yi.oopprinciples;

public class Main {
    public static void main(String[] args) {
//        Examples.Hero hero = new Examples.Hero();
//        hero.Talk(); // We do not care about the underlying implementation
        // ABSTRACTION: Its purpose is to call the method

        // INHERITANCE
//        Examples.WarriorHero w = new Examples.WarriorHero();
//        w.Talk();
//        m.Talk();

        //        Examples.Hero hero = new Examples.Hero();
//        hero.Talk(); // Calls the child class's code


        // POLYMORPHISM
//        Examples.WarriorHero w = new Examples.WarriorHero();
//        Examples.MageHero m = new Examples.MageHero();
//
//        Examples.Hero [] hero = {w, m};
//        hero[0].Talk();
//        hero[1].Talk(); // Calls the child class's code
//

        // ENCAPSULATION
        Examples.MageHero m = new Examples.MageHero();
        m.setDamage(1000);
        m.getDamage();
    }
}
