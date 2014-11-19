package districtCourt;

import java.util.ArrayList;
import java.util.List;

public abstract class Case {
	private Judge judge;
	protected List<JudicialAssessor> judicialAssessors;
	private Defendant defendant;
	private List<Witness> witnesses;

	public Case(Defendant defendant, List<Witness> witnesses) {
		super();
		this.judicialAssessors = new ArrayList<JudicialAssessor>();
		this.setDefendant(defendant);
		this.setWitnesses(witnesses);
	}

	public Judge getJudge() {
		return judge;
	}

	public void setJudge(Judge judge) {
		// if (judge == null) {
		// throw new NullPointerException("Judge cannot be null");
		// }

		this.judge = judge;
	}

	public List<JudicialAssessor> getJudicialAssessors() {
		return judicialAssessors;
	}

	public void setJudicialAssessors(List<JudicialAssessor> judicialAssessors) {
		if (judicialAssessors == null) {
			throw new NullPointerException("JudicialAssessors cannot be null");
		}

		this.judicialAssessors = judicialAssessors;
	}

	public void addJudicialAssessors(JudicialAssessor judicialAssessors) {
		// if (judicialAssessors == null) {
		// throw new NullPointerException("Enter valid assesor");
		// }

		this.judicialAssessors.add(judicialAssessors);
	}

	public Defendant getDefendant() {
		return defendant;
	}

	public void setDefendant(Defendant defendant) {
		if (defendant == null) {
			throw new NullPointerException("Enter valid defendant.");
		}

		this.defendant = defendant;
	}

	public List<Witness> getWitnesses() {
		return this.witnesses;
	}

	public void setWitnesses(List<Witness> witnesses) {
		if (witnesses == null) {
			throw new NullPointerException("Witnesses cannot be null");
		}

		this.witnesses = witnesses;
	}

	@Override
	public String toString() {
		return String.format("Judge: %s defendant: %s witnesses: %s",
				this.judge, this.defendant, this.witnesses.toString());
	}

}
