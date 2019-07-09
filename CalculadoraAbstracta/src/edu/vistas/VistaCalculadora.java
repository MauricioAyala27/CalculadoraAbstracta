package edu.vistas;

import java.util.Scanner;

import edu.clases.CalculadoraDigital;

public class VistaCalculadora {

	public static void main(String[] args) {
		
		 CalculadoraDigital dg = new CalculadoraDigital();
		 Scanner sc = new Scanner(System.in);
		 int rp = 0;
		 int op = 0;
		 int flat = 0;
		 double a=0,b=0;
		 
		 do {
			 
			 System.out.println("BIENVENIDO");
			 System.out.println("Desea realizar alguna operacion?");
			 System.out.println("1.Suma" +
					 			"\n2.Resta" +
					 			"\n3.Multiplicacion" +
					 			"\n4.Division");
			 op = Integer.parseInt(sc.nextLine());
			 
			 if(op<5)
			 {
				 try
				 {
					 System.out.println("Ingrese el primer numero: ");
					 a = Double.parseDouble(sc.nextLine());
					 System.out.println("Ingrese el segundo numero: ");
					 b = Double.parseDouble(sc.nextLine());
					 

					 switch(op)
					 {
					 	case 1:
					 		System.out.println("\nEl resultado de la suma es: " + dg.Suma(a, b));
					 		break;
					 	case 2:
					 		System.out.println("\nEl resultado de la Resta es: " + dg.Resta(a, b));
					 		break;
					 	case 3:
					 		System.out.println("\nEl resultado de la Multiplicacion es: " + dg.Multiplicacion(a, b));
					 		break;
					 	case 4:
					 		System.out.println("\nEl resultado de la Division es: " + dg.Division(a, b));
					 		break;
					 	default:
					 		System.out.println("\nUsted eligio una opcion invalida");
					 		break;
					 }
				 }
				 catch(NumberFormatException e)
				 {
					 System.out.println("\nOcurrio un error. Solo se permiten numeros!");
					
				 }
			 }
			 
			 
			 System.out.println("\n\nDesea volver a realizar otra operacion?"
			 		+ "\nPresione 1 para SI y 2 para NO: ");
			 rp = Integer.parseInt(sc.nextLine());
			 
			 if(rp!=2) 
			 {
				 flat = 1;
			 }
			 else {
				 flat = 2;
			 }
			 
		 }while(flat==1);
		 
		 sc.close();

	}

}
