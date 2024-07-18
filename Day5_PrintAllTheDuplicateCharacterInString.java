import java.util.Arrays;

public class printDuplicatesInString{
    public static void main(String[] args) {
        String str = "Aditya Mishra";
        printDuplicates(str);
    }

    private static void printDuplicates(String str) {
        int len = str.length();

        char[] words = str.toCharArray();
        Arrays.sort(words);
        String s = new String(words);
        
        for(int i = 0; i<len; i++){
            int count = 1;
            while(i < len-1 && s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
            }

            if(count > 1){
                System.out.println(s.charAt(i) + " is repeated " + count + " times");
            }
        }
    }
}
