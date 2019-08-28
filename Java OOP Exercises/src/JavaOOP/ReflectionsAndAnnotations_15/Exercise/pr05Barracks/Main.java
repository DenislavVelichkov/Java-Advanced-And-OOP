package JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr05Barracks;

import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr05Barracks.contracts.Repository;
import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr05Barracks.contracts.Runnable;
import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr05Barracks.contracts.UnitFactory;
import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr05Barracks.core.CommandInterpreterImpl;
import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr05Barracks.core.Engine;
import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr05Barracks.core.factories.UnitFactoryImpl;
import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr05Barracks.data.UnitRepository;

public class Main {

	public static void main(String[] args) {
		Repository repository = new UnitRepository();
		UnitFactory unitFactory = new UnitFactoryImpl();
		Runnable engine = new Engine(new CommandInterpreterImpl(repository, unitFactory));
		engine.run();
	}
}
