class Solution {

    void swap(int[] arr, int fir, int sec) {
        int temp = arr[fir];
        arr[fir] = arr[sec];
        arr[sec] = temp;
    } 

    int partiton(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i < j) {
            while(arr[i] <= pivot && i <= high - 1) i++;
            while(arr[j] > pivot && j >= low + 1) j--;

            if(i < j) swap(arr, i, j);
        }

        swap(arr, j, low);
        return j;
    }

    void qs(int[] arr, int low, int high) {
        if(low < high) {
            int pivot = partiton(arr, low, high);
            qs(arr, low, pivot - 1);
            qs(arr, pivot + 1, high);
        }
    }

    int[] quickSort(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        qs(arr, low, high);
        return arr;
    }
}

class _02_Main_Hoare{
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        int n = arr.length;

        System.out.println("Before Sorting Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        Solution sol = new Solution();
        int[] sortedArr = sol.quickSort(arr);

        System.out.println("After Sorting Array: ");
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}