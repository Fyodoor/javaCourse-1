package lesson_10;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;

public class Main {
    public static void main(String[] args)  {
        System.out.println("1. Exception � ��� �� ��������");
        int a = 10;
        int b = 0;
//        System.out.println(a / b);
//        ArithmeticException arithmeticException = new ArithmeticException();
//        arithmeticException.printStackTrace();
//        System.exit(0);

        System.out.println("2. Exception - null - ��� �� ��������");
//        String text = null;
//        System.out.println(text.length());
//        NullPointerException nullPointerException = new NullPointerException();
//        nullPointerException.printStackTrace();
//        System.out.println(nullPointerException.getMessage());
//        System.exit(0);
        System.out.println("3. ����� Exception � ������� if/else");
        String password = null;
        if (password != null) {
            System.out.println(password.length());
        }

        System.out.println("4. ����� Exception � ������� try - catch");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("5. ����� Exception � ������� try - catch - finally");

        try {
            Files.copy(new File("D:/rg.jpg").toPath(), new File("D:/rggg.jpg").toPath());
        } catch (NoSuchFileException e) {
            e.printStackTrace();
            System.out.println("������ ���������, ������ ��� ������ ����� ���");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("�����-�� �� ������� �� ������� ����");
        } finally {
            // ���� ������� �������� ������, �������� ���, ��������� ������ � ������� �������� ��� ������������
            // ���
        }
        System.out.println("��������� ������������");
    }
}
