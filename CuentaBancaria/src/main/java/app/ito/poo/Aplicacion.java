package app.ito.poo;
import clases.ito.poo.CuentasBancarias;
import clases.ito.poo.CuentaBancaria;
import java.time.LocalDate;
//
public class Aplicacion {
	static CuentasBancarias c;
	
	
	static void run(){
	
	c=  new CuentasBancarias();
	System.out.println(c.isFree());
	c.addItem(new CuentaBancaria(1012,"Roberto Carloss",77,LocalDate.of(2021, 4, 24)));
	c.addItem(new CuentaBancaria(1034,"Mattus Ledezma",46000,LocalDate.of(2021, 5, 30)));
	c.addItem(new CuentaBancaria(1032,"Eder Addi",70000,LocalDate.of(2021, 12, 2)));
	c.addItem(new CuentaBancaria(1031,"Guadalupe Suarez",18000,LocalDate.of(2021, 3, 12)));
	c.addItem(new CuentaBancaria(1029,"Adriana Sanchez",30000,LocalDate.of(2021, 2, 1)));
	c.addItem(new CuentaBancaria(1030,"Francisco Javier",6000,LocalDate.of(2021, 2, 1)));
	System.out.println(c.isFree());
	for(int i=0;i<c.getSize();i++)
		System.out.println(c.getItem(i));


	System.out.print("\nchequeo de deposito:"+ c.Deposito(3, 2000/*cantidad a depositar*/)+"\n");
	System.out.println("Chequeo de retiro: "+c.Retiro(3, 2000));
	
	System.out.println("retiro"+c.Retiro(2, 6000));
	c.EliminarCuenta(2);
	System.out.println("\n\n\n\n");
		for(int i=0;i<c.getSize();i++)
		System.out.println(c.getItem(i));
		
		
		System.out.println("EL MONTO TOTAL DE LAS CUENTAS ES DE :$"+c.MontosTotales());
		System.out.println("EL MONTO PROMEDIO DE LAS CUENTAS ES DE: $"+c.PromedioMontosTotales());
		System.out.println("CUENTAS CON UN MONTO MAYOR A $10,000.00:\n"+c.CuentaMillonaria());
		System.out.println("saldo maximo: "+c.Saldomax());
		System.out.println("saldo minimo: "+c.Saldomin());
	}
	

}
