package com.dooplopper.games;

import org.newdawn.slick.geom.Shape;

public class Entity {
	
	protected Shape shape;
	protected int health;
	protected int phaseState;
	protected float xVel;
	protected float yVel;
	protected boolean visible = true;
	protected long lastAttack;
	protected long lastPhase;
	protected boolean phasing = false;

	public Entity(Shape s) {
		shape = s;
		xVel = 0;
		yVel = 0;
		health = -1;
		
	}
	
	public Entity(Shape s, float xVel, float yVel) {
		shape = s;
		this.xVel = xVel;
		this.yVel = yVel;
		health = -1;
		
	}
	
	public Entity(Shape s, float xVel, float yVel, int health) {
		shape = s;
		this.xVel = xVel;
		this.yVel = yVel;
		this.health = health;
		
	}
	
	public Entity(Shape s, float xVel, float yVel, int health, boolean visible) {
		shape = s;
		this.xVel = xVel;
		this.yVel = yVel;
		this.health = health;
		this.visible = visible;
		
	}
	
	public Shape getShape() {
		return this.shape;
		
	}
	
	protected int getHealth() {
		return health;
		
	}
	
	protected void setHealth(int health) {
		this.health = health;
		
	}
	
	protected boolean getVisible() {
		return visible;
		
	}
	
	protected void setVisible(boolean visible) {
		this.visible = visible;
		
	}
	
	protected boolean getPhasing() {
		return phasing;
		
	}
	
	protected void setPhasing(boolean phasing) {
		this.phasing = phasing;
		
	}
	
	protected int getPhaseState() {
		return phaseState;
		
	}
	
	protected void setPhaseState(int phaseState) {
		this.phaseState = phaseState;
		
	}

}
