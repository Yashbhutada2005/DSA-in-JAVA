package G0_ArrayBasic;

public class P11_MergeTwoArray {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7, 9};
        int arr2[] = {2, 4, 6, 8, 10};

        int mergedArray[] = new int[arr1.length + arr2.length];

        int k = 0;

        for(int i = 0; i < arr1.length; i++){
            mergedArray[k++] = arr1[i];
        }

        for(int i = 0; i < arr2.length; i++){
            mergedArray[k++] = arr2[i];
        }

        // Bubble Sort
        for(int i = 0; i < mergedArray.length; i++){
            for(int j = 0; j < mergedArray.length-i-1; j++){
                if(mergedArray[j] > mergedArray[j+1]){

                    int temp = mergedArray[j];
                    mergedArray[j] = mergedArray[j+1];
                    mergedArray[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < mergedArray.length; i++){
            System.out.print(mergedArray[i] + " ");
        }
    }
}
