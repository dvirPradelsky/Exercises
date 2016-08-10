package Crypto;
import java.io.IOException;

import Algorithms.Algorithm;
import main.IO;
import main.UserInteraction;

public interface Crypto {
	void run(String filePath, Algorithm algorithm, IO io, UserInteraction ui) throws IOException;
}
