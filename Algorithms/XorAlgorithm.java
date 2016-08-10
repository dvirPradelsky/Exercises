package Algorithms;

import main.IO;
import main.UserInteraction;

public class XorAlgorithm extends StandaloneAlgorithm {

	private void xor(byte[] file, byte key) {
		super.performOnArray(file, (b) -> (byte) (b ^ key));
	}

	@Override
	public void decrypt(byte[] file, UserInteraction ui, IO io) {
		byte key = ui.userChooseKey(io);
		encryptLogic(file, key);
	}

	@Override
	public void ecrypt(byte[] file, UserInteraction ui, IO io) {
		byte key = super.generateKey();
		decryptLogic(file, key);
	}

	@Override
	public void decryptLogic(byte[] file, byte key) {
		xor(file, key);

	}

	@Override
	public void encryptLogic(byte[] file, byte key) {
		xor(file, key);

	}
}
