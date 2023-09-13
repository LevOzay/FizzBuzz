public class Reduce {
    public static void main(String[] args) {

        int hundred = 100;
        int steps = 0;

        while (hundred != 0) {
            boolean divisibleBy2 = hundred % 2 == 0;

            if (divisibleBy2) {
                hundred = hundred / 2;
                steps++;
            } else {
                hundred--;
                steps++;
            }
        }
        System.out.println(steps);
    }
}
