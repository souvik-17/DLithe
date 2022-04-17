package practice;

public class FindPrime {
    public FindPrime() {

        int[] a = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,18};
        String k = "";
        System.out.println("Prime Numbers are: ");
        for (int i = 0; i < a.length; i++)
            for (int j = 2; ; j++) {
                if (a[i] == 2) {
                    k = (k + " " + a[i]);
                    break;
                }
                if (a[i] % j == 0) {
                    break;
                }
                if (j > a[i] / 2) {
                    k = (k + " " + a[i]);
                    break;
                }
            }
        System.out.println(k);

    }

    public static void main(String[] args) {
        new FindPrime();
    }

}
