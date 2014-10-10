package preparationForOopExam.autoPartsStore;

public class Validation {

	static void ValidateForNullorEmpry(String param)
			throws IllegalArgumentException {
		if (param == null || param.equals("")) {
			throw new IllegalArgumentException(
					"Parameter cannot be null or empty.");
		}
	}

	static void ValidateForNegativeNumer(double param)
			throws IllegalArgumentException {
		if (param < 0) {
			throw new IllegalArgumentException(
					"Parameter cannot be less than 0.");
		}
	}

	static void ValidateYearOfProduction(double param)
			throws IllegalArgumentException {
		if (param < 1900 || param > 2014) {
			throw new IllegalArgumentException(
					"Year must be in the range [1900...2014].");
		}
	}

}
