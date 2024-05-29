public class CharacterView {
    public CharacterView(){

    }
    
    public void view_status(Character2 model){
        
        System.out.println(model.name);
        System.out.println(model.level);
        System.out.println(model.life);
        System.out.println(model.mana);
        System.out.println(model.species);
        System.out.println();
    }
}