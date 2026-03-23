public class MaxProductSubarray {
    public static void main(String[] args) {
        int nums[]={2,3,-5,4};
        int maxProduct=nums[0];
        int minProduct=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
            int num=nums[i];
            if(num<0){
                int temp=maxProduct;
                maxProduct=minProduct;
                minProduct=temp;
            }
            maxProduct=Math.max(num,num*maxProduct);
            minProduct=Math.min(num,num*minProduct);
            result=Math.max(result,maxProduct);
        }
        System.out.println(result);
    }
}
