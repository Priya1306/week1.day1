package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit =11;
		int firstnum= 0;
		int secondnum=1;
		int sum=0;
		System.out.print(firstnum+" ");
		System.out.print(secondnum+" ");
		//i<limit-2--as the first two values are printed in separate print statements
		for(int i=0;i<limit-2;i++) {   
			sum=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=sum;
			System.out.print(sum+" ");
		}
	}

}
