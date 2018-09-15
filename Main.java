import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		double p,q,n,s1,s2,p1,p2,a=19,b=24,c=51;
		
		System.out.println("Enter 'p' value :");
		p = in.nextDouble();
		System.out.println("Enter 'q' value :");
		q = in.nextDouble();
		n = p*q;
		System.out.println("Enter 's1' value :");
		s1 = in.nextDouble();
		System.out.println("Enter 's2' value :");
		s2 = in.nextDouble();
		System.out.println("Enter 'p1' value :");
		p1 = in.nextDouble();
		System.out.println("Enter 'p2' value :");
		p2 = in.nextDouble();
		
		double A=(a*a)%n, B=(b*b)%n, C=(c*c)%n;
		double M=(a*(Math.pow(s1, 0)*Math.pow(s2, 1)))%n, P=(b*(Math.pow(s1, 1)*Math.pow(s2, 0)))%n, Q=(c*(Math.pow(s1, 1)*Math.pow(s2, 1)))%n;
		
		if((((s1*s1)*p1)%n==1) && (((s2*s2)*p2)%n==1)) {
			System.out.println("a, b, c are valid");
			if((((M*M)*(Math.pow(p1, 0)*Math.pow(p2, 1)))%n)==A && (((P*P)*(Math.pow(p1, 1)*Math.pow(p2, 0)))%n)==B && (((Q*Q)*(Math.pow(p1, 1)*Math.pow(p2, 1)))%n)==C) {
			System.out.println("Bob's verifies Alice");
			System.out.println("A = "+A+" B = "+B+" C = "+C);
			System.out.println("M = "+M+" P = "+P+" Q = "+Q);
			}else {
				System.out.println("Bob can't verify Alice");
			}
		}else {
			System.out.println("Invalid values");
		}

		}
	}
