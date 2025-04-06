package Methods;

public class CountWords {
    public static int CountWordsInString(String text){

        int count = 0;
        int textLength  = text.length();

        if (text.length() > 1 ){
            count++;
            for(int i = 1;i < textLength; i++){
                if (text.charAt(i)==' '){
                    count++;
                }
            }
        }
        //System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Sum of Words is : " + CountWordsInString("I am doing my homework right now!"));
    }
}

