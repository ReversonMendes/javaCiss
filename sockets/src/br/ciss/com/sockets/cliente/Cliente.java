package br.ciss.com.sockets.cliente;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) throws IOException {

		Socket cliente = new Socket("172.16.151.75", 12345);

		System.out.println("O cliente se conectou com o servidor!");

		PrintStream saida = new PrintStream(cliente.getOutputStream());

		Scanner teclado = new Scanner(System.in);

		while (teclado.hasNextLine()) {
			saida.println(teclado.next());
		}
		saida.close();
		teclado.close();
		cliente.close();

	}

}
