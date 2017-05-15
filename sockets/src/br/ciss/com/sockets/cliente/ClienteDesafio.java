package br.ciss.com.sockets.cliente;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClienteDesafio {

	public static void main(String[] args) throws IOException {
		Socket cliente = new Socket("127.0.0.1", 6789);
		System.out.println("O cliente se conectou com o servidor!");

		InputStream is = new FileInputStream("arquivo.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Digite a sua mensagem");
		PrintStream saida = new PrintStream(cliente.getOutputStream());
		
		String linha = br.readLine();
		
		while (linha != null) {
			System.out.println(saida);
			linha = br.readLine();
		}
		
		br.close();
		
		

		Scanner teclado = new Scanner(System.in);

		while (teclado.hasNextLine()) {
			saida.println(teclado.next());
		}
		saida.close();
		teclado.close();
		cliente.close();

	}

}
