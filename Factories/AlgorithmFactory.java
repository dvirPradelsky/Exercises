package Factories;

import Algorithms.Algorithm;
import Algorithms.CaesarAlgorithm;
import Algorithms.DoubleAlgorithm;
import Algorithms.MultiplicationAlgorithm;
import Algorithms.ReverseAlgorithm;
import Algorithms.SplitAlgorithm;
import Algorithms.StandaloneAlgorithm;
import Algorithms.XorAlgorithm;

public class AlgorithmFactory {
	public static Algorithm getAlgorithm(int algorithmNum) {
		switch (algorithmNum) {
		case 1:
			return new CaesarAlgorithm();
		case 2:
			return new XorAlgorithm();
		case 3:
			return new MultiplicationAlgorithm();
		case 4:
			return new DoubleAlgorithm();
		case 5:
			return new ReverseAlgorithm();
		case 6:
			return new SplitAlgorithm();
		}
		throw new IllegalArgumentException("bad algorithm number = " + algorithmNum);
	}

	public static StandaloneAlgorithm getStandaloneAlgorithm(int algorithmNum) {
		switch (algorithmNum) {
		case 1:
			return new CaesarAlgorithm();
		case 2:
			return new XorAlgorithm();
		case 3:
			return new MultiplicationAlgorithm();
		}
		throw new IllegalArgumentException("bad algorithm number = " + algorithmNum);
	}
}
