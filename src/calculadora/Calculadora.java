package calculadora;

import java.util.Scanner;

public class Calculadora {


	public static void main(String[] args) {
		
		Scanner Key = new Scanner (System.in);
		
		int a=0, b=0, c=0, op=0 ;
		
	do{	
		
		System.out.println("Calculadora ");
		System.out.println("1. Adição");
		System.out.println("2. Subtração");
		System.out.println("3. Multiplicação");
		System.out.println("4. Divisão");
		System.out.println("5. Sair");
		
		op = Key.nextInt();
		
		switch (op){
			
			case 1:
				
    	System.out.println("Primeiro valor");
        a = Key.nextInt();
        
        System.out.println("Segundo valor");
        b = Key.nextInt();
        
        
        c = a + b;
        
        System.out.println("Resultado: "+ c + "");
        
        break;
        
			case 2:
				
	   System.out.println("Primeiro valor");
       a = Key.nextInt();
		        
	   System.out.println("Segundo valor");
       b = Key.nextInt();
		        
		        
	   c = a - b;
		        
       System.out.println("Resultado: "+ c + "");
      
	   break;
		   
			case 3:

	  System.out.println("Primeiro valor");
      a = Key.nextInt();
			        
	  System.out.println("Segundo valor");
	  b = Key.nextInt();
			        
			        
	  c = a * b;
			        
      System.out.println("Resultado: "+ c + "");	
      
      break;
      
			case 4:
				
		System.out.println("Primeiro valor");
	    a = Key.nextInt();
		        
	    System.out.println("Segundo valor");
        b = Key.nextInt();
			        
	    c = a / b;
			        
	    System.out.println("Resultado: "+ c + "");
	    
	    break;
	}
							
           
	} while (op != 5);
        
}
}
	

