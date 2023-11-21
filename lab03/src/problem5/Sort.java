package problem5;

public class Sort{
    public static <E> void swap(E[] arr, int i, int j){
        E x = arr[i];
        arr[i] = arr[j];
        arr[j] = x;
    }

    public static<E extends Comparable<E>> void selectionSort(E[] arr){
        for(int i = 0; i < arr.length; i++){
            E k = arr[i];
            int idx = i;
            for(int j = i + 1; j < arr.length; j++){
                if(k.compareTo(arr[j]) > 0){ 
                    k = arr[j];
                    idx = j;
                }
            }
            swap(arr, i, idx);
        }
    }

    public static<E extends Comparable<E>> void insertionSort(E[] arr){
        for(int i = 1; i < arr.length; i++){
            for(int j = i; j > 0; j--){
                if(arr[j - 1].compareTo(arr[j]) > 0) swap(arr, j - 1, j);
                else break;
            }
        }
    }




}
