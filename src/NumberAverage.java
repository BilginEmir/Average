
import java.util.Scanner;
public class NumberAverage 
{
	public static void main( String[] args )
{
	Scanner input= new Scanner(System.in);

	System.out.print("Number 1 : ");
	int number1 = input.nextInt();

	System.out.print("Number 2 : ");
	int number2 = input.nextInt();

	System.out.print("Number 3 : ");
	int number3 = input.nextInt();

	int sum = ( number1 + number2 + number3 );
	double average = ( sum / 3 );
	long product = ( number1 * number2 * number3 );
	
	if( number1 > number2 && number1 > number3 )
	{
	System.out.println(" Number 1 > Number 2 and Number 3 " );
	}

	else if( number2 > number1 && number2 > number3 )
	{
	System.out.println(" Number 2 > Number 3 and Number 3" );
	}

	else
	{
	System.out.println(" Number 3 > Number 2 and Number 1" );
	}


	if( number1 < number2 && number1 < number3 )
	{
	System.out.println(" Number 1 < Number 2 and Number 3 " );
	}

	else if( number2 < number1 && number2 < number3 )
	{
	System.out.println(" Number 2 < Number 1 and Number 3" );
	}

	else if(number3 < number1 && number3 < number2)
	{
	System.out.println(" Number 3 < Number 1 and Number 2 " );
	}
	
	else {
		System.out.println("Error");
	}

	System.out.println("Total : " + sum );
	System.out.println("Average : " + average );
	System.out.println("Multipl : " + product );
}
}