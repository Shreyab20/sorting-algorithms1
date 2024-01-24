public class SelectionSort {
    public static void sort(int nums[]) {
        for (int i=0; i<nums.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<nums.length-1; j++){
                if(nums[j] < nums[smallest]){
                    smallest = j;
                }  
            }
            int temp = nums[smallest] ;
            nums[smallest] = nums[i] ;
            nums[i] = temp;
        }
    }
    public static void print(int nums[]){
        for (int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int nums[] = {4,2,1,3,5};
        sort(nums);
        print(nums);
    }
}
