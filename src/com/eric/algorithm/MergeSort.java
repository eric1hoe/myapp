package com.eric.algorithm;

import java.util.Arrays;

import org.junit.Test;

public class MergeSort {
	@Test
	public void test(){
		int[] arrays={7,1,3,8,5,2,9,6,3};
		int[] temp=new int[arrays.length];
		mergeSort(arrays,0,arrays.length-1,temp);
		System.out.println(Arrays.toString(arrays));
	}

	private void mergeSort(int[] arrays, int left, int right, int[] temp) {
		if(right>left){
			int mid=(right+left)/2;
			mergeSort(arrays, left, mid, temp);
			mergeSort(arrays, mid+1, right, temp);
			//merge
			int n=0;
			int mid1=mid+1;
			int l=left;
			while(left<=mid&&mid1<=right){
				if(arrays[left]<=arrays[mid1]){
					temp[n++]=arrays[left++];
				}else{
					temp[n++]=arrays[mid1++];
				}
			}
			//Ê£ÓàÊý¸´ÖÆ
			while(left<=mid){
				temp[n++]=arrays[left++];
			}
			while(mid1<=right){
				temp[n++]=arrays[mid1++];
			}
			for(int i=0;i<n;i++)
				arrays[l+i]=temp[i];
		}
	}
}
