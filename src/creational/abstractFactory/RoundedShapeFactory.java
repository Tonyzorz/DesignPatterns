package creational.abstractFactory;

public class RoundedShapeFactory implements AbstractFactory{

	
	@Override
	public Shape getShape(String shape) {
		if(shape.equals("square")) return new RoundedSquare();
		else if(shape.equals("rectangle")) return new RoundedRectangle();
		return null;
	}

}
