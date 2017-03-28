package br.com.aulaLF;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWork {

	private static final String ERROR_FILE_NOT_FOUND = "Arquivo não foi encontrado";

	private File file;

	public FileWork(String nameFile) {
		file = new File(nameFile);
	}

	public String readFirstRow() {
		String rowFile = null;
		try {
			InputStreamReader isr = new InputStreamReader(new FileInputStream(file));
			BufferedReader br = new BufferedReader(isr);
			rowFile = br.readLine();
			br.close();
		} catch (IOException e) {
			System.out.println(ERROR_FILE_NOT_FOUND);
		}
		return rowFile;
	}

	public void writeStringInFile(String string) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write(string);
			bw.close();
		} catch (IOException e) {
			System.out.println(ERROR_FILE_NOT_FOUND);
		}
	}
}