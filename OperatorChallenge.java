public class OperatorChallenge {
    public static void main(String[] args) {
        int a = 10, b = 4, c = 3;

        // Part 1
        int x = a++ + ++b;
        System.out.println("x = " + x);
        System.out.println("a = " + a + ", b = " + b);

        // Part 2
        boolean result = (a > b) && (c++ < 5);
        System.out.println("result = " + result);
        System.out.println("c = " + c);

        // Part 3
        int y = a & b;
        int z = a | b;
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        // Part 4
        int val = (a % c == 0) ? a * c : a + c;
        System.out.println("val = " + val);
    }
}