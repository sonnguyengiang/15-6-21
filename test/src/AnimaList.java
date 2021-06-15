public class AnimaList {
    private Animal[] animals = new Animal[5];
    private int index = 0;
    public AnimaList() {

    }
    public Animal animal(int index) {
        return this.animals[index];
    }
    public void add(Animal animal) {
        if (index < animals.length) {
            animals[index] = animal;
            System.out.println("add at: " + index);
            index++;
        }
    }
}
