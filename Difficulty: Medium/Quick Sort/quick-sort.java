class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low<high){
        int pi=partition(arr,low,high);
        quickSort(arr,low,pi-1);
        quickSort(arr,pi+1,high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot=arr[high];
        int i=low-1;
        // code here
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int t=arr[j];
                arr[j]=arr[i];
                arr[i]=t;
            }
        }
        i++;
        int t=arr[i];
        arr[i]=arr[high];
        arr[high]=t;
        return i;
    }
}