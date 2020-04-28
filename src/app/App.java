package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("In ra các hình.");
        // rectangle
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 10; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        // square triangle
        for (int i = 0; i < 5; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        // isosceles triangle
        for (int i = 0; i < 5; i++) {
            for (int j = 4-i; j >= 0; j--) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
