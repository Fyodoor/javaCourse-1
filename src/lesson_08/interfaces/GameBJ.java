package lesson_08.interfaces;

public interface GameBJ {
    void addPlayerInGame(Player player); // �������� ������ � ����

    void giveTwoCardsONHand(); // ������� 2 ���� �� ������

    void giveOneCardIfNeedToPlayer(); // ������ ��� ����� ������, ���� ��� �����

    void printWinner(); // ��������� ����������
}
