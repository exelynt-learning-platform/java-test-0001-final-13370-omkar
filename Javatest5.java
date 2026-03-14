public class Javatest5 {
    public static void main(String[] args) {

        int n = 1;

        for (int r = 1; r <= 5; r++) {

            for (int c = 1; c <= r; c++) {

                System.out.print(n + " ");
                n++;
            }

            System.out.println();
        }
    }
}