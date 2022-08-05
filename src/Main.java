public class Main {
    public static void main(String[] args) {
        int pawsCount = 0;
        Cat cat = new Cat(pawsCount);
        cat.catchMouse();
        cat.giveVoice();

        Dog dog = new Dog(pawsCount);
        dog.bringStick();
        dog.play();

        Hamster hamster = new Hamster(pawsCount);
        hamster.hideFood();
        hamster.sleep();

        Fish fish = new Fish(pawsCount);
        fish.sleep();

        Spider spider = new Spider(pawsCount);
        System.out.println("У паука " + spider.getPawsCount() + " лапок.");
    }
}