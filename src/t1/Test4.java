package t1;

// 1~100까지의 10항식의 합을 출력하시오
/*
 1 ~ 10 : 55
 1 ~ 20 : 210
 1 ~ 30 : __
 ...
 1 ~ 100 : 5050
 */
public class Test4 {
	public static void main(String[] args) {
		int i =0, tot = 0;
		
		while( i < 100 ) {
			i++;
			tot += i;			
			
			if(i%10 == 0) System.out.println("1 ~ " + i + " : " + tot);
		}
		System.out.println("1 ~ 100까지의 합은? " + tot);
	}
}
