package lesson_09.tern_operator;

public class Main {
    public static void main(String[] args) {
        People people = new People("����", 17);

        if (people.getAge() < 16) {
            System.out.println(" ���, " + people.getName() + ", �� �� ������ ������!");
        } else {
            System.out.println(" ��, " + people.getName() + ", �������!");
        }

        String answer = people.getAge() < 16 ? " ���, " + people.getName() + ", �� �� ������ ������!" : " ��, " + people.getName() + ", �������!";

        System.out.println(answer);
    }
}
