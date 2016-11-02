package com.dooplopper.games;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.newdawn.slick.geom.Shape;

public class Player extends Entity {
	
	HashMap<Integer, Long> effects = new HashMap<Integer, Long>();
	ArrayList<Integer> effectsToBeRemoved = new ArrayList<Integer>();

	public Player(Shape s, float xVel, float yVel, int health) {
		super(s, xVel, yVel, health);
		
	}
	
	public void update() {
		if(!(shape.getX() + xVel > Derp.width || shape.getX() + xVel < 0)) {
			shape.setX(shape.getX() + xVel);
			
			
		}
		
		if(!(shape.getY() + yVel > Derp.height || shape.getY() + yVel < 0)) {
			shape.setY(shape.getY() + yVel);
			
		}
		
		for(Map.Entry<Integer, Long> effect: effects.entrySet()) {
			if(effect.getKey() == 1) {
				if(System.currentTimeMillis() - effect.getValue() > 5000) {
					effectsToBeRemoved.add(effect.getKey());
					
				}
				
			}
			
		}
		
	}

}
