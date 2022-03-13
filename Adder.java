import java.util.Scanner;

class Adder {
    int data[];
    int targetSum;

    void getData() {
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        data = new int[size];
        for (int index = 0; index < data.length; index++) {
            System.out.printf("[%d] - ", index + 1);
            data[index] = sc.nextInt();
        }

        System.out.println("Enter target sum");
        targetSum = sc.nextInt();
        sc.close();
    }

    int[] numSum() {
        for (int i : data) {
            int neededJ = targetSum - i;
            int[] res = { 0, 0 };
            for (int j : data) {
                if (i == j) {
                    continue;
                } else if (neededJ == j) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        int[] empty = {};
        return empty;

    }
}

class AdderApp {
    public static void main(String[] args) {
        Adder adder = new Adder();
        adder.getData();
        int[] numSumRes = adder.numSum();
        for (int i = 0; i < numSumRes.length; i++) {
            System.out.printf("%d num := %d\n", i + 1, numSumRes[i]);
        }
    }
}