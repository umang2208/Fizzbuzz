package fizzBuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++) {
			System.out.println();
			//first checking number is devisible by 3 and 5 both
			if(i%3==0&&i%5==0) {
				System.out.print("FizzBuzz");
				continue;}
			//for checking number is divisible by 3
			if(i%3==0) {
				System.out.print("Fizz");
				continue;
			}
			//for checking number is divisible by 5
			
			if(i%5==0) {
				System.out.print("Buzz");
				continue;
			}
			else
				System.out.print(i);
		}
	}

}
