package gui;

import com.trolltech.qt.core.Qt;
import com.trolltech.qt.gui.*;
import com.trolltech.qt.opengl.*;

public class ScaleGraphicsView extends QGraphicsView
{

	ScaleGraphicsScene scene;
	int x=0,y=0;
	Ball ball = new Ball();
	public ScaleGraphicsView(QWidget parent)
	{
		super(parent);
		scene = new ScaleGraphicsScene(this);
		setScene(scene);
		
		setViewport(new QGLWidget());
		setViewportUpdateMode(QGraphicsView.ViewportUpdateMode.FullViewportUpdate);
		setRenderHint(QPainter.RenderHint.Antialiasing);
		
		
        setScene(scene);

        setCacheMode(new QGraphicsView.CacheMode(QGraphicsView.CacheModeFlag.CacheBackground));

        setRenderHint(QPainter.RenderHint.Antialiasing);
        //setTransformationAnchor(QGraphicsView.ViewportAnchor.AnchorViewCenter);
        //setResizeAnchor(QGraphicsView.ViewportAnchor.AnchorViewCenter);

        scene.addItem(ball);
        ball.setPos(x,y);


	}
	
	@Override
	protected void keyPressEvent(QKeyEvent event)
	{
		Qt.Key key = Qt.Key.resolve(event.key());
		switch (key)
		{
		case Key_Up:
			y--;
			break;
		case Key_Down:
			++y;
			break;
		case Key_Left:
			--x;
			break;
		case Key_Right:
			++x;
			break;
		
		default:
			super.keyPressEvent(event);
		}
        ball.setPos(10*x,10*y);
	}
}

