package gui;
import com.trolltech.qt.core.QRectF;
import com.trolltech.qt.gui.*;
public class ScaleGraphicsScene extends QGraphicsScene {


	public ScaleGraphicsScene(QWidget parent)
	{
		super(parent);
		setItemIndexMethod(QGraphicsScene.ItemIndexMethod.BspTreeIndex);
	}
	
	
	@Override
	protected void drawBackground(QPainter painter, QRectF rect)
	{

		painter.fillRect(rect, new QBrush(new QColor(22,22,22)));
		//painter.save();
		

		//painter.restore();
	}
	


}
