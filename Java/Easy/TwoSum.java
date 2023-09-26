import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {


        System.out.println(Arrays.toString(solve(new int[]{2,7,11,15}, 9)));
        System.out.println(Arrays.toString(solve(new int[]{3,2,4}, 6)));
    }

    public static int[] solve(int[] list, int targetSum){
        for(int i = 0; i < list.length; i++){
            for(int j = i + 1; j < list.length; j++){
                if(list[i] + list[j] == targetSum)
                    return new int[] {i, j};
            }
              
        } 
        	return new int[] {};
    }
}
