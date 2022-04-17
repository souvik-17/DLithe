package practice;

public class CopyString {
    public CopyString() {
        String[] name = {"Rohit", "Virat", "Dhoni"};
        String[] copyName = new String[name.length];
        for (int i = 0; i < name.length; i++) {
            copyName[i] =name[i];
        }
        for (String names: copyName) {
            System.out.println(names);
        }

    }

    public static void main(String[] args) {
        new CopyString();

    }
}
