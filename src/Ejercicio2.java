import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Scanner sc=new Scanner(System.in);
			 System.out.println("Indicame su primer número:");
			  int a=sc.nextInt();
			 System.out.println("Indicame su segundo número:");
			  int b=sc.nextInt();
			 System.out.println("Indicame su tercer número:");
			  int c=sc.nextInt();
			  
			  int sum=a+b+c;
			  int rest=a-b-c;
			  int multiplication=a*b*c;
			  float division=(float)a/b/c;
			  
			 if(a>0&&b>0&&c>0) {
			  System.out.println("El resultado de la suma es:"+sum);
			System.out.println("El resultado de la resta es:"+rest);
			System.out.println("El resultado de la multiplicacion es:"+multiplication);
	        System.out.println("El resultado de la division es:"+division);
			 }
			 
			 else {
				 
				 System.out.println("Error,asegurese que todos los números son positivos");
			 }
			 
			 
			 
			

		
		
		}
	
		
		
		
		
	

}
