package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: o-o-o";
    }
    public String howToEat(){
        return "Could be fried";
    }
}
