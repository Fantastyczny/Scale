package src.gui;
import com.trolltech.qt.core.QRectF;
import com.trolltech.qt.core.Qt;
import com.trolltech.qt.gui.*;
public class ScaleGraphicsScene extends QGraphicsScene {

	int x=0;
	int y=0;
	public ScaleGraphicsScene(QWidget parent)
	{
		super(parent);
	}
	
	
	@Override
	protected void drawBackground(QPainter painter, QRectF rect)
	{
		int ball_radius = 100;
		painter.fillRect(rect, new QBrush(new QColor(0,0,0)));
		//painter.save();
		
		painter.setBrush(new QBrush(new QColor(255,23,52)));
		painter.drawEllipse(-ball_radius+x,-ball_radius+y,2*ball_radius,2*ball_radius);
		//painter.restore();
	}
	
	@Override
	protected void keyPressEvent(QKeyEvent event)
	{
		Qt.Key key = Qt.Key.resolve(event.key());
		switch (key)
		{
		case Key_Up:
			--y;
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
	}

}
