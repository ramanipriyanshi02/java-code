class p25{
	public static void main(String args[]){
	try{
		int a = 10;
		int b = 2;

		int c = a/b;
		
		System.out.println(c);

		int arr[] = {10,20,30};
		System.out.println(arr[15]);
	    }	
	catch(ArithmeticException e)
	{
		System.out.println("cannot divide by zero");
	}

	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Array index is out of range");
	}

	catch(Exception e)
	{
		System.out.println("program completed");
	}

   }

}