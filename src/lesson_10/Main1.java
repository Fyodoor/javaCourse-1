package lesson_10;

public class Main1 {
    public static void main(String[] args) {
        Dog dog = new Dog("�����");

        dog.putCollar();
        dog.putLeash();
//        dog.putMuzzle();

        try {
            dog.walk();
        } catch (DogIsNotReadyToWalkException e) {
            e.printStackTrace();
        }
    }
}
