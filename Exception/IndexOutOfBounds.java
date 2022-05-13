public class IndexOutOfBounds {
    public static void main(String[] args) {
        String a[] = { "5", "3" };
        try {
            System.out.printf("Length of array is %d\n", a.length);
            System.out.println("Trying to access element at index 3");
            System.out.println(a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bounds");
        }
    }
}
