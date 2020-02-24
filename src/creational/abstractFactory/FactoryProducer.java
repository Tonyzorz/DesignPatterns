package creational.abstractFactory;

public class FactoryProducer {
	
	public static AbstractFactory getShape(boolean round) {
		if(round) return new RoundedShapeFactory();
		else return new ShapeFactory();
	}
}
