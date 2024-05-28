import java.util.*;

/**
 * 1. 캐릭터 종보에 종족, 마나를 표현할 수 있는 변수 추가
 * 2. 몬스터와 전투 승리 시 레벨을 1 증가시키고 체력과 마나를 각각 20씩 증가하도록 변경
 * 3. 몬스터와 전투 패배 시 레벨을 1 감소시키고 체력과 마나를 각각 20씩 감소하도록 변경
 */

public class Character {
    String name;
    int level;
    int life;
    int mana;
    String species;

    public Character(String name, int level, int life, int mana, String species) {
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
        return this.level;
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

    public void fight(){
        int r = (int)(Math.random()*1);

        if(r == 0){
            this.level += 1;
            this.life += 20;
            this.mana += 20;
        }else{
            this.level -= 1;
            this.life -= 20;
            this.mana -= 20;
        }

        view_status();

    }

    public void view_status(){
        System.out.println(this.name);
        System.out.println(this.level);
        System.out.println(this.life);
        System.out.println(this.mana);
        System.out.println(this.species);
        System.out.println();
    }

    public static void main(String[] args) {
        Character c = new Character("홍길동", 1, 100, 100, "인간");

        c.view_status();
        c.fight();
    }

}
