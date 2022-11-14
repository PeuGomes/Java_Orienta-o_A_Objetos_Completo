package br.com.bytebank.banco.test;

public class TesteArrayString {

	public static void main(String[] args) {

		System.out.println("FUNCIONOU!!");
		//Configuraçãoa partir do Run Configurations adicione em arguments
		for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
	}

}
