package JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.data;

import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.contracts.Repository;
import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.contracts.Unit;

import java.util.Map;
import java.util.TreeMap;

public class UnitRepository implements Repository {

	private Map<String, Integer> amountOfUnits;

	public UnitRepository() {
		this.amountOfUnits = new TreeMap<>();
	}

	public void addUnit(Unit unit) {
		String unitType = unit.getClass().getSimpleName();

		if (!this.amountOfUnits.containsKey(unitType)) {
			this.amountOfUnits.put(unitType, 0);
		}

		int newAmount = this.amountOfUnits.get(unitType) + 1;
		this.amountOfUnits.put(unitType, newAmount);
	}

	public String getStatistics() {
		StringBuilder statBuilder = new StringBuilder();

		for (Map.Entry<String, Integer> entry : amountOfUnits.entrySet()) {
			String formattedEntry =
					String.format("%s -> %d", entry.getKey(), entry.getValue());
			statBuilder.append(formattedEntry).append(System.lineSeparator());
		}

		statBuilder.setLength(
				statBuilder.length() - System.lineSeparator().length());

		return statBuilder.toString();
	}

	public String removeUnit(String unitType) {
		if (this.amountOfUnits.containsKey(unitType)
			&& this.amountOfUnits.get(unitType) > 0) {

			this.amountOfUnits.put(unitType, this.amountOfUnits.get(unitType) - 1);
		} else {
			throw new IllegalArgumentException("No such units in repository.");
		}

		return unitType;
	}
}
