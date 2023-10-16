package lab1;

public class CalculateDiff {
	static void calculateDiff(int n) {
		int sum = 0;int temp=0;
		for(int i=0;i<n;i++) {
			sum=sum+i*i;
			temp=temp+i;
			
		}
		System.out.println(sum-(temp*temp));
	}
	public static void main(String[] args) {
		System.out.println();
	}
	
}
