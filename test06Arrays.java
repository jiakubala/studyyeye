package study_09_10;

import java.util.Arrays;

public class test06Arrays {

	public static void main(String[] args) {
		int a[] = new int[] {19,31,345,77,66,11};
		System.out.println("����aΪ��");
		//ת�����ַ���
		System.out.println(Arrays.toString(a));
		//���鸴��
		int b[] = Arrays.copyOfRange(a, 0, 4);
		System.out.println("����b��������a��Ϊ��");
		System.out.println(Arrays.toString(b));
		//����
        Arrays.sort(a); 
    	System.out.println("���������aΪ��");
    	System.out.println(Arrays.toString(a));
    	//����
    	System.out.println("����345 ���ֵ�λ�ã�"+Arrays.binarySearch(a, 345));
    	//�ж��Ƿ����
    	System.out.println(Arrays.equals(a, b));
    	//���
    	int c[] = new int[10];
    	Arrays.fill(c, 99);
    	System.out.println(Arrays.toString(c));
	}

}
