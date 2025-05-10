
public class AdaLovelace {

    public static void main(String[] args) {
        // Write your program here
       System.out.println("Ada Lovelace");
    }
    // public String changeXY(String str) {
       
      
    // }
    public boolean array6(int[] nums, int index) {
    if(index>=nums.length){
        return  false;
    }
      return nums[index]==6||array6(nums, index+1);
    
}

