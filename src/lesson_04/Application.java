package lesson_04;

public class Application {
    public static void main(String[] args) {
        // Arrays - �������
        // ���������� ������ ������ ������ ����

//        int [] array = new int[10];
//        int [] array2 = new int[]{1,2,3,4,5};
          int [] array3 = new int[100];
//        array3 [0] = 11;
//        array3 [1] = 22;
//        array3 [2] = 33;
//        array3 [3] = 44;
//        array3 [4] = 55;



          for (int i = 0; i < 100; i++) {
              array3 [i] = i + 1;
          }


          // 1. ������ ������ ������ �������
         for (int i = 0; i < 5; i++) {
             System.out.println(array3[i]);
         }

         //2. ������ ������ ������ ��������� ������

        for (int i = 0; i < 100; i++) {
            if (array3[i] % 2 == 0) {
                System.out.println(array3[i]);
            }
        }

        // 3. �������� ������ �������� �������� �� 10 �� 30

        for (int i = 10; i <= 30; i++) {
            if (array3[i] % 2 != 0) {
                System.out.print (array3[i] + " ");
            }
        }



        System.out.println();
    }
}
