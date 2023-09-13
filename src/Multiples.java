public class Multiples {
    public static void main(String[] args) {

        int amount = 0;
        int i = 3;

        while (i < 1000) {
            // Find out if i is a multiple of 3 or 5
            boolean multipleOf3 = i % 3 == 0;
            boolean multipleOf5 = i % 5 == 0;

            if (multipleOf3 || multipleOf5) {
                amount++;
            }
            i++;
        }
        System.out.println(amount);
    }
}
