package algorithm;

import java.util.Arrays;

/**
 * 选择排序
 *  一个一个找，按照最小的元素找
 * Created by JayJ on 2018/10/12.
 **/
class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {4,2,1,6,7,3,8,4,9,0};
        selectionSort(arr,10);
        System.out.println(Arrays.toString(arr));
    }

    //排序
    public static void selectionSort(int[] arr , int n){
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp ;
                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
