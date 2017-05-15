package br.ciss.com.sockets.servidor;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServidorDesafio {

	public static void main(String[] args) throws IOException {
		ServerSocket servidorDesafio = new ServerSocket(6789);
		System.out.println("Porta 6789 Aberta!");
		Socket cliente = servidorDesafio.accept();
		System.out.println("Nova conexão com o cliente" + cliente.getInetAddress().getHostAddress());

		OutputStream os = new FileOutputStream("recebido.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		
		Scanner scanner = new Scanner(cliente.getInputStream());

		while (scanner.hasNextLine()) {
			//System.out.println(scanner.nextLine());
			bw.write(scanner.nextLine());
		}
		
		scanner.close();
		cliente.close();
		servidorDesafio.close();
		bw.close();

	}

}
