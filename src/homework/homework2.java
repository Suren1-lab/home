package homework;

public class homework2 {
    public static void main(String[] args) {
        System.out.println("figure 1");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("figure 2");
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("figure 3");
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            for (int k = 5; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();


        }
        System.out.println("figure4");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("figure5");
        for (int i = 5; i > 0; i--) {
            for (int j = -1; j < i; j++) {
                System.out.print(" ");

            }
            for (int k = 5; k > i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k =5; k > i; k--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}


