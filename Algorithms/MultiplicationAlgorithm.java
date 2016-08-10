package Algorithms;

import main.IO;
import main.UserInteraction;

public class MultiplicationAlgorithm extends StandaloneAlgorithm {
	@Override
	public void decrypt(byte[] file, UserInteraction ui, IO io) {
		byte key = ui.userChooseKey(io);

		byte i = Byte.MIN_VALUE;
		for (; i <= Byte.MAX_VALUE; i++) {
			if ((byte) (i * key) == 1) {
				break;
			}
		}
		final byte new_key = i;
		decryptLogic(file, new_key);
	}

	@Override
	public void ecrypt(byte[] file, UserInteraction ui, IO io) {
		byte key = super.generateKey();
		encryptLogic(file, key);
	}

	@Override
	public void decryptLogic(byte[] file, byte key) {
		super.performOnArray(file, (b) -> (byte) (b * key));

	}

	@Override
	public void encryptLogic(byte[] file, byte key) {
		super.performOnArray(file, (b) -> (byte) (b * key));
	}
}
