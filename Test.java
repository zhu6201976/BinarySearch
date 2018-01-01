/**
二分法查找（折半查找）：前提是在已经排好序的数组中，
通过将待查找的元素与中间索引值对应的元素进行比较，
若大于中间索引值对应的元素，去右半部分查找，否则，
去左半部分查找。依此类推。直到找到为止；找不到返回一个负数。
*/

import java.util.Scanner;
import java.util.Arrays;
public class Test{
	public static void main(String[] args){
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(binarySearch(numbers,5));
	
	}
	
	public static int binarySearch(int[] numbers,int key){
		int start = 0;
		int end = numbers.length-1;
		while(start <= end){
			int middle = (start + end)/2;
			if(key > numbers[middle]){
				// 右半部分寻找
				start = middle+1;
			}else if(key < numbers[middle]){
				// 左半部分寻找
				end = middle-1;
			}else{
				return middle;
			}
		}
		return -1;
	}
	
}



