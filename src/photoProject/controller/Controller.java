package photoProject.controller;

import pixLab.classes.*;
import java.util.concurrent.TimeUnit;

public class Controller {
	public Controller(String[] args) {
		try {
			Picture pic;
			PictureExplorer window;
			pic = new Picture("src/pixLab/images/beach.jpg");
			pic.blur(0, 0, 100);
			// pic.edgeDetection(120);
			// pic.edgeDetection(120);
			// pic.edgeDetection(120);
			// pic.edgeDetection(120);
			window = new PictureExplorer(pic);
			window.displayPixelInformation(String.valueOf(com[0]), String.valueOf(com[1]));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
