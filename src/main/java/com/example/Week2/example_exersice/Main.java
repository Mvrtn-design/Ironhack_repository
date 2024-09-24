package com.example.Week2.example_exersice;

import java.util.Scanner;

/*
 * Instructions
Let’s walk through the details of the homework:
Classes
Three classes and one interface are necessary to complete this homework:
These classes will be named: Character, Warrior and Wizard.
This interface will be called Attacker.
 
Attacker interface
This interface will have:
A public void function attack() that takes a character as a parameter.
We have two types of characters, warriors and wizards, who have different attributes and combat styles. You need to create a character class (that can’t be instantiated) that will contain base attributes that are common for both - warriors and wizards.
 
Character class
This class will have:
Variable called id of data type string, auto-generated (Private member)
Variable called name of data type string (Private member)
Variable called hp of data type int, random between 100-200 to warriors and 50-100 for wizards, representing the health points (Private member)
Variable called isAlive of data type boolean defaulted to true (Private member)
A “parameterized” constructor that takes name and hp (as parameters)
Public Getter functions to access these variables
Public Setter functions to change these variables
 
Warrior Class
This class is derived from the Character class. A Warrior is a Character that fights by attacking. Attacks inflict damage and in order to do one, stamina is required
The Warrior class will have:
Variable called stamina of data type int, random between 10-50, representing a resource the warrior consumes to make an attack (Private member)
Variable called strength of data type int, random between 1-10, measuring how strong the warrior attack is (Private member)
Public Getter functions to access these variables
Public Setter functions to change these variables
A parameterized constructor that takes name, hp, stamina and strength
A public function that overloads attack() implemented in the Attacker interface, that will take a character as a parameter and reduce that character’s health based on the strength of the attack.
 
Wizard class
This class is derived from the Character class. A Wizard is a Character that fights by casting spells. Spells inflict damage and require mana to be cast.
The Wizard class will have:
Variable called mana of data type int, random between 10-50, representing a resource the wizard consumes to cast spells (Private member)
Variable called intelligence of data type int, random between 1-50, measuring how strong the wizard spells are (Private member)
Public Getter functions to access these variables
Public Setter functions to change these variables
A parameterized constructor that takes name, hp, mana and intelligence
A public function that overloads attack() implemented in the Attacker interface, that will take a character as a parameter and reduce that character’s health based on the intelligence of the spell
How the battle simulator works
The characters are created before the battle starts. They can have either the same character type or different character types.
The battle is 1 vs. 1 and will be by rounds, in each round both combatants will attack at the same time (so even if one combatant does the killing blow both will take damage). So the combat could end in a tie. In case of a tie, the battle is restarted to have only one winner.
A complete log of the battle will be displayed on the command line. When the battle is over the winner should be displayed as well.
Character Attacks
Both wizards and warriors will have the same attack command defined by an interface called Attacker.
Warrior:
Warriors are strong well-armored characters that focus on the attribute of strength. Every round a warrior will have randomly either a Heavy attack or a Weak attack. The damage of a Heavy attack is equal to their strength and every hit will decrease their stamina by 5 points. The damage of a Weak attack is half of the strength (truncate decimals). Every Weak attack will recover his stamina by 1.
If a warrior does not have the stamina to make a Heavy attack he will do a Weak attack instead.
If a warrior does not have the stamina to do a Weak attack he will not inflict any damage and recover his stamina by 2.
Wizard:
Wizards are the masters of the arcane their main attribute is intelligence. Every round a wizard will try to randomly cast either a Fireball or a Staff hit. The damage of a Fireball is equal to his intelligence and every Fireball will decrease their mana by 5 points. The damage of a staff hit is equal to 2. Every staff hit will recover his mana by 1.
If a wizard does not have the mana to cast a Fireball he will do a Staff hit instead.
If a wizard does not have the mana to cast a Staff hit he will not inflict any damage and recover his mana by 2.
Requirements
For this project you must accomplish all of the following:
Navigate through a text-based menu using Standard Input and Output.
Create warriors and wizards individually customizing their stats and name.
Have a battle between the characters and determines the winner.
Keep a detailed log (on the standard output) of every action taken during the duels.
 
*/

public class Main {

    public static int generate_StaminaMana() {
        return (int) (Math.random() * (50 - 10) + 10);
    }

    public static int generate_StrengtIntelligence() {
        return (int) (Math.random() * (10 - 1) + 1);
    }

    public static int generateHP() {
        return (int) (Math.random() * (200 - 100) + 100);
    }

    public static int generate_1or2() {
        return (int) (Math.random() * (200 - 100) + 100);
    }

    public static Character[] characterChooser() {
        Scanner scanner = new Scanner(System.in);

        Character peleadores[] = new Character[2];
        String nombres[] = new String[2];
        int tipos[] = { 0, 0 };

        int battleType_option;
        do {
            System.out.println("1- > Random battle");
            System.out.println("2- > Custom battle");
            System.out.print("Choose an option: ");
            battleType_option = scanner.nextInt();
            switch (battleType_option) {
                case 1:
                    for (int i = 0; i < 2; i++) {
                        nombres[i] = "Peleador " + (i + 1);
                        tipos[i] = (int) (Math.random() * (2 - 1) + 1);
                    }
                    break;

                case 2:
                    System.out.println("FIRST CHARACTER: ");
                    System.out.print("- Enter the name of the first character: ");
                    nombres[0] = scanner.next();
                    System.out.print("Want a WARRIOR or a WIZARD? (1/2):  ");
                    tipos[0] = scanner.nextInt();

                    System.out.println("SECOND CHARACTER: ");
                    System.out.print("Enter the name of the second character: ");
                    nombres[1] = scanner.next();
                    System.out.print("Want a: 1-WARRIOR or a 2-WIZARD? (1/2): ");
                    tipos[1] = scanner.nextInt();

                    if (tipos[0] != 1 && tipos[0] == 2 || tipos[1] != 1 && tipos[1] != 2) {
                        System.out.println("EEError en los parametros, pruebe otra vez");
                        characterChooser();
                    }
                    break;

                default:
                    System.out.println("Error en los parametros, pruebe otra vez");
                    characterChooser();
                    break;
            }
        } while (battleType_option != 1 && battleType_option != 2);

        if (tipos[0] == 1) {
            peleadores[0] = new Warrior(nombres[0], generateHP(), generate_StaminaMana(),
                    generate_StrengtIntelligence());
        } else if (tipos[0] == 2) {
            peleadores[0] = new Wizard(nombres[0], generateHP(), generate_StaminaMana(),
                    generate_StrengtIntelligence());
        } else {
            System.out.println("Error en los parametros, pruebe otra vez");
            characterChooser();
        }
        if (tipos[1] == 1) {
            peleadores[1] = new Warrior(nombres[1], generateHP(), generate_StaminaMana(),
                    generate_StrengtIntelligence());
        } else if (tipos[1] == 2) {
            peleadores[1] = new Wizard(nombres[1], generateHP(), generate_StaminaMana(),
                    generate_StrengtIntelligence());
        } else {
            System.out.println("Error en los parametros, pruebe otra vez");
            characterChooser();
        }
        return peleadores;
    }

    public static void main(String[] args) {

        System.out.println("-------------------------------------");
        System.out.println("    Welcome to the BATTLE SIMULATOR");
        System.out.println("-------------------------------------\n\n\n");

        Character[] peledores = characterChooser();

        new Battle(peledores[0], peledores[1]);
    }
}
