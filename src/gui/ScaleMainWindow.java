package gui;

import com.trolltech.qt.gui.*;

public class ScaleMainWindow extends QMainWindow{

	ScaleGraphicsView view;
	public ScaleMainWindow()
	{
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

}
