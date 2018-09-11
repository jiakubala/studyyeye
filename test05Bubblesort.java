package study_09_10;

public class test05Bubblesort {

	public static void main(String[] args) {
		int a[]=new int[] {10,90,30,54,64,88,22};
        for(int i=0;i<a.length;i++) {
        	System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        for(int i=0;i<a.length;i++) {
        	for(int j=1;j<a.length-1-i;j++) {
        		if(a[j+1]<a[j]) {
        			int m=0;
        			m=a[j+1];
        			a[j+1]=a[j];
        			a[j]=m;
        		}
        	}
        }
    	System.out.println("Ã°ÅÝÅÅÐòºóÎª£º");
    	for(int i=0;i<a.length;i++) {
        	System.out.print(a[i]+" ");
        }
	}

}
