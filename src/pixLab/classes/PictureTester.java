package pixLab.classes;

/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 * 
 * @author Barbara Ericson
 */
public class PictureTester {
	/** Method to test zeroBlue */
	public static void testZeroBlue() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}
	
	/** Method to test mirrorVertical */
	public static void testMirrorVertical() {
		Picture caterpillar = new Picture("caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorVertical();
		caterpillar.explore();
	}
	
	/** Method to test mirrorTemple */
	public static void testMirrorTemple() {
		Picture temple = new Picture("temple.jpg");
		temple.explore();
		temple.mirrorTemple();
		temple.explore();
	}
	
	/** Method to test the collage method */
	public static void testCollage() {
		Picture canvas = new Picture("640x480.jpg");
		canvas.createCollage();
		canvas.explore();
	}
	
	/** Method to test edgeDetection */
	public static void testEdgeDetection() {
		Picture swan = new Picture("redMotorcycle.jpg");
		swan.explore();
		swan.edgeDetection(20);
		swan.explore();
	}
	
	public static void testGreenScreen() {
		Picture source = new Picture("caterpillar.jpg");
		Picture background = new Picture("redMotorcycle.jpg");
		source.greenScreen(background, 128, .6);
		source.explore();
	}
	
	public static void testVerticalShift() {
		Picture pic = new Picture("redMotorcycle.jpg");
		pic.verticalShift(200);
		pic.explore();;
		
	}
	
	public static void testVerticalColorShift(){
		Picture pic = new Picture("redMotorcycle.jpg");
		pic.verticalColorShift(0, 20, 40);
		pic.explore();;
	}
	
	public static void testbombetteFilter() {
		Picture sample = new Picture("beach.jpg");
		sample.explore();
		sample.bombetteFilter(sample.getHeight() / 2, sample.getWidth() / 2);
		sample.explore();
		
	}
	
	/**
	 * Main method for testing. Every class can have a main method in Java
	 */
	public static void main(String[] args) {
		// uncomment a call here to run a test
		// and comment out the ones you don't want
		// to run
//		testGreenScreen();
//		testVerticalShift();
		testVerticalColorShift();
		// testbombetteFilter();
		// testZeroBlue();
		// testKeepOnlyBlue();
		// testKeepOnlyRed();
		// testKeepOnlyGreen();
		// testNegate();
		// testGrayscale();
		// testFixUnderwater();
		// testMirrorVertical();
		// testMirrorTemple();
		// testMirrorArms();
		// testMirrorGull();
		// testMirrorDiagonal();
		// testCollage();
		// testCopy();
		// testEdgeDetection();
		// testEdgeDetection2();
		// testChromakey();
		// testEncodeAndDecode();
		// testGetCountRedOverValue(250);
		// testSetRedToHalfValueInTopHalf();
		// testClearBlueOverValue(200);
		// testGetAverageForColumn(0);
	}
}