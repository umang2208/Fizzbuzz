package fizzBuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++) {
			System.out.println();
			if(i%3==0&&i%5==0) {
				System.out.print("FizzBuzz");
				continue;}
			if(i%3==0) {
				System.out.print("Fizz");
				continue;
			}
			if(i%5==0) {
				System.out.print("Buzz");
				continue;
			}
			else
				System.out.print(i);
		}
	}

}
