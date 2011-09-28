package src.gui;
/**
 * 
 */

/**
 * @author daniel, mtao, misko
 *
 */
import com.trolltech.qt.gui.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QApplication.initialize(args);
		
		ScaleMainWindow window = new ScaleMainWindow();
		window.show();
		QApplication.exec();
	}

}
