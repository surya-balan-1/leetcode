import java.util.Arrays;

public class RemoveElement2 {
    // my method
        public static  int removeElement(int[] nums, int val) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[i] != val) {
                        count = count + 1;
                        break;
                    } else if (nums[j] != val) {
                        nums[i] = nums[i] + nums[j];
                        nums[j] = nums[i] - nums[j];
                        nums[i] = nums[i] - nums[j];
                        count++;
                        break;
    
                    }
                }
            }
            return count;
        }
        //best method
        public static int removeElementBest(int[] nums, int val) {
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[index] = nums[i];
                    index++;
                }
            }
            return index;
        }
        public static void main(String[] args) {
            int a[]={1,2,2,3,4};
            int val=2;
            int count = removeElementBest(a,val);
            System.out.println("Array : "+Arrays.toString(a)+" count : "+count);
        }
    }

