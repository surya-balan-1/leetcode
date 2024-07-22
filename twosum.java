import java.util.*;;

public class twosum {
    public static void main(String[] args) {
        Map<Integer,Integer> a=new HashMap<>();
        int arr[]={1,2,3,3,4,5,6,4};
        int target=9;
        for(int i=0;i<arr.length;i++){
            int complement=target-arr[i];
            if(a.containsKey(complement)){
                System.out.printf("%d %d \n",a.get(complement),i);
            }
            a.put(arr[i],i);
        }
        for (Map.Entry<Integer, Integer> entry : a.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
