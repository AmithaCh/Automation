
public class Methods {
	
public static int a=30;
public static int b=20;
public static void addNumbers()
{
	int c=a+b;
	System.out.println("Addition of 2 no's are:" +c);
}
public static void addNumbers(int r,int s)
{
	int add=r+s;
	System.out.println("Addition of 2 no's are:" +add);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         addNumbers();
         addNumbers(50,70);
	}

}
