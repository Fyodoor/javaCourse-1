package lesson_05;

public class PhoneBook {

    // 1. ����
    private Contact1[] contacts = new Contact1[10];

    // 2. �����������

    // 3. ������
    public void addContact(Contact1 contact) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contacts[i] = contact;
                break;
            }

        }
    }

    public void renameContact(String original, String renamed) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null && contacts[i].getName().equalsIgnoreCase(original)) {
                contacts[i].setName(renamed);
                break;
            }
        }
    }





}
