package arraylistpractice;

public class ArrayAndArraylistPractice {

	public static void main(String[] args) {
	//WAP to delete specific number from given array
		int p[]= {1,4,5,2,3,22,31,2};
		//out {1,4,5,2,3,31,2}
		int key=22;
		int index=-1;
		//int size=p.length;
		
		for(int i=0;i<p.length;i++)
		{
			  
			        if(p[i] == key)
			        {
			            index = i;
			         for(int j=i;j<p.length-1;j++)
			         {
			        	 p[j]=p[j+1];
			         }
			        
			    
			        break;
			        }

			   
		}

	}

}
