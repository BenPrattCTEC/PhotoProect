package photoProject.controller;

import pixLab.classes.*;
import java.util.concurrent.TimeUnit;

public class Controller {
	public Controller(String[] args) {
		try {
			Picture pic;
			PictureExplorer window;
			pic = new Picture("src/pixLab/images/beach.jpg");
			pic.verticalColorShift(50, 0, 100);
			// pic.edgeDetection(120);
			// pic.edgeDetection(120);
			// pic.edgeDetection(120);
			// pic.edgeDetection(120);
			window = new PictureExplorer(pic);
			pic.blur(0, 0, 100);

			window.updatePicture(pic);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
