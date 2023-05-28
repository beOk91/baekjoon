package bronze;
import java.util.Scanner;
public class Baekjoon4562 {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int n=scan.nextInt();
	for(int i=0;i<n;i++) {
		int data1=scan.nextInt(),data2=scan.nextInt();
		System.out.println(data1<data2 ? "NO BRAINS": "MMM BRAINS");
	}
}
}
