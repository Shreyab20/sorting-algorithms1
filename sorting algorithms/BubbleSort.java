public class BubbleSort {
    public static void sort(int array[]){
        int swap = 0;
        for (int i=0; i<array.length-1; i++){
            //call this varaiable i as turns
            for(int j=0; j<(array.length-1-i);j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swap++;
                }
            }
        }
        System.out.println(swap+" swaps");
    }

    public static void print(int array[]){
        for(int i=0 ; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5}; 
        sort(array);
        print(array);   
    }
}
