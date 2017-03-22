package br.com.aulaLF;

import static org.junit.Assert.*;

import org.junit.Test;

public class FileWorkTest {
	
	@Test
	public void writeFile() {
		FileWork file = new FileWork("teste.txt");
		String rowFile = file.readFile();

		assertEquals(rowFile, "bli");
	}
}