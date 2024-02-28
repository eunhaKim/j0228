package t1;

// 1 - 2 + 3 - 4 ... -10?
public class Test6 {
	public static void main(String[] args) {
		int i =0, tot = 0, s = 1;
		
		while( i < 100 ) {
			i++;
			tot = tot + i*s;	
			System.out.print(i*s);
			
			s = -1*s;
			if(s>0) System.out.print("+");
			
		}
		System.out.println();
		System.out.println(tot);
	}
}
