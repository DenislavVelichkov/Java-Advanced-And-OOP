package JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr0304Barracks;

import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr0304Barracks.contracts.Repository;
import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr0304Barracks.contracts.Runnable;
import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr0304Barracks.contracts.UnitFactory;
import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr0304Barracks.core.Engine;
import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr0304Barracks.core.factories.UnitFactoryImpl;
import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr0304Barracks.data.UnitRepository;

public class Main {

	public static void main(String[] args) {
		Repository repository = new UnitRepository();
		UnitFactory unitFactory = new UnitFactoryImpl();
		Runnable engine = new Engine(repository, unitFactory);
		engine.run();
	}
}
