package Algorithms;

import java.util.Random;

import main.ByteUnaryOperator;
import main.IO;
import main.UserInteraction;

public abstract class AbstractAlgorithm implements Algorithm {
	protected void performOnArray(byte[] array, ByteUnaryOperator op) {
		for (int i = 0; i < array.length; i++) {
			array[i] = op.change(array[i]);
		}
	}

	protected byte generateKey() {
		byte[] keyArr = new byte[1];
		new Random().nextBytes(keyArr);
		return keyArr[0];
	}

	public abstract void decrypt(byte[] file, UserInteraction ui, IO io);

	public abstract void ecrypt(byte[] file, UserInteraction ui, IO io);
}
