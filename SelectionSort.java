public class SelectionSort {

    static void SelectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            // swap
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        
    }
    
    public static void main(String [] args) {
        int [] array = {9,3,4,1,8,6};
        SelectionSort(array);
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k]+ " ");
        }
    }
    
}
    
