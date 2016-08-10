package Algorithms;

import main.IO;
import main.UserInteraction;

public class SplitAlgorithm extends AbstractAlgorithm {

	@Override
	public void decrypt(byte[] file, UserInteraction ui, IO io) {
		StandaloneAlgorithm algorithm = ui.userChooseStandaloneAlgorithm(io);
		System.out.println("key for even -");
		byte key1 = ui.userChooseKey(io);
		System.out.println("key for odd -");
		byte key2 = ui.userChooseKey(io);
		byte[] even = getEven(file);
		byte[] odd = getOdd(file);
		algorithm.decryptLogic(even, key1);
		algorithm.decryptLogic(odd, key2);
		combine(file, even, odd);
	}

	@Override
	public void ecrypt(byte[] file, UserInteraction ui, IO io) {
		StandaloneAlgorithm algorithm = ui.userChooseStandaloneAlgorithm(io);
		byte key1 = super.generateKey();
		byte key2 = super.generateKey();
		System.out.println("keys are: (1) " + key1 + " (2) " + key2);
		byte[] even = getEven(file);
		byte[] odd = getOdd(file);
		algorithm.encryptLogic(even, key1);
		algorithm.encryptLogic(odd, key2);
		combine(file, even, odd);
	}

	private void combine(byte[] file, byte[] even, byte[] odd) {
		int indexEven = 0;
		int indexOdd = 0;
		for (int i = 0; i < file.length; i++) {
			if (i % 2 == 0) {
				file[i] = even[indexEven++];
			} else {
				file[i] = odd[indexOdd++];
			}
		}
	}

	private byte[] getOdd(byte[] file) {
		byte[] odd = new byte[(int) Math.floor(file.length / 2.0)];
		int index = 0;
		for (int i = 1; i < file.length; i += 2) {
			odd[index++] = file[i];
		}
		return odd;
	}

	private byte[] getEven(byte[] file) {
		byte[] even = new byte[(int) Math.ceil(file.length / 2.0)];
		int index = 0;
		for (int i = 0; i < file.length; i += 2) {
			even[index++] = file[i];
		}
		return even;
	}
}
