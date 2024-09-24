package com.example.Week2.example_exersice;

public class Character implements Attacker {
    private String id;
    private String name;
    int  hp; //random between 100-200 to warriors and 50-100 for wizards
    private boolean  isAlive = true;
    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public boolean isAlive() {
        return isAlive;
    }
    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }
    @Override
    public void attack(Character character) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attack'");
    }

    
}
