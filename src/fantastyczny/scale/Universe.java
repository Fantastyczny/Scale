package fantastyczny.scale;

import org.jbox2d.collision.shapes.PolygonShape;
import org.jbox2d.collision.shapes.CircleShape;
import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.Body;
import org.jbox2d.dynamics.BodyDef;
import org.jbox2d.dynamics.World;
import org.jbox2d.dynamics.BodyType;

public class Universe extends Model{
	
	World w;
	
	public Universe(){
		this.w = new World(new Vec2(0,0),true);
		
	}

	@Override
	public void tick(float dt) {
		this.w.step(dt, 0, 0);
		
	}

	@Override
	public void rigth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

}
