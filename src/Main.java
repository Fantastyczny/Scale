/**
 * 
 */

import com.trolltech.qt.gui.*;
import org.jbox2d.collision.shapes.PolygonShape;
import org.jbox2d.collision.shapes.CircleShape;
import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.Body;
import org.jbox2d.dynamics.BodyDef;
import org.jbox2d.dynamics.World;
import org.jbox2d.dynamics.BodyType;




public class Main {
    public static void main(String args[]) {
    	Vec2 g = new Vec2(0.0f, -9.0f);
    	World w = new World(g,true);
    	
    	
    	BodyDef bd = new BodyDef();
    	bd.position = new Vec2(0.0f, -10.0f);
    	Body ground = w.createBody(bd);
    	
    	PolygonShape shape = new PolygonShape();
        shape.setAsBox(5f, 0.5f);
        
        ground.createFixture(shape, 0f);
        
        BodyDef ballbd = new BodyDef();
        ballbd.position = new Vec2(0.0f,0.0f);
        ballbd.type = BodyType.DYNAMIC;
        Body ball = w.createBody(ballbd);
        
        CircleShape ballshape = new CircleShape();
        ballshape.m_radius = 0.25f;
        
        ball.createFixture(ballshape, 0);
    	
    	
        while(true){
        	w.step(1, 0, 0);
        	System.out.println(ball.getPosition());
        	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        
    }
}