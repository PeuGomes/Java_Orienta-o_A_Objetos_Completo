package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {
		
		String vazio ="    Pedro    ";
		String outroVazio = vazio.trim(); 

		System.out.println(vazio.contains("Ped"));
		System.out.println(outroVazio);
		
//		String vazio =" Pedro ";
//		String outroVazio = vazio.trim(); //tira os espaços no inicio e no fim de uma String
//		
//		System.out.println(vazio);
//		System.out.println(outroVazio);
		
		String nome = "Pedro"; //Object literal
		
		System.out.println(nome.length());
		System.out.println(" ");

		for(int i = 0; i < nome.length(); i++) {
		    System.out.println(nome.charAt(i));
		}
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
//		int pos = nome.indexOf("dr");
//		System.out.println(pos);

//		char c = nome.charAt(2);
//		System.out.println(c);
		
//		char c = 'P';
//		char d = 'p';
//
//		String outra = nome.replace(c,d);
		
		//String outra = nome.replace('P', 'p');
		
		//String outra = nome.toLowerCase();
//		System.out.println(nome);
//		System.out.println(outra);

	}

}
