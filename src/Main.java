/**
 * 
 */

import com.trolltech.qt.gui.*;
import org.jbox2d.*;


public class Main {
    public static void main(String args[]) {
        QApplication.initialize(args);
 
        QPushButton hello = new QPushButton("Hello World!");
        hello.show();
 
        QApplication.exec();
    }
}