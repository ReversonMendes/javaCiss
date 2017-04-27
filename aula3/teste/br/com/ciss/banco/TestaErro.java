package br.com.ciss.banco;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestaErro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void teste() throws FileNotFoundException {

		new FileInputStream("Arquivo.txt");

	}
}
