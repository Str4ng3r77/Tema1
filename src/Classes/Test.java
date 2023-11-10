package Classes;

public class Test {

    public static void main(String[] args){
        Test1();
    }
    private static void Test1() {
        Dog dog1 = new Dog("Rex", "Pechinez");
        Dog dog2 = new Dog("Rusu", "Pomeranian");

        dog1.setName("Pipi");
        dog2.setBreed("Ciobanesc");

        System.out.println(dog1.getName());
        System.out.println(dog1.getBreed());
        System.out.println(dog2.getName());
        System.out.println(dog2.getBreed());
    }
}