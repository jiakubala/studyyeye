package study_09_10;

import java.util.Arrays;

public class test06Arrays {

	public static void main(String[] args) {
		int a[] = new int[] {19,31,345,77,66,11};
		System.out.println("数组a为：");
		//转换成字符串
		System.out.println(Arrays.toString(a));
		//数组复制
		int b[] = Arrays.copyOfRange(a, 0, 4);
		System.out.println("数组b复制数组a后为：");
		System.out.println(Arrays.toString(b));
		//排序
        Arrays.sort(a); 
    	System.out.println("排序后数组a为：");
    	System.out.println(Arrays.toString(a));
    	//搜索
    	System.out.println("数字345 出现的位置："+Arrays.binarySearch(a, 345));
    	//判断是否相等
    	System.out.println(Arrays.equals(a, b));
    	//填充
    	int c[] = new int[10];
    	Arrays.fill(c, 99);
    	System.out.println(Arrays.toString(c));
	}

}
