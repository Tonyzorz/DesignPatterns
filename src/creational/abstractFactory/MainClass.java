package creational.abstractFactory;

public class MainClass {

	public static void main(String[] args) {
		AbstractFactory af = FactoryProducer.getShape(true);
		Shape shape = af.getShape("rectangle");
		shape.draw();
	}
}
