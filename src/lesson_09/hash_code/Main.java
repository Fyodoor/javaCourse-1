package lesson_09.hash_code;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        /**
         * ���� ������ 3 HashCode
         * �������� ����� Hash - �������� ������� � ��������� ��������� �����������
         * ����������� ��� �� ������������ ����� � � ��� ��� ���� ��������� ����� �� 19 000 ����.
         * ��� ���������� ����� ������, ��� ������ ��������� ���� �� ��� � �� � ��� ��� ���, ����
         � ��������� ��� ������ ������ ���� ����������. ����� ������ ��������� �� �������,
         �� ��������, �� ��������, ��� �������.
         * �� ���� ����� �������������� ������� ���� � ������ ������. * � �������������� ������ ����
         ���������� ������������, �������� ���� �� ������.
         * ������������ ������������� ����� ���� �������� ���, ������� � ������� ����� ������.
         * ��� ���� � ���� ������ ������� ����� ���� ������ �������, �� � ����� ����� ��� �������,
         ������� �� ����� * � ������, �������� ����. ������� ����� ��������� ������ .hashcode ������
         ���������� ����� .equals u * ������������ �������� ������ � ������� boolean ���������� ����
         ����� ������ � ��������� ��� ���.
         * */

        Coin coin1 =  new Coin(15, 20.5, "Russia", 1994);
        Coin coin2 =  new Coin(10, 20.5, "Russia", 1994);
        Coin coin3 =  new Coin(5, 20.5, "Russia", 1994);
        Coin coin4 =  new Coin(2, 20.5, "Russia", 1994);
        Coin coin5 =  new Coin(1, 20.5, "Russia", 1994);

        HashSet<Coin> coinCollection = new HashSet<>();

        coinCollection.add(coin1);
        coinCollection.add(coin2);
        coinCollection.add(coin3);
        coinCollection.add(coin4);
        coinCollection.add(coin5);

        for (Coin c: coinCollection) {
            System.out.println(c);
        }

        System.out.println();
    }
}
