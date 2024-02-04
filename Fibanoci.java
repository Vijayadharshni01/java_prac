import java.util.Scanner;
public class Fibanoci
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int a = 0;
		System.out.println(a);
		int b = 1;
		System.out.println(b);
		for(int i = 0; i<x;i++){
		    int c = a + b;
		    System.out.println(c);
		    a = b;
		    b = c;
		}
	}
}
