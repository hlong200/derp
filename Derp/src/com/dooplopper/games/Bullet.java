package com.dooplopper.games;

import org.newdawn.slick.geom.Shape;

public class Bullet extends Entity {

	public Bullet(Shape s, float xVel, float yVel, int health) {
		super(s, xVel, yVel, health);
		
	}
	
	public void update() {
		if(health > 0) {
			if(shape.getMinX() > 1920 || shape.getMaxX() < 0) {
				health = 0;
				
			} else {
				shape.setLocation(shape.getX() + xVel, shape.getY() + yVel);
				
			}
			
		}
		
	}

}
