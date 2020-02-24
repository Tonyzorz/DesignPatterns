package creational.abstractFactory;

public class ShapeFactory implements AbstractFactory{

	
	@Override
	public Shape getShape(String shape) {
		if(shape.equals("square")) return new Square();
		else if(shape.equals("rectangle")) return new Rectangle();
		return null;
	}

}
