package fruit;

public class Main {
    public static void main(String[] args) {
        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Apple();
        fruit[1] = new Orange();
        for (Fruit c: fruit) {
            System.out.println(c.howToEat());
        }
    }
}
