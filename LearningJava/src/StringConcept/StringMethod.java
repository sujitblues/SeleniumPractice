package StringConcept;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		String s="This is my java code i am so happy";
		int len=s.length();
		System.out.println(len);
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(19));
		//System.out.println(s.charAt(20));//SIOB
		//System.out.println(s.charAt(-1));//SIOB
		System.out.println(s.indexOf('T'));
		System.out.println(s.indexOf('i'));//1st occurrence of i
		System.out.println(s.indexOf('i', 3));//2nd occurrence of i
		System.out.println(s.indexOf('i', s.indexOf('i')+1));
		System.out.println("Third occurance of i "+s.indexOf(s.indexOf('i', s.indexOf('i')+1)+1));//Not working
		System.out.println(s.indexOf("java"));
		System.out.println(s.indexOf("testing"));
		String mesg="welcome admin";
		if(mesg.indexOf("admin")==8)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		//not a good validation
		if(mesg.indexOf("admin")>=0)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
			
		String test="    hellow world   ";
		System.out.println(test.trim());
		
		String t="hello this is a java code";
		System.out.println(t.toUpperCase());
		System.out.println(t.toLowerCase());
		
		String dob="01-01-1990";//01/01/1990
		System.out.println(dob.replace('-', '/'));
		
		String test1="   hello world  ";
		System.out.println(test1.replace(" ", ""));
		//1 String pool memory but two refrence st and st1
		//duplicate string is not allowed in string constant pool
		//java is case sensetive Hello World and hello world are two different string
		String st="hello world";
		String st1="hello world";
		System.out.println(st==st1);
		System.out.println(st.equals(st1));
		System.out.println(st.equalsIgnoreCase(st1));
		String browser="Chrome ";
		if(browser.trim().equalsIgnoreCase("chrome"))
		{
			System.out.println("PASS");
		}
		String p="this is selenium testing";
		System.out.println(p.contains("selenium"));
		
		
		//split-it return string array
		String lang="JAVA_PYTHON_DOTNET_RUBY";
		String l[]=lang.split("_");
		System.out.println(l[0]);
		System.out.println(Arrays.toString(l));
		
		String pop="xXseleniumxXXtestingXxJavaXXxpythongX";
		String d[]=pop.split("xX");
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);
		//System.out.println(d[3]);
		//System.out.println(d[4]);
		System.out.println(Arrays.toString(d));
		
		String empInfo="madhav;Singh;Pune;India;Ibm;Sdet";
		String emp[]=empInfo.split("|");
		for(String e: emp)
		{
			System.out.println(e);
		}
		
		//
		String x="100";
		System.out.println(x+20);//10020
		
		//String to int
		int i=Integer.parseInt(x);//100
		System.out.println(i+20);//120
		
		//String to double
		String v="12.33";
		System.out.println(v+10);
		double d1=Double.parseDouble(v);
		System.out.println(d1+10);
		
		
		//int to String
		int k=1100;
		System.out.println(k+20);
		String k1=String.valueOf(k);
		System.out.println(k1+20);
		
		//String to boolean
		String flag="true";
		boolean bl=Boolean.parseBoolean(flag);//true
		if(bl) {
			System.out.println("run my test caes");
		}
		
		//
		String h="testing with selenium";
		String g="devlopment with selenium";
		System.out.println(h.startsWith("testing"));
		System.out.println(g.endsWith("selenium"));
		
		//substring
		String messg="your transaction id is 12345";
		System.out.println(messg.substring(messg.indexOf("is")+2).trim());
		
		String str2="100test";
		str2.replace("test", "");
		System.out.println(str2);
		str2.trim();
		int str2int=Integer.parseInt(str2);
		System.out.println(str2int);
		
		
		String input ="₹9,999.00";
		String result=input.replaceAll(g, p);
		
		
	}

}
