package G0_ArrayBasic;

public class P12_FindDuplicate {
    public static void main(String[] args) {
        
        int arr[] = {12,64,97,21,7,34,65,12,21};

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println("Duplicate element found: " + arr[i]);
                }
            }
        }
    }
}
