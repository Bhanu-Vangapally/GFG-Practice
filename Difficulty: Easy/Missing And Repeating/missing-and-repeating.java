// class Solution {
//     ArrayList<Integer> findTwoElement(int arr[]) {
//         // code here
//         int n=arr.length;
//         Map<Integer,Integer> mp=new HashMap<>();
//         for(int i:arr){
//             mp.put(i,mp.getOrDefault(i,0)+1);
//         }
//         ArrayList<Integer>ar=new ArrayList<Integer>();
//         int s=0;
//         for(Map.Entry<Integer,Integer> e:mp.entrySet()){
//             if(e.getValue()==2){ 
//                 ar.add(e.getKey());
//                 break;
//             }
//             s+=e.getKey();
//         }
//         ar.add(((n*(n+1))/2)-s);
//         return ar;
//     }
// }
import java.util.ArrayList;

class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;
        int[] freq = new int[n + 1];  // Frequency array

        for (int i : arr) {
            freq[i]++;
        }

        int repeating = -1, missing = -1;

        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                repeating = i;
            } else if (freq[i] == 0) {
                missing = i;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeating);
        result.add(missing);

        return result;
    }
}
