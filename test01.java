package study_09_10;

public class test01 {
	public static void main(String[] args) {
		
		    //´òÓ¡µ¥Êı
	  boolean breakout = false;
			for(int i=0;i<10;i++) {
				
				for(int j=0;j<10;j++) {
					System.out.println(i+":"+j);
					if(j%2!=0) {
						breakout = true;
					    break;
				}
			}
			if(breakout)
				break;
	}
}
}
