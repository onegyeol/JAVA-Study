public class CharacterController {
    Character2 model;
    CharacterView view;
    

    public CharacterController(Character2 model, CharacterView view){
        this.model = model;
        this.view = view;
    }

    public void set_characterName(String name){
        this.model.setName(name);
    }

    public String get_characterName(){
        return this.model.getName();
    }

    public void set_characterLevel(int level){
        this.model.setLevel(level);
    }

    public int get_characterLevel(){
        return this.model.getLevel();
    }

    public void set_characterLife(int life){
        this.model.setLife(life);
    }

    public int get_characterLife(){
        return this.model.getLife();
    }

    public void set_characterMana(int mana){
        this.model.setMana(mana);
    }

    public int get_characterMana(){
        return this.model.getMana();
    }

    public void set_characterSpecies(String species){
        this.model.setSpecies(species);
    }

    public String get_characterSpecies(){
        return this.model.getSpecies();
    }

    public int fight(){
        int r = (int)(Math.random()*1);

        if(r == 0) return 1;
        else return 0;

    }

    public void update_view(){
        this.view.view_status(this.model);
    }


}
