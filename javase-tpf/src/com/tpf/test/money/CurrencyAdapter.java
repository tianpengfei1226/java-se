package com.tpf.test.money;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.Currency;

/**
 * @author daisy
 * make currency performed correctly
 */
public class CurrencyAdapter extends XmlAdapter<String, Currency> {

	@Override
	public Currency unmarshal(String val) throws Exception {
		return Currency.getInstance(val);
	}

	@Override
	public String marshal(Currency val) throws Exception {
		return val.toString();
	}
}
