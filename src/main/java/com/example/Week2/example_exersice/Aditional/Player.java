package com.example.Week2.example_exersice.Aditional;

public abstract class Player {
    private int health;
    private int strength;
    private int lives;
    private final int originalHealth;

    public Player(int health, int strength, int lives) {
        this.health = health;
        this.strength = strength;
        this.lives = lives;
        this.originalHealth = health;
    }

    // Getters
    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getLives() {
        return lives;
    }

    // Setters
    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    // Method to decrement lives and restore health
    public void decrementLive() {
        if (lives > 0) {
            lives--;
            health = originalHealth;
        } else {
            System.out.println("This character is dead");
        }
    }

    // Method to attack another player
    public void attack(Player playerToAttack) {
        playerToAttack.setHealth(playerToAttack.getHealth() - this.strength);
        playerToAttack.checkHealth();
    }

    // Method to check health and handle lives
    public void checkHealth() {
        if (health <= 0) {
            decrementLive();
        }
    }
}
