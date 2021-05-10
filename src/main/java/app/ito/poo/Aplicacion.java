package app.ito.poo;
import clases.ito.poo.CuentasBancarias;
import clases.ito.poo.CuentaBancaria;
import java.time.LocalDate;

public class Aplicacion {
	static CuentasBancarias c;
	
	
	static void run(){
	
	c= new CuentasBancarias();
	System.out.println(c.isFree());
	c.addItem(new CuentaBancaria(66,"Roberto Mattus",4000,LocalDate.of(2021, 4, 29)));
	c.addItem(new CuentaBancaria(34,"Maria Jose",46000,LocalDate.of(2021, 5, 14)));
	c.addItem(new CuentaBancaria(32,"Carlos Ledezma",70000,LocalDate.of(2021, 12, 22)));
	c.addItem(new CuentaBancaria(31,"Adriana Sanchez",18000,LocalDate.of(2021, 3, 17)));
	c.addItem(new CuentaBancaria(29,"Eder Montesinos",3000,LocalDate.of(2021, 2, 13)));
	System.out.println(c.isFree());
	for(int i=0;i<c.getSize();i++)
		System.out.println(c.getItem(i));


	System.out.print("\nchequeo de deposito:"+ c.Deposito(3, 5/*cantidad a depositar*/));
	System.out.print("\nChequeo de retiro"+c.Retiro(3, 90000));
	
	
	c.EliminarCuenta(3);
	System.out.println("\n\n\n\n");
		for(int i=0;i<c.getSize();i++)
		System.out.println(c.getItem(i));
		
		
		System.out.println("EL TOTAL DE TODAS LAS CUENTAS ES DE :$"+c.MontosTotales());
		System.out.println("EL PROMEDIO DE LAS CUENTAS ES DE: $"+c.PromedioMontosTotales());
		System.out.println("CUENTAS CON UN MONTO MAYOR A $10,000.00:\n"+c.CuentaMillonaria());
		System.out.println("SALDO MAXIMO: "+c.Saldomax());
		System.out.println("SALDO MINIMO: "+c.Saldomin());
	}
	

}
