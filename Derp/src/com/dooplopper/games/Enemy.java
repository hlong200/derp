package com.dooplopper.games;

import org.newdawn.slick.geom.Shape;

public class Enemy extends Entity {

	public Enemy(Shape s, float xVel, float yVel, int health) {
		super(s, xVel, yVel, health);
		
	}
	
	public void update() {
		if(shape.getMaxX() + xVel > Derp.width || shape.getMinX() + xVel < 0) {
			xVel *= -1;
			
		} else {
			shape.setX(shape.getX() + xVel);
			
		}
		
		if(shape.getMaxY() + yVel > Derp.height || shape.getMinY() + yVel < 0) {
			yVel *= -1;
			
		} else {
			shape.setY(shape.getY() + yVel);
			
		}
		
	}

}
