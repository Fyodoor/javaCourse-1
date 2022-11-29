package lesson_10;

public class Dog {
    private String name;
    private boolean isCollarPutOn;
    private boolean isLeashPutOn;
    private boolean isMuzzlePutOn;

    public Dog(String name) {
        this.name = name;
    }

    public void putCollar() {
        System.out.println("������� �����");
        this.isCollarPutOn = true;
    }

    public void putLeash() {
        System.out.println("������� �����");
        this.isLeashPutOn = true;
    }

    public void putMuzzle() {
        System.out.println("��������� �����");
        this.isMuzzlePutOn = true;
    }

    public void walk() throws DogIsNotReadyToWalkException {
        System.out.println("������ ������");
        if (isMuzzlePutOn && isLeashPutOn && isCollarPutOn) {
            System.out.println("���, " + name + ", ���� ������!");
        } else {
            throw new DogIsNotReadyToWalkException("������ �� ������ ������");
        }
    }
}
