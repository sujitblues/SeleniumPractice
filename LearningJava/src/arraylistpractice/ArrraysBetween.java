package arraylistpractice;

import java.util.stream.IntStream;

public class ArrraysBetween {
	public static int[] between(int a,int b)
	{
		return IntStream.range(a, b).toArray();
		
	}

	public static void main(String[] args) {
		//1 to 4-->[1,2,3,4]
		//1 to 10 -->[1,2,3,4,5,6,7,8]
		
		between(1,4);

	}

}
