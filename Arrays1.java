/*import java.util.*;
public class Arrays1 {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String args[]){
        int marks[]={99,88,90};
        update(marks);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}*/
/*import java.util.*;
public class Arrays1{
    public static int linearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5,10,20};
        int key=10;
        int index=linearSearch(numbers,key);
        if(index==-1){
            System.out.println("index not found");
        }
        else{
            System.out.println("key is at index "+index);
        }
    }
}*/
/*import java.util.*;
public class Arrays1{
    public static int linearSearch(String menu[],String key){
        for(int i=0;i<menu.length;i++){
            if(menu[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        String menu[]={"dosa","samosa","chole bhature","coke","frooti"};
        String key="dosa";
        int index=linearSearch(menu,key);
        if(index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("key is at index "+index);
        }
    }
}*/
/*import java.util.*;
public class Arrays1{
    public static int largest(int numbers[]){
        int largest=Integer.MIN_VALUE;//-infinity
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int numbers[]={0,1,5,6,7,8,9};
        System.out.println("the largest of all elements = "+largest(numbers));
    }
}*/
/*import java.util.*;
public class Arrays1{
    public static int binarySearch(int numbers[],int key){
        int n=numbers.length;
        int start=0,end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10,12,14};
        int key=10;
        System.out.println("index for key is "+binarySearch(numbers,key));
    }
}*/
/*import java.util.*;
public class Arrays1{
    public static void reverse(int numbers[]){
        int n=numbers.length;
        int start=0,end=n-1;
        while(start<end){
            int temp=numbers[start];
            numbers[start]=numbers[end];
            numbers[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        reverse(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}*/
/*import java.util.*;
public class Arrays1{
    public static void pairs(int numbers[]){
        int tp=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+numbers[i]+","+numbers[j]+")");
                tp++;
            }
            System.out.println();
        } 
        System.out.println("total pairs = "+tp); 
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        pairs(numbers);
    }
}*/
/*import java.util.*;
public class Arrays1{
    public static void subArrays(int numbers[]){
        int ts=0;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                    ts++;
                }
                System.out.println();
            }
        }
        System.out.println("total subarrays = "+ts);
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        subArrays(numbers);
    }
}*/
/*import java.util.*;
public class Arrays1{
    public static void maxSubarraysSum(int numbers[]){
        int sum;int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                sum=0;
                for(int k=start;k<=end;k++){
                    sum=sum+numbers[k];
                }
                System.out.println(sum);
                if(sum>maxsum){
                        maxsum=sum;
                }
            }
        }
        System.out.println("the maximum sum of the all the subarrays are = "+maxsum);
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
         maxSubarraysSum(numbers);
    }
}*/
//optimised method for max subarray sum
/*import java.util.*;
public class Arrays1{
    public static void maxSubarraysSum(int numbers[]){
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                sum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(sum>maxsum){
                        maxsum=sum;
                }
            
        }
    }
    System.out.println("the maximum sum of the all the subarrays are = "+maxsum);
}
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
         maxSubarraysSum(numbers);
    }
}*/
//kadane algorithm for max subarray sum
/*import java.util.*;
public class Arrays1{
    public static void maxSubarraysSum(int numbers[]){
        int sum=0;int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];
            sum=sum<0?0:sum;
            maxsum=Math.max(sum,maxsum);
        }
            System.out.println("the maximum sum of the all the subarrays are = "+maxsum);
    }
    public static void main(String args[]){
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
         maxSubarraysSum(numbers);
    }
}*/
/*import java.util.*;
public class Arrays1 {
    public static int trappedRainwater(int height[]) {
        int n = height.length;

        // calculate left max boundary array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calculate right max boundary array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String args[]) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainwater(height));
    }
}*/
/*import java.util.*;
public class Arrays1{
    public static int buyAndSellStocks(int prices[]){
        int bp=Integer.MAX_VALUE;int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            int sp=prices[i];
            if(bp<sp){
                int profit=sp-bp;
                maxProfit=Math.max(maxProfit,profit);
            }
            else{
                bp=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println(buyAndSellStocks(prices));
    }
}*/
//practice questions
/*1.import java.util.*;
public class Arrays1{
    public static boolean array(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j]){
                return true;
            }
        }
    }
    return false;
    }
    public static int array(int nums[],int target){
        
    }
    public static void main(String args[]){
        int nums[]={0,1,2,1,4};
        System.out.println(array(nums));
    }
}*/
/*2.import java.util.*;
public class Arrays1{
    public static int rotatedAndSortedSearch(int nums[],int target){
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[l]<=nums[mid]){//left half is sorted
                if(nums[l]<=target && target<nums[mid]){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                if(nums[r]<=target && target<nums[mid]){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[]={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(rotatedAndSortedSearch(nums,target));
    }
}*/
/*3.import java.util.*;
public class Arrays1{
    public static int buyAndSellStocks(int prices[]){
        int bp=Integer.MAX_VALUE,maxProfit=0;
        for(int i=0;i<prices.length;i++){
            int sp=prices[i];
            if(bp<sp){
                int profit=sp-bp;
                maxProfit=Math.max(maxProfit,profit);
            }
            else{
                bp=sp;
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[]={7,1,5,6,3,4};
        System.out.println(buyAndSellStocks(prices));
    }
}*/
/*import java.util.*;
public class Arrays1{
    public static int trappedRainwater(int height[]){
        int n =height.length;
        int trappedWater=0;
        int leftMax[]=new int [n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(rightMax[i],leftMax[i]);
            trappedWater+=waterlevel-height[i];
        }
        return trappedWater;
    }
    public static void main(String args[]){
        int height[]={0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trappedRainwater(height));
    }
}*/