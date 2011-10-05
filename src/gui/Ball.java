package gui;

import com.trolltech.qt.core.QRectF;
import com.trolltech.qt.core.Qt;
import com.trolltech.qt.gui.QColor;
import com.trolltech.qt.gui.QGraphicsItem;
import com.trolltech.qt.gui.QPainter;
import com.trolltech.qt.gui.QPainterPath;
import com.trolltech.qt.gui.QStyleOptionGraphicsItem;
import com.trolltech.qt.gui.QWidget;

public class Ball extends QGraphicsItem {
    private  QPainterPath SHAPE;
    private  int radius=100;


    private QRectF boundingRect = new QRectF(-radius,-radius,radius,radius);
    Ball() {
        setFlag(QGraphicsItem.GraphicsItemFlag.ItemIsMovable);
        setZValue(1);
        SHAPE = new QPainterPath();
        SHAPE.addEllipse(-radius, -radius, 2*radius, 2*radius);

    }

    @Override
    public QRectF boundingRect() {
        return boundingRect;
    }

    @Override
    public QPainterPath shape() {
        return SHAPE;
    }

    @Override
    public void paint(QPainter painter, QStyleOptionGraphicsItem option, QWidget widget) {
        painter.setPen(Qt.PenStyle.NoPen);
        painter.setBrush(new QColor(255,255,255));
        painter.drawEllipse(-radius, -radius, 2*radius, 2*radius);
    }

    

}