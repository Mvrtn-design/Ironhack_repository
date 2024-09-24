package com.example.Week2.example_exersice;

public class Warrior extends Character implements Attacker {
    private int stamina;
    private int strength;
    int hp;

    public Warrior(String name, int hp, int stamina, int strength) {
        super(name, hp);
        this.stamina = stamina;
        this.strength = strength;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    private int heavyAttack() {
        if (this.stamina < 5) {
            return weakAtttack();
        }
        this.stamina -= 5;
        System.out.println(this.getName() + "- heavy");
        return this.strength;
    }

    private int weakAtttack() {
        if (this.stamina < 1) {
            this.stamina += 2;
            System.out.println(this.getName() + "- recovery");
            return 0;
        }
        this.stamina++;
        System.out.println(this.getName() + "- weak");
        return (int) (this.strength * 0.5);
    }

    @Override
    public void attack(Character character) {

        if (Math.random() < 0.5) {
            character.setHp(character.getHp() - this.heavyAttack());
        } else {
            character.setHp(character.getHp() - this.weakAtttack());
        }
    }
}
