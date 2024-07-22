import java.util.Arrays;

public class reversingSubarrayMakesArraySorted {
    public static boolean reverseSubArray(int[] nums, int n){
        
        int[] temp = new int[n];
        for(int i = 0; i<n; i++){
            temp[i] = nums[i];
        }

        Arrays.sort(temp);

        int front;
        for(front = 0; front < n; front++){
            if(temp[front] != nums[front]){
                break;
            }
        }

        int back;
        for(back = n-1; back>=0; back--){
            if(temp[back] != nums[back]){
                break;
            }
        }

        if(front > back) return true;

        do{
            front++;
            if(nums[front-1] < nums[front]){
                return false;
            }
        }while(front != back);

        return true;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 5, 6, 4, 3}; 
        int n = nums.length; 
  
        if (reverseSubArray(nums, n)) { 
            System.out.print("Yes"); 
        } else { 
            System.out.print("No"); 
        } 
    }
}
