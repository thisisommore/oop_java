public class IndexOutOfBounds {
    public static void main(String[] args) {
        String a[] = { "5", "3", "4" };
        try {
            System.out.println(a.length);
            System.out.println(a[2]);
            System.out.println(a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bounds");
        }
    }
}
