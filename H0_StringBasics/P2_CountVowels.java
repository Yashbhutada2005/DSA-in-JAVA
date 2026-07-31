package H0_StringBasics;

public class P2_CountVowels {
    public static void main(String[] args) {
        String str = "Yash Bhutada";
        int count = 0;
        String vowels = "aeiouAEIOU";

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(vowels.contains(ch + "")){
                count++;
            }
        }
        System.out.println("Number of vowels in the string: " + count);
    }
}
