import java.util.ArrayList;

public class Homework {

    public static void main(String[] args) {
        Box<Apple> apples = new Box<>();
    }

}

abstract class Fruit{

    private final float weight;


    public float getWeight() {
        return weight;
    }

    public Fruit(float weight) {
        this.weight = weight;
    }
}

class Apple extends Fruit {

    public Apple() {
        super(1.0f);
    }
}
class Orange extends Fruit {

    public Orange() {
        super(1.5f);
    }
}

class Box<T extends Fruit>{

    ArrayList<T> fruits;
    float weightBox;

    public float getWeightBox(){
        return weightBox;
    }

    public void addFruit(T fruit) {
        if (fruits.isEmpty() || (fruits.get(0) instanceof Apple && fruit instanceof Apple) || (fruits.get(0) instanceof Orange && fruit instanceof Orange)) {
            fruits.add(fruit);
            weightBox += fruit.getWeight();
        } else {
            System.out.println("Невозможно!");
        }
    }
    public boolean compare(Box box, Box box1) {
        if (box.weightBox > box1.weightBox) {
            System.out.println();
            return false;
        } else if (box.weightBox == box1.weightBox) {
            return true;
        } else {
            return false;
        }
    }
    public void addBoxinBox(ArrayList<T> fruits,ArrayList<T> fruits1){
        if((fruits.get(0) instanceof Apple && fruits1.get(0) instanceof Apple) || (fruits.get(0) instanceof Orange && fruits1.get(0) instanceof Orange)){
            fruits.addAll(fruits1);
        }
    }
}
