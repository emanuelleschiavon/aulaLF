package br.com.aulaLF;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FileWorkTest {

	@Test
	public void readRowFileTest() {
		FileWork file = new FileWork("leitura.txt");
		String rowFile = file.readFirstRow();

		assertEquals(rowFile, "bli");
	}

	@Test
	public void fileClosedTest() {
		FileWork file = new FileWork("leitura.txt");
		file.readFirstRow();
	}

}