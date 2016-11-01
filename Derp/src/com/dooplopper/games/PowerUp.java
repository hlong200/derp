package com.dooplopper.games;

import org.newdawn.slick.geom.Shape;

public class PowerUp extends Entity {
	
	protected int effect;

	public PowerUp(Shape s, float xVel, float yVel, int health, int effect) {
		super(s, xVel, yVel, health);
		this.effect = effect;
		
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
