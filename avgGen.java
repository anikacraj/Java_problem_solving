class Num<T extends Number> {
    T[] nums;

    Num(T[] ob) {
        this.nums = ob;
    }

    double avg() {
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i].doubleValue();
        }
        return sum / nums.length;
    }
}

public class avgGen {
    public static void main(String[] args) {
        Integer n[] = {1, 2, 3, 4, 5};
        Num<Integer> ob = new Num<>(n);
        System.out.println("Average of Integer array: " + ob.avg());

        // Double D[] = {10.23, 10.1, 10.24, 10.23};
        // Num<Double> d = new Num<>(D);
        // System.out.println("Average of Double array: " + d.avg());
    }
}
