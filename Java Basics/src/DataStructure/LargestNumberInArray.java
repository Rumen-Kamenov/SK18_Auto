package DataStructure;

public class LargestNumberInArray {
    public static void main(String[] args) {
        int [] myArray = {5, 100 , 200,234, 1000, 235};

        int max = myArray[0];
        for (int i = 1; i < myArray.length; i++){
            if(myArray[i] > max){
                max = myArray[i];
            }
        }
        System.out.println("Biggest element is:" + max);
    }
}
