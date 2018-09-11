package study_09_10;

public class test04Selectsort {

	public static void main(String[] args) {
		int a[] = new int[] {19,20,70,39,94,12};
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
        for(int i=0;i<a.length-1;i++) {
        	for(int j=i+1;j<a.length;j++) {
        		if(a[j]<a[i]) {
        			int m=0;
        			m=a[j];
        			a[j]=a[i];
        			a[i]=m;
        		}
        	}
        }
		System.out.println("Ñ¡ÔñÅÅÐòºó£º");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
