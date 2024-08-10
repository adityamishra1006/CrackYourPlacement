class Solution {
    private static final String[] lessThenTwenty = {
        "",
        "One", 
        "Two", 
        "Three", 
        "Four", 
        "Five", 
        "Six", 
        "Seven", 
        "Eight", 
        "Nine", 
        "Ten", 
        "Eleven", 
        "Twelve", 
        "Thirteen", 
        "Fourteen", 
        "Fifteen", 
        "Sixteen", 
        "Seventeen", 
        "Eighteen", 
        "Nineteen"
    };

    private static final String[] tens = {
        "",
        "", 
        "Twenty", 
        "Thirty", 
        "Forty", 
        "Fifty", 
        "Sixty", 
        "Seventy", 
        "Eighty", 
        "Ninety"
    };

    private static final String[] hundreds = {
        "", 
        "Thousand", 
        "Million", 
        "Billion"
    };

    private String helper(int num){
        if(num == 0) return "";
        else if(num < 20) return lessThenTwenty[num] + " ";
        else if(num < 100) return tens[num/10] + " " + helper(num%10);
        else return lessThenTwenty[num/100] + " Hundred " + helper(num%100);
    }

    public String numberToWords(int num) {
        if(num==0) return "Zero";

        int i = 0;
        String word = "";

        while(num > 0){
            if(num % 1000 != 0){
                word = helper(num % 1000) + hundreds[i] + " " + word;
            }
            num/=1000;
            i++;
        }
        return word.trim();
    }
}
