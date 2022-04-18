public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Stepan", 200, 0);
        Dog dog = new Dog("Easy", 500, 10);

        Animal[] myPets = new Animal[]{cat, dog};

        float toRun = 550;
        float toSwim = 15;


        for (Animal myPet : myPets) {
            String nameString = myPet.getType() + " " + myPet.getName() + ": ";
            System.out.println(nameString);
            String petResult = String.format("%.2f м ", myPet.getRun());
            System.out.print("Run: ");
            System.out.println(petResult);
            int swimResult = myPet.swim(toSwim);
            petResult = String.format("%.2f м ", myPet.getSwim());
            System.out.print("Swim: ");
            System.out.println((swimResult == Animal.SWIM_FAIL) ? "Cat don't swim." : petResult);
        }
    }
}