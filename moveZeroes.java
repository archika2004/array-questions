public class moveZeroes {
    public void moveZeroes(int[]nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        while(j<nums.length){
            nums[j]=0;
            j++;
        }
    }
    public static void main(String[] args) {
        int nums[]={0,1,2,0,0,3};
        moveZeroes obj=new moveZeroes();
        obj.moveZeroes(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }  
    }
}
