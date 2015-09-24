package kr.ac.kookmin.shape;

public class Ellipse extends Shape{
	int w;
	int h;
	Ellipse(Point center,int w,int h){
		super(center);
		this.w=w;
		this.h=h;
	}       
	public Rectangle getBounds(){
		return new Rectangle(center, w*2, h*2);
	}

	@Override
	public void draw(Graphics g) {
		g.draw(this);
	}
	@Override
	public String toString() {
		return "Ellipse";
	}

}
