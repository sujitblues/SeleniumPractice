package arraylistpractice;

public class ArraysPractice {

	public static void main(String[] args) {
		int[] a;
		a=new int[100];
		a[0]=10;
		a[1]=20;
		a[2]=50;
		
		//a[3]=60;
		System.out.println(a[1]);
		int b[]=new int[3];
		int []c= {10,20,30};
		/*
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		*/
		for(int i:c)
		{
			System.out.println(i);
		}
		
		int []d,e;//both array
		int f[],g;//f array and g variable
		int h[];
		int[][] a1;
		a1=new int[2][3];
		int[][] a2={{10,20,30},{40,50,60}};
		
		for(int i=0;i<a2.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
				System.out.println(a2[i][j]);
			}
		}
		

	}

}
