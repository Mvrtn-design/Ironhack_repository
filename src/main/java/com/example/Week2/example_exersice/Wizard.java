package com.example.Week2.example_exersice;

public class Wizard extends Character implements Attacker {
    private int mana = (int) (Math.random() * ((50 - 10) + 10));
    private int intelligence = (int) (Math.random() * ((10 - 1) + 1));

    public Wizard(String name, int hp, int mana, int intelligence) {
        super(name, hp);
        this.mana = mana;
        this.intelligence = intelligence;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    private int Fireball() {
        if (this.mana < 5) {
            return StaffHit();
        }
        this.mana -= 5;
        System.out.println(this.getName() + "- fireball");
        return this.intelligence;
    }

    private int StaffHit() {
        if (mana <= 0) {
            mana += 2;
            System.out.println(this.getName() + "- recover");
            return 0;
        }
        mana++;
        System.out.println(this.getName() + "- staffHit");
        return 2;
    }

    @Override
    public void attack(Character character) {
        if (Math.random() < 0.5) {
            character.setHp(character.getHp() - this.Fireball());
        } else {
            character.setHp(character.getHp() - this.StaffHit());
        }
    }
}
