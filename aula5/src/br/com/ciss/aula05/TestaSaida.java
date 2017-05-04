package br.com.ciss.aula05;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TestaSaida {

	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("saida.txt");
		OutputStreamWriter osr = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osr);
		
		bw.write("ciss");
		
		bw.close();

	}

}
