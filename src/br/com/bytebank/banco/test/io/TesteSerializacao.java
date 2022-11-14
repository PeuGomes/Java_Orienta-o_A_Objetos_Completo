package br.com.bytebank.banco.test.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;



public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Cliente cliente2 = new Cliente();
		cliente2.setNome("Pedro");
		cliente2.setProfissao("Dev");
		cliente2.setCpf("234113161");
		
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.setTitular(cliente2);
        cc.deposita(222.3);

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();
	}

}
