package Methods;

public class CharacterInString {

    public static void middleCharacterInString(String str){
        int length = str.length();
        int middle = length / 2;

        if (length % 2 == 0) {
            // Even length: Extract two middle characters using substring
            System.out.println("Middle characters: " + str.substring(middle - 1, middle + 1));
        } else {
            // Odd length: Extract one middle character using substring
            System.out.println("Middle character: " + str.substring(middle, middle + 1));
        }

    }

    public static void main(String[] args) {
        middleCharacterInString("hello");
        middleCharacterInString("worlds");
    }
}
