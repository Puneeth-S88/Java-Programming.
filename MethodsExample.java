public class MethodsExample {

    // 1. No parameters, no return
    void greet() {
        System.out.println("Hello, Welcome!");
    }

    // 2. With parameters, no return
    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    // 3. No parameters, with return
    int getNumber() {
        return 10;
    }

    // 4. With parameters, with return
    int multiply(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        MethodsExample obj = new MethodsExample();

        obj.greet();                 // calling method 1
        obj.add(5, 3);               // calling method 2

        int num = obj.getNumber();   // calling method 3
        System.out.println("Number: " + num);

        int result = obj.multiply(4, 6); // calling method 4
        System.out.println("Multiply: " + result);
    }
}