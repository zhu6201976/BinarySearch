/**
���ַ����ң��۰���ң���ǰ�������Ѿ��ź���������У�
ͨ���������ҵ�Ԫ�����м�����ֵ��Ӧ��Ԫ�ؽ��бȽϣ�
�������м�����ֵ��Ӧ��Ԫ�أ�ȥ�Ұ벿�ֲ��ң�����
ȥ��벿�ֲ��ҡ��������ơ�ֱ���ҵ�Ϊֹ���Ҳ�������һ��������
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
				// �Ұ벿��Ѱ��
				start = middle+1;
			}else if(key < numbers[middle]){
				// ��벿��Ѱ��
				end = middle-1;
			}else{
				return middle;
			}
		}
		return -1;
	}
	
}



