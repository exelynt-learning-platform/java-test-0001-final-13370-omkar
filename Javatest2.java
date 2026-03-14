public class Javatest2 {
    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            // increasing numbers
            for (int up = 1; up <= i; up++) {
                System.out.print(up);
            }

            // decreasing numbers
            for (int down = i - 1; down >= 1; down--) {
                System.out.print(down);
            }

            System.out.println();
        }
    }
}