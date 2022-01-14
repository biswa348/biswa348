package javasimplilearn;
public class TypeCasting{

		public static void main(String[] args)
		{
			
			// TODO Auto-generated method stub 
			// implicit
	      int i=30;
	      long l=i;
	      float f=l;
	      System.out.println("int value "+ i);
	      System.out.println("long value "+ l);
	      System.out.println("float value "+ f);
	     //explicit
	      double d=40.0;
	      int x=(int)d;
	      long z=(long)x;
	      System.out.println("double value "+ d);
	      System.out.println("integer value "+ x);
	      System.out.println("long value "+ z);


		}

	}


