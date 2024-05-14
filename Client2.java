interface SortAlgorithm{
    void Sort(int[] arr);
}

class BubbleSort implements SortAlgorithm{
    int tmp=0;
    @Override
    public void Sort(int[] arr) {
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
    
class InsertionSort implements SortAlgorithm{
    @Override
    public void Sort(int[] arr) {
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

class Algorithm{
    private final SortAlgorithm sortAlgorithm;
    public Algorithm(SortAlgorithm sortAlgorithm){
        this.sortAlgorithm = sortAlgorithm;
    }
    public void Sort(int[] a){
        sortAlgorithm.Sort(a);
    }
}


//객체 대리 생성
class SortConfig{
    public Algorithm sorting(){
        return new Algorithm(new BubbleSort());
    }
}

public class Client2 {
    public static void main(String[] args) {
        int[] a = {5, 4, 5, 7 ,2};
        SortConfig sortConfig = new SortConfig();
        Algorithm algorithm = sortConfig.sorting();
        algorithm.Sort(a);

        //출력
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}