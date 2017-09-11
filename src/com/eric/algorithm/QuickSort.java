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
		int temp=arrays[low];//�Ƚ���
		while(high>low){//ָ�벻�غ�
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
        if(left <= right){   //�������Ԫ�����������������
            temp = arr[left];  //������ĵ�һ��Ԫ����Ϊ��׼Ԫ��
            while(left != right){   //���������߽���ɨ�裬ֱ��left = right

                while(right > left && arr[right] >= temp)  
                     right --;        //��������ɨ�裬�ҵ���һ���Ȼ�׼Ԫ��С��Ԫ��
                  arr[left] = arr[right];  //�ҵ�����Ԫ��arr[right]����arr[left]����

                while(left < right && arr[left] <= temp)
                     left ++;         //��������ɨ�裬�ҵ���һ���Ȼ�׼Ԫ�ش��Ԫ��
                  arr[right] = arr[left];  //�ҵ�����Ԫ��arr[left]����arr[right]����

            }
            arr[right] = temp;    //��׼Ԫ�ع�λ
            quickSort(arr,_left,left-1);  //�Ի�׼Ԫ����ߵ�Ԫ�ؽ��еݹ�����
            quickSort(arr, right+1,_right);  //�Ի�׼Ԫ���ұߵĽ��еݹ�����
        }        
    }*/
}
