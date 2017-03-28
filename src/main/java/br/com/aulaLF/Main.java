package br.com.aulaLF;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		String nameFileToRead = "leitura.txt";
		FileWork fileWork = new FileWork(nameFileToRead);

		String firstRowOfFileRead = fileWork.readFirstRow();
		System.out.println(firstRowOfFileRead);

		String nameFileToWrite = "escrita.txt";
		fileWork = new FileWork(nameFileToWrite);
		fileWork.writeStringInFile(firstRowOfFileRead);
	}
}
