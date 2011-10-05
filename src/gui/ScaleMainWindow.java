package gui;

import com.trolltech.qt.core.QTimerEvent;
import com.trolltech.qt.gui.*;

public class ScaleMainWindow extends QMainWindow{

	ScaleGraphicsView view;
	public ScaleMainWindow()
	{
		super();
		setWindowTitle("Scale");
		setMenus();
		setView();
	}
	
	private void setMenus()
	{
		QMenu file = menuBar().addMenu("&File");
		QAction quit = new QAction("&Quit",this);
		quit.triggered.connect(QApplication.instance(), "quit()");
		
		file.addAction(quit);
		
		
	}
	 
	private void setView()
	{
		view = new ScaleGraphicsView(this);
		this.setCentralWidget(view);
	}
    @Override
    protected void timerEvent(QTimerEvent event) {
    	System.out.println("lol");
    	view.repaint();
    }
	

}
