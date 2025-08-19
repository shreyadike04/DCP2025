import java.util.*;
class simple {
    
    public static List<Integer> findleader(int arr[]){
        List<Integer> leaders = new ArrayList<>();

        int n = arr.length;
        int rightmost = arr[n-1];
        leaders.add(rightmost);

        for(int i = n-2; i>=0; i--){
            if(arr[i] >= rightmost){
                leaders.add(arr[i]);
                rightmost = arr[i];
            }
        }
        Collections.reverse(leaders);
        return leaders;

    }

    public static void main(String[] args) {
        int arr[] = {1, 7, 4, 5};
        System.out.println(findleader(arr));
    }
}
