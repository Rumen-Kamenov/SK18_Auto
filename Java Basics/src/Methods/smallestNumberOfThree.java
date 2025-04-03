package Methods;

public class smallestNumberOfThree {

    public static int getSmallestsNumber(int a, int b,int c) {
        int minNumber = a;

        if (b < minNumber ) {
            minNumber = b;
        }

        if(c < minNumber){
            minNumber = c;
        }
        return minNumber;
    }



    public static void main(String[] args) {
        System.out.println("The smallest number is : " + getSmallestsNumber(111,24,555));
    }
}
