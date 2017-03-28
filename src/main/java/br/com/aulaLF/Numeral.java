package br.com.aulaLF;

public class Numeral {

	private RomanNumeral romanNumeral;
	private int arabicNumeral;

	public Numeral(RomanNumeral numberRoman) {
		this.romanNumeral = numberRoman;
	}

	public int getArabicNumeral() {
		return arabicNumeral;
	}

	public void converterCharRomanToArabic() {
		switch (romanNumeral) {
		case I:
			arabicNumeral = 1;
			break;
		case V:
			arabicNumeral = 5;
			break;
		case X:
			arabicNumeral = 10;
			break;
		case L:
			arabicNumeral = 50;
			break;
		case C:
			arabicNumeral = 100;
			break;
		case D:
			arabicNumeral = 500;
			break;
		case M:
			arabicNumeral = 1000;
			break;
		}
	}
}
