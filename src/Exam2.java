public class Exam2 {
    public static void main(String[] args) {
        // 높이 : 3

        /*

         *
         ***
         *****

         */
        triangle(3);
        // 높이 : 5

        /*

         *
         ***
         *****
         *******
         *********

         */
        triangle(5);
        // 높이 : 7

        /*

         *
         ***
         *****
         *******
         *********
         ***********
         *************

         */
        triangle(7);
    }

    public static void triangle(int idx) {
        for (int i = 0; i < idx; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
