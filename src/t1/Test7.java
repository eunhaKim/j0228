package t1;

// -1/2 + 2/3 - 3/4 + 4/5 ... 9/10 = ?
public class Test7 {
	public static void main(String[] args) {
		double i =0.0, tot = 0.0;
		int s = 1;
		
		while( i < 9 ) {
			i++;
			s = s * (-1);
			tot = tot + s*i/(i+1);			
		}
		System.out.println("-1/2 + 2/3 - 3/4 + 4/5 ... 9/10 = ? " + tot);
	}
}
