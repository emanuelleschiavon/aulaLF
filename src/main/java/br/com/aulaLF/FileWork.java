package br.com.aulaLF;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWork {

	private static final String ARQUIVO_NÃO_FOI_ENCONTRADO = "Arquivo não foi encontrado";
	File file;

	public FileWork(String nameFile) {
		file = new File(nameFile);
	}

	public String readFile() {
		String rowFile = null;
		try {
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			rowFile = br.readLine();
			br.close();
		} catch (IOException e) {
			System.out.println(ARQUIVO_NÃO_FOI_ENCONTRADO);
		}
		return rowFile;
	}

	public void writeFile(String rowFile) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write(rowFile);
			bw.close();
		} catch (IOException e) {
			System.out.println(ARQUIVO_NÃO_FOI_ENCONTRADO);
		}
	}
}