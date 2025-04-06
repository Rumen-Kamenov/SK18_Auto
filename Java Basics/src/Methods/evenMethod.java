package Methods;

public class evenMethod {
    public static boolean isEven (int number){
        return number % 2 == 0; // Returns true if this number is even.
    }

    public static void main(String[] args) {
        System.out.println(isEven(2));
        System.out.println(isEven(11));
    }
}
