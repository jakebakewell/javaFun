public class Pythagorean {
    public static double calculateHypotenuse(int legA, int legB) {
        double legSum = (legA * legA) + (legB * legB);
        double hypotenuse = Math.sqrt(legSum);
        System.out.println("Hypotenuse is: " + hypotenuse);
        return hypotenuse;
    }
    public static void main(String[] args) {
        calculateHypotenuse(3, 4);
    }
}

