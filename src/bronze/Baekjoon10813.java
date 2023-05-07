package bronze;
import java.util.Scanner;
public class Baekjoon10813 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N = scan.nextInt(),M= scan.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=i+1;
		}
		for(int k=0;k<M;k++) {
			int i=scan.nextInt(),j= scan.nextInt();
			int temp=arr[i-1];
			arr[i-1]=arr[j-1];
			arr[j-1]=temp;
		}
		String result="";
		for(int temp:arr) {
			result+=temp+" ";
		}
		System.out.println(result.trim());
	}
}
