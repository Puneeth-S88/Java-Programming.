public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);  // builds reverse character by character
        }
        System.out.println(reversed); // "olleH"

        // Shorter way using StringBuilder:
        String rev2 = new StringBuilder(str).reverse().toString();
        System.out.println(rev2); // "olleH"
    }
}

