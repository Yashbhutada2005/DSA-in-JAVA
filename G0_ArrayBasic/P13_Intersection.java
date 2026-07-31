package G0_ArrayBasic;

public class P13_Intersection {
    public static void main(String[] args) {
        
        int arr1[] = {12,64,97,21,7,34,65};
        int arr2[] = {12,21,34,45,56};

        System.out.println("Intersection of two arrays: ");
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i] + " ");
                }
            }
        }
    }
}
