package t1;

// 1~100까지의 10항식의 합을 출력하시오
/*
 1 ~ 10 : 55
 11 ~ 20 : __
 21 ~ 30 : __
 ...
 91 ~ 100 : __
 */
public class Test5 {
	public static void main(String[] args) {
		int i =0, tot = 0;
		
		while( i < 100 ) {
			i++;
			tot += i;			
			
			if(i%10 == 0) {
//				System.out.println((i/10-1)*10+1 + " ~ " + i + " : " + tot);
				System.out.println( i-9 + " ~ " + i + " : " + tot);
				tot = 0;
			}
			
		}
		
	}
}
