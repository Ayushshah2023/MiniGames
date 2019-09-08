import java.util.Scanner ;

class Game
{
	public static void main ( String ... args )
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the small increase bid ");
			int minim = s.nextInt();
			System.out.println("Enter the big increase bid ");
			int maxim = s.nextInt();
			System.out.println("Enter the base value ");
			int base = s.nextInt();
			int count = base ;
			System.out.println("Enter the ending value ");
			int ends = s.nextInt();
			int a = 0 ;
			int b = 0 ;
			int ct = 0 ;
			int tc = base;
			while( (count + minim) < ends )
			{
				ct++ ;
				System.out.println("Enter a value between min and max ");
				int c = s.nextInt();
				if(c < minim )
				{
					c = minim ; 
				}
				else if(c > maxim )
				{
					c = maxim ; 
				}
				else
				{
					c = c*1;
				}
				tc= tc+c;
				System.out.println("The current total is" + tc);
				count = count + c ; 
				if( ct % 2 != 0 )
				{
					a =1 ;
					b = 0;
					System.out.println("Now Player 2's TURN");
				}
				if( ct % 2 == 0 )
				{
					b =1 ;
					a = 0;
					System.out.println("Now Player 1's TURN");
				}
			}
		if (a ==1 )
		{
			System.out.println(" Player 1 won " ) ;
		}
		if ( b == 1)
		{
			System.out.println(" Player 2 won " );
		}
		
	}
}