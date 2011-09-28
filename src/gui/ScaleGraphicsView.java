package src.gui;
import com.trolltech.qt.gui.*;
import com.trolltech.qt.opengl.*;

public class ScaleGraphicsView extends QGraphicsView
{

	ScaleGraphicsScene scene;
	public ScaleGraphicsView(QWidget parent)
	{
		super(parent);
		scene = new ScaleGraphicsScene(this);
		setScene(scene);
		setViewport(new QGLWidget());
		setRenderHint(QPainter.RenderHint.Antialiasing);
	}
	

	
	
}