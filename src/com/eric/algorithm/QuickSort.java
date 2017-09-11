package com.eric.algorithm;

public class QuickSort {

	public static void main(String[] args) {
		int[] arrays={7,1,3,8,5,2,9,6,9,3};
		int low=0;
		int high=arrays.length-1;
		quickSort(arrays,low,high);
		for(int num :arrays){
			System.out.print(num+" ");	
		}
	}

	private static void quickSort(int[] arrays,int low,int high) {
		if(high<=low)
			return;
		int _low=low;
		int _high=high;
		int temp=arrays[low];//比较数
		while(high>low){//指针不重合
			while(arrays[high]>temp&&high>low){high--;}
			arrays[low]=arrays[high];
			while(arrays[low]<temp&&high>low){low++;}
			arrays[high]=arrays[low];
		}
		arrays[high]=temp;
		quickSort(arrays,_low,low-1);
		quickSort(arrays,low+1,_high);
	}
	/*public static void quickSort(int arr[],int _left,int _right){
        int left = _left;
        int right = _right;
        int temp = 0;
        if(left <= right){   //待排序的元素至少有两个的情况
            temp = arr[left];  //待排序的第一个元素作为基准元素
            while(left != right){   //从左右两边交替扫描，直到left = right

                while(right > left && arr[right] >= temp)  
                     right --;        //从右往左扫描，找到第一个比基准元素小的元素
                  arr[left] = arr[right];  //找到这种元素arr[right]后与arr[left]交换

                while(left < right && arr[left] <= temp)
                     left ++;         //从左往右扫描，找到第一个比基准元素大的元素
                  arr[right] = arr[left];  //找到这种元素arr[left]后，与arr[right]交换

            }
            arr[right] = temp;    //基准元素归位
            quickSort(arr,_left,left-1);  //对基准元素左边的元素进行递归排序
            quickSort(arr, right+1,_right);  //对基准元素右边的进行递归排序
        }        
    }*/
}
