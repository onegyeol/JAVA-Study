import java.util.*;

class SortAlgorithm{
    int tmp =0;
    void Sort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}

class InsertionSort extends SortAlgorithm{
    
    @Override
    void Sort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int target = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j]> target){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = target;
        }
    }
}

class BubbleSort extends SortAlgorithm{
    int tmp=0;
    
    @Override
    void Sort(int[] arr){
        for(int i=1; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}

public class Client{
    public static void main(String[] args) {
        int[] a = {5, 4, 5, 7 ,2};
        SortAlgorithm s = new BubbleSort();
        s.Sort(a);

        //print
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}