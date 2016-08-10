package Factories;

import Crypto.Crypto;
import Crypto.Decryptor;
import Crypto.Encryptor;
import Decorators.CountTimeCryptoDecorator;

public class CryptoFactory {
	public static Crypto getCrypto(int num, boolean withCountTimeDecorator) {
		Crypto crypto = null;
		switch (num) {
		case 1:
			crypto = new Encryptor();
			break;
		case 2:
			crypto = new Decryptor();
			break;
		default:
			throw new IllegalArgumentException("bad crypto number = " + num);
		}
		if (withCountTimeDecorator) {
			crypto = new CountTimeCryptoDecorator(crypto);
		}
		return crypto;
	}
}