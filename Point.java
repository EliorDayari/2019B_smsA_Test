package test;

import java.io.Serializable;

public class Point implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	final double x1,y1,z1;
	
	public Point() {
		x=0;
		y=0;
		z=0;
	}
	
	public Point(double x,double y,double z) {
		x1=x;
		y1=y;
		z1=z;
	}
	
	@Override
	public String toString() {
		return "("+x+","+y+","+z+")";
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}
}
