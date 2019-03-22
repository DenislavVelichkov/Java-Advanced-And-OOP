package JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr0304Barracks;

import pr0304Barracks.interfaces.Repository;
import pr0304Barracks.interfaces.Runnable;
import pr0304Barracks.interfaces.UnitFactory;
import pr0304Barracks.core.Engine;
import pr0304Barracks.core.factories.UnitFactoryImpl;
import pr0304Barracks.data.UnitRepository;

public class Main {

	public static void main(String[] args) {
		Repository repository = new UnitRepository();
		UnitFactory unitFactory = new UnitFactoryImpl();
		Runnable engine = new Engine(repository, unitFactory);
		engine.run();
	}
}
