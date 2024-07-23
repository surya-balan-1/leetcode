public class Mergesortedarray {
        //my method 
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            for(int i=0;i<n;i++){
                int k=m;
                if(m>0 && nums2[i]>nums1[m-1]){
                    nums1[m]=nums2[i];
                }  
                else {
                    while(k>0 && nums2[i]<nums1[k-1]){
                        int temp=nums1[k-1];
                        nums1[k-1]=nums1[k];
                        nums1[k]=temp;
                        k--;
    
    
                    }
                nums1[k]=nums2[i];
                }
                m++;
                    
            }
        }
        // optimal best method

        class Solution {
            public void merge2(int[] nums1, int m, int[] nums2, int n) {
                int i=m-1;
                int j=n-1;
                int k=m+n-1;
                while(j>=0){
                    if(i>=0 && nums1[i]>nums2[j])
                    {
                        nums1[k--]=nums1[i--];
                    }
                    else
                    {
                        nums1[k--]=nums2[j--];
                    }
                }
            }
        }
    }
