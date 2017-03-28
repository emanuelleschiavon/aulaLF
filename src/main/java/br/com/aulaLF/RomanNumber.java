package br.com.aulaLF;

public enum RomanNumber {
	I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

	private Integer valueArabic;

	private RomanNumber(Integer valueArabic) {
		this.valueArabic = valueArabic;
	}

	public Integer getValueArabic() {
		return valueArabic;
	}
}
