package study_09_10;

public class test03 {

	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = (int)(Math.random()*100);
		a[1] = (int)(Math.random()*100);
		a[2] = (int)(Math.random()*100);
		a[3] = (int)(Math.random()*100);
		a[4] = (int)(Math.random()*100);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				int m=0;
				m=a[j+1];
				a[j+1]=a[j];
				a[j]=m;
			}
		}
		System.out.println("数组反转后：");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
