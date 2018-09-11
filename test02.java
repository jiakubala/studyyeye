package study_09_10;

public class test02 {

	public static void main(String[] args) {
		for(int i=100;i<1000;i++) {
			int a = i/100;
			int b = i/10%10;
			int c = i%10;
			int sum = a*a*a+b*b*b+c*c*c;
			if(sum == i) {
				System.out.println("水仙花数为："+i);
			}
		}

	}

}
