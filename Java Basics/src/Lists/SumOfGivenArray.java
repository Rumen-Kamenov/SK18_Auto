package Lists;

public class SumOfGivenArray {
    public static void main(String[] args) {
        int[] myArray = {5,2,3,4,5,6,7,8,10};
        int sum = 0 ;
        int i ;

        for(i = 0; i < myArray.length; i++){
            sum += myArray[i];
        }
        System.out.println(sum);
    }
}
