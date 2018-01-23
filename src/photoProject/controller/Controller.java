package photoProject.controller;

import pixLab.classes.*;
import java.util.concurrent.TimeUnit;

public class Controller {
	public Controller(String[] args) {
		try {
			Picture pic = new Picture("/home/ben/Scripts/webcamShot.jpg");
			PictureExplorer window = new PictureExplorer(pic);
			while (true) {
				try {
					pic = new Picture("/home/ben/Scripts/webcamShot.jpg");
					pic.cutoffBottom(30);
					pic.colorPick(RGB.GREEN, (int)(pic.getAverage(RGB.GREEN)), .8);
					System.out.println(pic.com()[0] + ", " + pic.com()[1]);
					window.updatePicture(pic);
					TimeUnit.MILLISECONDS.sleep(250);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
