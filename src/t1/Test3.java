package t1;

// 1~100까지의 홀수합
public class Test3 {
	public static void main(String[] args) {
		int i = 1, tot = 1;
		
		while( i < 99 ) {
			i = i + 2;
			tot += i;			
		}
		System.out.println("1~100까지의 홀수합은? " + tot);
	}
}
