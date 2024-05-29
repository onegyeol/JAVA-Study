import java.util.*;

public class Character2 {
    String name;
    int level;
    int life;
    int mana;
    String species;

    public Character2(String name, int level, int life, int mana, String species) {
        this.name = name;
        this.level = level;
        this.life = life;
        this.mana = mana;
        this.species = species;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getLevel(){
        return this.level;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public int getLife(){
        return this.life;
    }

    public void setLife(int life){
        this.life = life;
    }

    public int getMana(){
        return this.mana;
    }

    public void setMana(int mana){
        this.mana = mana;
    }

    public String getSpecies(){
        return this.species;
    }

    public void setSpecies(String species){
        this.species = species;
    }

    
    



}