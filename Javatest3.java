public class Javatest3 {
    public static void main(String[] args) {

        int r = 6;

        for (int i = 1; i <= r; i++) {

            int val;

            
            if (i % 2 == 0) {
                val = 0;
            } else {
                val = 1;
            }

            for (int j = 1; j <= i; j++) {

                System.out.print(val + " ");

                
                if (val == 0) {
                    val = 1;
                } else {
                    val = 0;
                }
            }

            System.out.println();
        }
    }
}