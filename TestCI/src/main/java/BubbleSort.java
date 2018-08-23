import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
 		int[] arr={12,45,89,2,10,9};
 		maopaoSort(arr);	
 	}
	
 	/*
 	 * 冒泡排序
 	 */
 	public static void maopaoSort(int[] arr) {
 		for(int i=0;i<arr.length-1;i++){
 			for(int j=0;j<arr.length-1-i;j++){
 				if(arr[j]>arr[j+1]){
 					int temp=arr[j];
 					arr[j]=arr[j+1];
 					arr[j+1]=temp;
 				}
 			}
 		}
 		System.out.println("冒泡排序:"+Arrays.toString(arr));
 		System.out.println("输出成功");
 	}

}
	