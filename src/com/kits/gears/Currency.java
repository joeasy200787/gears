/**
 * @author Olaoye Joseph
 **/
package com.kits.gears;

import java.text.DecimalFormat;

public class Currency {
	public static String toCurrency(double value) {
		return toCurrency(value, false, false);
	}

	public static String toCurrency(double value, boolean showCurrency,
			boolean useGrouping) {
		try {
			DecimalFormat df = new DecimalFormat();
			df.setMaximumFractionDigits(2);
			df.setMinimumFractionDigits(2);

			df.setGroupingUsed(useGrouping);

			String sVal = df.format(value);

			return new StringBuilder(showCurrency ? "\u20A6" : "").append(sVal)
					.toString(); // \u20A6
		} catch (NullPointerException e) {
			return null;
		} catch (NumberFormatException e) {
			return null;
		}

	}

	public static String toCurrency(int value) {
		return toCurrency(Double.valueOf(value));
	}

	public static String toCurrency(int value, boolean showCurrency,
			boolean useGrouping) {
		return toCurrency(Double.valueOf(value), showCurrency, useGrouping);
	}

	public static String toCurrency(String value) {
		try {
			return toCurrency(Double.valueOf(value));
		} catch (NullPointerException e) {
			return null;
		} catch (NumberFormatException e) {
			return null;
		}
	}

	public static String toCurrency(String value, boolean showCurrency,
			boolean useGrouping) {
		try {
			return toCurrency(Double.valueOf(value), showCurrency, useGrouping);
		} catch (NullPointerException e) {
			return null;
		} catch (NumberFormatException e) {
			return null;
		}
	}

	public static String getSign() {
		return "\u20A6"; // This is the Naira sign for Nigeria. You can change
							// it to whatever Unicode currency sign you want.
	}
}
