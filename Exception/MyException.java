package Exception;

public class MyException {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("\nArithmeticException: Cannot divide by 0\n");
        }

        String a[] = { "5", "3" };
        try {
            System.out.printf("Length of array is %d\n", a.length);
            System.out.println("Trying to access element at index 3");
            System.out.println(a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Array out of bounds\n");
        }

        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Cannot access members of null object\n");
        }
    }
}