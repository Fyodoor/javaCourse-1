package lesson_05;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        /**
         ������-
         �������� ������ (�����) ������ ����� �������� �� ������ ����� � ��� ������� ������.
         ������ ����� ��������� �� ������� �� ������ ������ (�����),
         �� ������ ���� ��� ������ ������� � ����� ������;
         ������� �������� ������-
         1- ����������� ������� - ��� ���� �� 4-� ����� ����,
         ����������� ����� ������� ��� �������:
         public - �����/����� ����� �������� ������ ���� ������� ����� ������� (99% ������� ������������);
         protected - ������ ������ � ��� �����������, �� ���� �������� �������,
         ������������� � ������ ������� � ������ �������;
         --------- ����� �������� ������ ������ �������� ������ (������� �����);
         private - ������ ������ �������� ������ (�����);
         -����������� - ��� ��������: ����� ���� ������ ������� �����������, ���� ���:
         - �� static, ���� ����� ����� ���������� � ���������� text.split(" ");, �� �� �� ������ ���� static; static - ���� ����� ����� ���������� � �u�� String.copyValue0f(char[] data);
         -������������ ��� ��� ����� void ���� ����� �� ���� �� ����������:
         public static int - ���� ����� ����� ���������� �����; public static char[] - ���� ���������� ������ ��������;
         public static String - ���� ���������� ������;
         public static ****** - ������ �������� ������������ �����; public static void - ���� �� ���� �� ����������, � ������ �����������, ��������, ������ �� �������;
         4 - �������� ������: ���������� ��� ����, � ��������� �����;
         5 - �������� ��������� � ������� ������� ���� ��� ����� ����� ������� � ��������� ����
         6 - ���� ������ (�� ��� ������ �����������, ����� ����� �������);
         public static void 				printMassiveToConsole(int[][] mass)
         ������������ ������� ������			��������� ������

         * */

        Util util = new Util();
        util.print();

        Util.print1();

        int summa = util.getSumma(10, 15);

        System.out.println(summa);





        Contact1 vasya = new Contact1("����", "+79512148945", "mail@yandex.ru");
        Contact1 vitalik = new Contact1("�������", "+79512148961", "mail@yandex.ru");
        Contact1 olga = new Contact1("�����", "+7951214812", "mail@yandex.ru");
        Contact1 katya = new Contact1("���������", "+79512148132", "mail@yandex.ru");
        Contact1 viktor = new Contact1("������", "+79512148102", "mail@yandex.ru");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(vasya);
        phoneBook.addContact(vitalik);
        phoneBook.addContact(olga);
        phoneBook.addContact(katya);
        phoneBook.addContact(viktor);

        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ��� ��������, ������� ������ �� ������������");
        String original = scanner.nextLine();
        System.out.println("������� ��� �� ������� �� ������ �� ������������ " + original);
        String renamed = scanner.nextLine();

        phoneBook.renameContact(original, renamed);




        System.out.println();



    }
}
