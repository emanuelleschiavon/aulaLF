package br.com.aulaLF;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		String nameFile = "teste.txt";
		FileWork fileWork = new FileWork(nameFile);

		String rowFile = fileWork.readFile();
		System.out.println(rowFile);
		
		fileWork.writeFile("bli");
		
	}
}
