package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		
//		System.out.println("C");
//        System.out.println(9);
//        System.out.println(false);
        
        //Polimorfismo
        Object cc = new ContaCorrente(22, 33);
        Object cp = new ContaPoupanca(33, 22);
        Object cliente = new Cliente();
        
        //toString() vem da classe Object
        System.out.println(cc.toString());
        System.out.println(cp);

        //println(cliente);
	}
	static void println() {}
    static void println(int a) {}
    static void println(boolean valor) {}
    
    static void println(Object referencia) {
    }

}
