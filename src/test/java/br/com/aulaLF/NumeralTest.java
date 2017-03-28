package br.com.aulaLF;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.aulaLF.number.ArabicNumber;

public class NumeralTest {

	@Test
	public void converterCharRomanToArabicTest() {
		ArabicNumber numeral = new ArabicNumber(RomanNumber.C);
		numeral.converterCharRomanToArabic();
		int valueActual = numeral.getArabicNumeral();
		assertEquals(100, valueActual);
	}
}
