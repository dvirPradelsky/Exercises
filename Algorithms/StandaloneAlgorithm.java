package Algorithms;

public abstract class StandaloneAlgorithm extends AbstractAlgorithm {
	public abstract void decryptLogic(byte[] file, byte key);
	public abstract void encryptLogic(byte[] file, byte key);
}
