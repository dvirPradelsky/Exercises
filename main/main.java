package main;

import Algorithms.Algorithm;
import Crypto.Crypto;

public class main {
	public static void main(String[] args) {
		try {
			// Services
			IO io = new IO();
			UserInteraction ui = new UserInteraction();
						
			Crypto crypto = ui.userChooseCrypto(io);
			String filePath = ui.userChooseFile(io);
			Algorithm algorithm = ui.userChooseAlgorithm(io);
			crypto.run(filePath, algorithm, io, ui);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
