package preparationForOopExam.autoPartsStore;

import java.util.ArrayList;

public class AutoPartsStore {
	private ArrayList<AutoPart> autoParts = new ArrayList<AutoPart>();

	public AutoPartsStore(ArrayList<AutoPart> autoparts) {
		this.autoParts = autoparts;
	}

	public void addPart(AutoPart part) {
		this.autoParts.add(part);
	}
}
