package com.example.Week2.example_exersice;

public class Battle {

    public Battle(Character first, Character second) {
        System.out.println("--   " + first.getName() + " vs " + second.getName() + "   --\n");
        doBattle(first, second);
    }

    private Character doBattle(Character first, Character second) {
        System.out.println("Battle begins: HHPPs:   " + first.getHp() + "  - "+ second.getHp());

        int i = 0;

        do {
            System.out.println("- Round  " + (i + 1));
            first.attack(second);
            second.attack(first);

            System.out.println("HHPPs:   " + first.getHp() + "  - " + second.getHp());

            if (first.getHp() > 0 && second.getHp() <= 0) {
                System.out.println(first.getName() + " wins!");
                return first;
            } 
             if (first.getHp() <= 0 && second.getHp() > 0) {
                System.out.println(second.getName() + " wins!");
                return second;
            }
        } while (first.getHp() > 0 && second.getHp() > 0);
        System.out.println("Noooo deberia");
        return null;
    }

}
