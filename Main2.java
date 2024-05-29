public class Main2 {
    public static void main(String[] args) {
        Character2 model = new Character2("홍길동", 1, 100, 100, "인간");
        CharacterView view = new CharacterView();
        CharacterController controller = new CharacterController(model, view);

        controller.update_view();

        if(controller.fight() == 1){
            controller.set_characterLevel(controller.get_characterLevel()+1);
            controller.set_characterLife(controller.get_characterLife()+20);
            controller.set_characterMana(controller.get_characterMana()+20);
        }
        else{
            controller.set_characterLevel(controller.get_characterLevel()-1);
            controller.set_characterLife(controller.get_characterLife()-20);
            controller.set_characterMana(controller.get_characterMana()-20);
        }

        controller.update_view();
            
    }
    
}
