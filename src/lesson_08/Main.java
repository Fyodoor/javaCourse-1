package lesson_08;

import lesson_08.models.CroupierBJ;
import lesson_08.models.GameBJImpl;
import lesson_08.models.PlayerImpl;

public class Main {
    public static void main(String[] args) {
        // 1. ������� ����� ����, � ������� � ��� ����������� ����
        // 2. ������� �������
        // 3. ������� ������
        // 4. �������� ������� � ������ � ����
        // 5. �������� ������ ����
        // 6. ������� ����� � ������
        // 7. ������� ������� ������ �� 2 ����� �� ������
        // 8. ��������� ������� ������� �� ����� �����, ���� ��� ���������
        // 9. ���������� ����������


        // 1. ������� ����� ����, � ������� � ��� ����������� ����
        GameBJImpl gameBJ = new GameBJImpl();

        // 2. ������� �������
        PlayerImpl player1 = new PlayerImpl();
        PlayerImpl player2 = new PlayerImpl();

        // 3. ������� ������
        CroupierBJ croupierBJ = new CroupierBJ();


        // 4. �������� ������� � ������ � ����
        gameBJ.addPlayerInGame(player1);
        gameBJ.addPlayerInGame(player2);
        gameBJ.addPlayerInGame(croupierBJ);

        // 5. �������� ������ ����
        // 6. ������� ����� � ������
        // 7. ������� ������� ������ �� 2 ����� �� ������
        gameBJ.giveTwoCardsONHand();

        // 8. ��������� ������� ������� �� ����� �����, ���� ��� ���������
        gameBJ.giveOneCardIfNeedToPlayer();


        // 9. ���������� ����������
        gameBJ.printWinner();
    }
}
