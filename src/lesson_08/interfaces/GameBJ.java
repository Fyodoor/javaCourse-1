package lesson_08.interfaces;

import lesson_08.models.PlayerImpl;

public interface GameBJ {
    void addPlayerInGame(PlayerImpl player); // �������� ������ � ����

    void giveTwoCardsONHand(); // ������� 2 ���� �� ������

    void giveOneCardIfNeedToPlayer(); // ������ ��� ����� ������, ���� ��� �����

    void printWinner(); // ��������� ����������
}
