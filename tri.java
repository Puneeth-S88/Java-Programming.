public class tri {

    public static void main(String[] args) {

        double angle = 30; 

        double radians = Math.toRadians(angle);

        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        double tanValue = Math.tan(radians);

        System.out.println("Angle: " + angle);

        System.out.println("Sin(" + angle + ") = " + sinValue);
        System.out.println("Cos(" + angle + ") = " + cosValue);
        System.out.println("Tan(" + angle + ") = " + tanValue);
    }
}