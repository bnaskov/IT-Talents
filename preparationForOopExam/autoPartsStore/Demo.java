package preparationForOopExam.autoPartsStore;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {

		try {
			Car[] cars = new Car[] { new Car("Shkoda", "Superb", 2008),
					new Car("Volkswagen", "Golf", 2007) };
			Manufacturer shkoda = new Manufacturer("Shkoda", "Poland",
					"Warsow 12405", "0157 18 3654", "+07 6718 3654");
			Manufacturer volkswagen = new Manufacturer("Volkswagen", "Germany",
					"Munich 7634", "987 5554 231", "+0543 9975 165");
			AutoPart enginePart = new EnginePart("asr10", "engine part", 120,
					210, cars, shkoda);
			AutoPart accessoryPart = new AccessoryPart("acp123",
					"Heated front-seats", 250, 420, cars, volkswagen);
			AutoPart tyrePart = new TyrePart("tp431", "Chrome wheels", 720,
					1450, cars, volkswagen);
			AutoPart suspensionPart = new SuspensionPart("sp067",
					"Super suspension", 420, 850, cars, shkoda);

			ArrayList<AutoPart> autoparts = new ArrayList<AutoPart>() {
			};
			autoparts.add(enginePart);
			autoparts.add(accessoryPart);
			autoparts.add(tyrePart);
			autoparts.add(suspensionPart);
			AutoPartsStore autoPartsStore = new AutoPartsStore(autoparts);
			autoPartsStore.addPart(enginePart);
			for (AutoPart autoPart : autoparts) {
				System.out.println(autoPart.toString());
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
