import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int a,b,n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			a=sc.nextInt();
			b=sc.nextInt();
			if(a>b) {
				System.out.println(">");
			}else if(a<b) {
				System.out.println("<");
			}else {
				System.out.println("=");
			}
		}
	}

}
