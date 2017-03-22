package br.com.aulaLF;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumeralTest {

	@Test
	public void converterCharRomanToArabicTest() {
		Numeral numeral = new Numeral(RomanNumeral.C);
		numeral.converterCharRomanToArabic();
		int valueActual = numeral.getArabicNumeral();
		assertEquals(100, valueActual);
	}
}
