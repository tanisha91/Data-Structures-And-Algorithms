import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={9,1,3,2,5,10,6,4};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionsort( int[] arr ){
        for(int i=0; i< arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                 if(arr[j]<arr[min]){
                     min=j;
                 }

            }

            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
}
