package lesson_03;

public class Application {
    public static void main(String[] args) {
        // �����
        // fori, while, foreach

        // fori

        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");


        for (int i = 0; i < 5 ; i++) {
            System.out.println(i);
        }

        System.out.println();

        // 1. ������� � ����� ��� ������ ����� �� 1 �� 50

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println();


        // 2.  ������ ��� ����� �� 1 �� 100, ������� ������� �� 3 � �� 5 ������������

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        // 3. ������� ����� �� 10 �� 20
        int count = 0;

        for (int i = 10; i <= 20; i++) {
            count += i;
            if (i == 20) {
                System.out.println(count);
            }
        }

        // 4. ������� � ������� ��� ����� �� 10 �� 40, �� ��������� ��� ����� �� 15 �� 20

        for (int i = 10; i <= 40; i++) {
            if ( i < 15 || i > 20) {
                System.out.print(i + " ");
            }
        }

        // 5. ������� ����� ���� ������ ����� �� 10 �� 50
        int summa = 0;

        for (int i = 10; i <= 50; i++) {
            if (i % 2 == 0) {
                summa = summa + i;
            }
        }

        System.out.println(summa);

        int a;
        int a1 = 0;
        a1 += 4;

        int counter = 10;

        while (counter >= 0) {
            System.out.println("�������� �����. �������� " + counter + " ������");
            counter--;
        }

        Util3 util3 = new Util3();
        util3.print();

    }
}
