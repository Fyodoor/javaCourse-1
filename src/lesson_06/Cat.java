package lesson_06;

public class Cat extends Animal {
    // ����

    // �����������

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, int age, double weight, String color) {
        super(name, age, weight, color);
    }


    // ������


    @Override
    public void say() {
        System.out.println("Cat said meow...");
    }
}
