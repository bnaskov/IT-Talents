package districtCourt;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class DistrictCourt<P extends LegalPerson, C extends Case> {

	private String name;
	private String address;
	private List<P> legalPersons;
	private List<C> cases;

	public DistrictCourt(String name, String address) {
		this.setName(name);
		this.setAddress(address);
		this.legalPersons = new ArrayList();
		this.cases = new ArrayList();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() < 2) {
			throw new IllegalArgumentException(
					"Court name must be at least 2 symbols.");
		}
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (address.length() < 2) {
			throw new IllegalArgumentException(
					"Court name must be at least 2 symbols.");
		}
		this.address = address;
	}

	public List<P> getLegalPersons() {
		return legalPersons;
	}

	public void addLegalPersons(List<P> legalPersons) {
		if (legalPersons == null) {
			throw new NullPointerException("Enter valid list of legal persons.");
		}
		this.legalPersons.addAll(legalPersons);
	}

	public List<C> getCases() {
		return cases;
	}

	public void addCase(C baseCase) {
		if (legalPersons == null) {
			throw new NullPointerException("Enter valid case.");
		}
		if (baseCase instanceof CivilCase) {
			while (true) {
				LegalPerson lp = this.legalPersons.get(Demo.randInt(0, 19));
				if (lp instanceof Judge) {
					baseCase.setJudge((Judge) lp);
					break;
				}
			}

			int count = 0;
			for (LegalPerson lp : this.legalPersons) {
				if (lp instanceof JudicialAssessor) {
					baseCase.addJudicialAssessors((JudicialAssessor) lp);
					count++;
				}
				if (count == 3) {
					break;
				}
			}

			this.cases.add(baseCase);
		} else if (baseCase instanceof CriminalCase) {
			while (true) {
				LegalPerson lp = this.legalPersons.get(Demo.randInt(0, 19));
				if (lp instanceof Judge) {
					baseCase.setJudge((Judge) lp);
					break;
				}
			}

			int count = 0;
			for (LegalPerson lp : this.legalPersons) {
				if (lp instanceof JudicialAssessor) {
					baseCase.addJudicialAssessors((JudicialAssessor) lp);
					count++;
				}
				if (count == 10) {
					break;
				}
			}

			this.cases.add(baseCase);
		}
	}

	public void proceed() {
		for (Case cas : this.cases) {
			cas.getJudge().setNumberOfCases(
					cas.getJudge().getNumberOfCases() + 1);

			for (JudicialAssessor jaz : cas.getJudicialAssessors()) {
				jaz.setNumberOfCases(jaz.getNumberOfCases() + 1);
			}

			if (cas instanceof CriminalCase) {
				Prosecutor prosec = ((CriminalCase) cas).getProsecutor();
				int yearsPro = prosec.getNumberOfCases() + 1;
				((CriminalCase) cas).getProsecutor()
						.setNumberOfCases(
								((CriminalCase) cas).getProsecutor()
										.getNumberOfCases() + 1);
			}
		}

		try (PrintWriter writer = new PrintWriter("output.txt")) {
			for (Case c : cases) {
				if (c instanceof CivilCase) {
					writer.println("CIVIL CASE:");
					writer.println(c);
					List<Lawyer> accuserLawyers = new ArrayList(((CivilCase) c)
							.getAccuser().getLawyers());
					writer.println("ACCUSER'S LAWYERS ASK DEFENDANT QUESTIONS");
					for (Lawyer law : accuserLawyers) {
						for (int i = 0; i < 3; i++) {
							writer.println("\t" + law.getName() + " asks:");
							writer.println(QandA.questions[Demo.randInt(0, 5)]);
							writer.println("\t"
									+ c.getDefendant().getFullName()
									+ " answers: ");
							writer.println(QandA.answers[Demo.randInt(0, 5)]);
						}
						writer.println();
					}
					writer.println("------------------------");

					writer.println("ACCUSER'S LAWYERS ASK WITNESSES QUESTIONS");
					for (Lawyer lawyer : accuserLawyers) {
						for (Witness wit : ((CivilCase) c).getWitnesses()) {
							for (int i = 0; i < 2; i++) {
								writer.println("\t" + lawyer.getName()
										+ " asks:");
								writer.println(QandA.questions[Demo.randInt(0,
										5)]);
								writer.println("\t" + wit.getFullName()
										+ " answers: ");
								writer.println(QandA.answers[Demo.randInt(0, 5)]);
							}
						}
						writer.println();
					}
					writer.println("------------------------");

				} else if (c instanceof CriminalCase) {
					writer.println("CRIMINAL CASE:");
					writer.println(c);
					Prosecutor procd = ((CriminalCase) c).getProsecutor();
					writer.println("PROSECUTOR ASK DEFENDANT QUESTIONS");
					for (int i = 0; i < 5; i++) {
						writer.println("\t" + procd.getName() + " asks:");
						writer.println(QandA.questions[Demo.randInt(0, 5)]);
						writer.println("\t" + c.getDefendant().getFullName()
								+ " answers: ");
						writer.println(QandA.answers[Demo.randInt(0, 5)]);
					}
					writer.println("------------------------");

					writer.println("PROSECUTOR ASK WITNESSES QUESTIONS");
					for (Witness wit : c.getWitnesses()) {
						for (int i = 0; i < 5; i++) {
							writer.println("\t" + procd.getName() + " asks:");
							writer.println(QandA.questions[Demo.randInt(0, 5)]);
							writer.println("\t" + wit.getFullName()
									+ " answers: ");
							writer.println(QandA.answers[Demo.randInt(0, 5)]);
						}
					}
					writer.println("------------------------");
				}

				writer.println("DEFENDANT'S LAWYERS ASK  WITNESSES QUESTIONS");
				List<Lawyer> defendantLawyers = new ArrayList(c.getDefendant()
						.getLawyers());
				for (Lawyer lawyer : defendantLawyers) {
					for (Witness witness : c.getWitnesses()) {
						writer.println("\t" + lawyer.getName() + " asks:");
						writer.println(QandA.questions[Demo.randInt(0, 5)]);
						writer.println("\t" + witness.getFullName()
								+ " answers:");
						writer.println(QandA.answers[Demo.randInt(0, 5)]);
					}
					writer.println();
				}
				writer.println("------------------------");

				int judgement = 0;
				int sentence = 0;
				ArrayList<JudicialAssessor> ja = new ArrayList(
						c.getJudicialAssessors());
				for (JudicialAssessor judicialAssessor : ja) {
					// 1 means not guilty, 0 mean guilty
					judgement += Demo.randInt(0, 1);
				}
				if (judgement > ja.size() / 2) {
					writer.println("The judicial assessors finds the defendant not guilty!");
				} else {
					writer.println("The judicial assessors finds the defendant guilty!");
					sentence = Demo.randInt(3, 10);
					writer.println("The defendant is sentenced to " + sentence
							+ " years in prison!");
				}
				writer.println("END OF CASE");
				writer.println();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}

	}
}
