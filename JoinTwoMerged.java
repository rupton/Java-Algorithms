public class JoinTwoMerged {
    
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,3,4,5};
        int[] arr2 = new int[]{2,6,7,8};
        int[] sorted = mergeArrays(arr1, arr2);
        for (int i : sorted) {
            System.out.println(i);
        }
        ;
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2){
        int[] results = new int[arr1.length + arr2.length];
        int i = 0, k = 0, j = 0;
        int s1 = arr1.length;
        int s2 = arr2.length;

        while(i < s1  && j < s2){
            if(arr1[i] < arr2[j]){
                results[k++] = arr1[i++];
            }else{
                results[k++] = arr2[j++];
            }
        }
        System.out.print("i == " + i);
        System.out.println(" j== " + j);
        while(i < s1){
            results[k++] = arr1[i++];
        }
        while(j < s2){
            results[k++] = arr2[j++];
        }
        return results;
    }
}
