/* 
1).WAM to add an arrays of ints and return the sum value. Test for boundary cases.

2).WAM to accept an array of ints as parameter. 
The method should return the max value from it. 
Add another method which returns the min from the elements.

3).WAM to pass 2 arrays of ints to a method. 
The method should return the max value present across both the array elements.

4).WAM to pass 2 arrays of ints to a method. 
The method should return the average of the values across the 2 arrays. 
The avg returned should be exact and not an approximation.

5).WAM to accept an int input. 
The method should return whether the num passed is a square (like i/p-> 100, 9, 16, etc -> o/p should be true) or not.

6).WAM to accept an int input. Find the sum of the digits in the number and return it.

7).WAM to accept an int ex:cba as input. 
If it contains 3 digits, the returned value should be a+ b*b + c*c*c where a is the units, b is the tens and c is the third digit. 
Be careful of overflow here.

8).

9).WAM to accept an int as input and return whether the number is a palindrome or not.

10). WAM to accept 2 int arrays as parameters. The method should return one array with only unique elements across both the arrays.
*/

class ArrayMethods
{
	public static int AddArray(int array[])
	{
		int sum =0;
		
		for(int i =0; i < array.length;i++)
		   sum += array[i];
		
		return sum;
	}

	public static int Max(int array[])
	{
		int max = 0;
		for(int i = 0; i < array.length; i++)
		{
			if(max < array[i])
			   max = array[i];
		}
		return max;
	}
	
	public static int Min(int array[])
	{
		int min = 0;
		for(int i = 0; i < array.length; i++)
		{
			if(min > array[i])
			   min = array[i];
		}
		return min;
	}

	public static int MaxArrayTwo(int [] array1, int [] array2)
	{
		int len1 = array1.length;
		int len2 = array2.length;
		int max1 = 0;
		int max2 = 0;		
		for(int i = 0 ; i < len1; i++)
		{
			if ( max1 < array1[i] )
			   max1 = array1[i];
		}
		for(int i = 0; i < len2; i++)
		{
			if(max2 < array2[i])
			   max2 = array2[i];
		}
		return((max1 > max2) ? max1 : max2);
	}
	
	public static float AvgArrayTwo(int [] array1 , int [] array2)
	{	
		int len1 = array1.length;
		int len2 = array2.length;
		int sum1 = 0;
                int sum2 = 0;
		float avg,avg1,avg2 = 0f;
	
		for(int i =0; i < len1; i++)
			sum1 = sum1 + array1[i];
		for(int i =0; i < len2; i++)
			sum2 = sum2 + array2[i];
		
		avg1 = sum1/(float)len1;
		avg2 = sum2/(float)len2;
		avg = (avg1+avg2)/2;

		return avg;
	}

	public static boolean SquareNumber(int num)
	{
		int i = 0;
        if(num <= 0)
		{
		   return false;
		}
		while(i < num)
		{
			if((i*i) == num)
			{
				
				return true;
			}
			else				
			{
				i++;
				continue;
			}
		}
		return false;
	}

	public static int SumOfDigits(int num)
	{
		int sum = 0;
		while(num != 0)
		{
			sum = sum + (num % 10);
			num = num/10;
		}
		return sum;
	}
	
	public static int DigitManipulation(int num)
	{
		int count = 0;
		int sum = 0;
		int sum1 = 0;
		int temp = 0;
		int temp1 = 0;

		while(num != 0)
		{
			count++;
			sum = num % 10;
			temp1 = sum;
                        temp = count;
			while(temp != 1)
			{
				sum = temp1 * sum;
				temp--;
			}
			sum1 += sum;
			num = num/10;
		}

		return (sum1);
	}

	public static boolean Palindrome(int num)
	{
			int count = 0;
			int temp = num;
			//To count the number of digits in a number
			while(temp != 0)
			{
				count++;
				temp = temp/10;
			}
			int [] array1 = new int[count];
			int [] array2 = new int[count];
			temp = num;
			int i = 0;
			int idx = 0;
			int jdx = 0;
		            int j = count;
			while(temp != 0)
			{
				array1[i++] = (temp % 10);
				array2[--j] = (temp % 10);
				temp = temp/10;
			}
			temp = num;
			for(;idx<array1.length;idx++,jdx++)
			{ 
				if(array1[idx] == array2[jdx])
				{
					continue;
				}
				else
				{
					return false;
				}
			}
			    if((idx == count) && (jdx == count))
			{
				return true;
			}
			else
			    {
				return false;
			}
	}

	public static int []  ArrayUnique(int [] array1, int [] array2)
	{
		int len = array1.length;
		int len1 = array2.length;
		int len2 = len + len1;
		int z = 0;
		int [] array3 = new int[len2];
		int k = 0;
		for(int i = 0; i < array1.length; i++)
		{
			array3[i] = array1[i];
		}
		for(k = 0 ;k < array2.length;k++)
		{
			for(int j=0; j < array1.length;j++)
			{
				if(array2[k] == array3[j])
					continue;
				else
			    		break;
			}
			
			array3[len+(z++)] = array2[k];
		}
		return array3;
	}

}
