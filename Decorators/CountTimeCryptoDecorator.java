package Decorators;
import java.io.IOException;

import Algorithms.Algorithm;
import Crypto.Crypto;
import main.IO;
import main.UserInteraction;

public class CountTimeCryptoDecorator implements Crypto {
	Crypto crypto;

	public CountTimeCryptoDecorator(Crypto crypto) {
		this.crypto = crypto;
	}

	public void run(String filePath, Algorithm algorithm, IO io, UserInteraction ui) throws IOException {
		long start = System.nanoTime();
		crypto.run(filePath, algorithm, io, ui);
		long elapsedTime = System.nanoTime() - start;
		System.out.println("Elapsed time is " + elapsedTime / 1000000000.0 +" sec");
	}
}
