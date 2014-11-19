package districtCourt;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

public class Demo {

	public static void main(String[] args) {
		DistrictCourt districtCourt = new DistrictCourt("Tyrnovo",
				"blv. Freedom");

		Judge j1 = new Judge("Ivan Ivanov", 6, 12);
		Judge j2 = new Judge("Ivan Georgiev", 8, 10);
		Judge j3 = new Judge("Ivan Simeonov", 9, 16);
		List<Judge> judges = new ArrayList();
		judges.add(j1);
		judges.add(j2);
		judges.add(j3);

		JudicialAssessor ja1 = new JudicialAssessor("Peter Draganov", 12, 5);
		JudicialAssessor ja2 = new JudicialAssessor("Peter Ivanov", 22, 12);
		JudicialAssessor ja3 = new JudicialAssessor("Peter Tichev", 10, 10);
		JudicialAssessor ja4 = new JudicialAssessor("Peter Tikov", 15, 20);
		JudicialAssessor ja5 = new JudicialAssessor("Peter Peshev", 9, 16);
		JudicialAssessor ja6 = new JudicialAssessor("Peter Zanev", 12, 23);
		JudicialAssessor ja7 = new JudicialAssessor("Peter Dimitriev", 15, 25);
		JudicialAssessor ja8 = new JudicialAssessor("Peter Petkov", 11, 23);
		JudicialAssessor ja9 = new JudicialAssessor("Peter Mikov", 18, 32);
		JudicialAssessor ja10 = new JudicialAssessor("Peter Dinev", 20, 40);
		List<JudicialAssessor> judicialAssessors = new ArrayList();
		judicialAssessors.add(ja1);
		judicialAssessors.add(ja2);
		judicialAssessors.add(ja3);
		judicialAssessors.add(ja4);
		judicialAssessors.add(ja5);
		judicialAssessors.add(ja6);
		judicialAssessors.add(ja7);
		judicialAssessors.add(ja8);
		judicialAssessors.add(ja9);
		judicialAssessors.add(ja10);

		Lawyer l1 = new Lawyer("George Vankov", 13, 23);
		Lawyer l2 = new Lawyer("George Nasov", 13, 23);
		Lawyer l3 = new Lawyer("George Penev", 13, 23);
		Lawyer l4 = new Lawyer("George Draganov", 13, 23);
		Lawyer l5 = new Lawyer("George Tashev", 13, 23);
		List<Lawyer> lawyers = new ArrayList();
		lawyers.add(l1);
		lawyers.add(l2);
		lawyers.add(l3);
		lawyers.add(l4);
		lawyers.add(l5);

		Prosecutor p1 = new Prosecutor("Mario Penev", 20, 42);
		Prosecutor p2 = new Prosecutor("Mario Tanev", 22, 46);
		List<Prosecutor> prosecutors = new ArrayList();
		prosecutors.add(p1);
		prosecutors.add(p2);

		Accuser a1 = new Accuser("Dimo Tinev", "Sofia", 24);
		Accuser a2 = new Accuser("Dimo Tonev", "Plovdiv", 34);
		Accuser a3 = new Accuser("Dimo Gashev", "Sofia", 29);
		Accuser a4 = new Accuser("Dimo Milev", "Ruse", 31);
		Accuser a5 = new Accuser("Dimo Nasov", "Sofia", 42);
		List<Accuser> accusers = new ArrayList();
		accusers.add(a1);
		accusers.add(a2);
		accusers.add(a3);
		accusers.add(a4);
		accusers.add(a5);

		Defendant d1 = new Defendant("Maria Taneva", "Sliven", 32);
		Defendant d2 = new Defendant("Maria Kicheva", "Sofia", 42);
		Defendant d3 = new Defendant("Maria Pesheva", "Sliven", 22);
		Defendant d4 = new Defendant("Maria Todorova", "Varna", 42);
		Defendant d5 = new Defendant("Maria Yaneva", "Sofia", 38);
		List<Defendant> defendants = new ArrayList();
		defendants.add(d1);
		defendants.add(d2);
		defendants.add(d3);
		defendants.add(d4);
		defendants.add(d5);

		Witness w1 = new Witness("Milena Taneva", "Sofia", 25);
		Witness w2 = new Witness("Milena Peneva", "Sliven", 25);
		Witness w3 = new Witness("Milena Tankina", "Ruse", 25);
		Witness w4 = new Witness("Milena Simeonova", "Sofia", 25);
		Witness w5 = new Witness("Milena Georgieva", "Ruse", 25);
		Witness w6 = new Witness("Milena Jeleva", "Sliven", 25);
		Witness w7 = new Witness("Milena Borisova", "Sofia", 25);
		Witness w8 = new Witness("Milena Dineva", "Plovdiv", 25);
		Witness w9 = new Witness("Milena Minkova", "Plovdiv", 25);
		Witness w10 = new Witness("Milena Zareva", "Ruse", 25);
		List<Witness> witnesses = new ArrayList();
		witnesses.add(w1);
		witnesses.add(w2);
		witnesses.add(w3);
		witnesses.add(w4);
		witnesses.add(w5);
		witnesses.add(w6);
		witnesses.add(w7);
		witnesses.add(w8);
		witnesses.add(w9);
		witnesses.add(w10);

		// add legal persons
		districtCourt.addLegalPersons(judges);
		districtCourt.addLegalPersons(judicialAssessors);
		districtCourt.addLegalPersons(lawyers);
		districtCourt.addLegalPersons(prosecutors);

		CivilCase cs1 = createCivilCase(defendants, lawyers, witnesses,
				accusers);
		CivilCase cs2 = createCivilCase(defendants, lawyers, witnesses,
				accusers);
		CivilCase cs3 = createCivilCase(defendants, lawyers, witnesses,
				accusers);

		CriminalCase cc1 = createCriminalCase(defendants, lawyers, witnesses,
				prosecutors);
		CriminalCase cc2 = createCriminalCase(defendants, lawyers, witnesses,
				prosecutors);
		CriminalCase cc3 = createCriminalCase(defendants, lawyers, witnesses,
				prosecutors);

		districtCourt.addCase(cs1);
		districtCourt.addCase(cs2);
		districtCourt.addCase(cs3);
		districtCourt.addCase(cc1);
		districtCourt.addCase(cc2);
		districtCourt.addCase(cc3);

		districtCourt.proceed();

		XStream xs = new XStream();
		String xml = xs.toXML(districtCourt);
		try (PrintWriter writer = new PrintWriter("districtCourt.xml")) {
			writer.println(xml);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		Gson gson = new Gson();
		String json = gson.toJson(districtCourt);
		try (PrintWriter writer = new PrintWriter("districtCourt.json")) {
			writer.println(json);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static CriminalCase createCriminalCase(List<Defendant> defendants,
			List<Lawyer> lawyers, List<Witness> witnesses,
			List<Prosecutor> prosecutors) {
		Defendant def = defendants.get(randInt(0, 4));
		def.addLawyer(lawyers.get(randInt(0, 4)));
		def.addLawyer(lawyers.get(randInt(0, 4)));
		Prosecutor pro = prosecutors.get(randInt(0, 1));
		List<Witness> wits = new ArrayList();
		wits.add(witnesses.get(randInt(0, 9)));
		wits.add(witnesses.get(randInt(0, 9)));
		wits.add(witnesses.get(randInt(0, 9)));

		return new CriminalCase(def, wits, pro);
	}

	private static CivilCase createCivilCase(List<Defendant> defendants,
			List<Lawyer> lawyers, List<Witness> witnesses,
			List<Accuser> accusers) {
		Defendant def = defendants.get(randInt(0, 4));
		def.addLawyer(lawyers.get(randInt(0, 4)));
		def.addLawyer(lawyers.get(randInt(0, 4)));
		Accuser acc = accusers.get(randInt(0, 4));
		acc.addLawyer(lawyers.get(randInt(0, 4)));
		acc.addLawyer(lawyers.get(randInt(0, 4)));
		List<Witness> wits = new ArrayList();
		wits.add(witnesses.get(randInt(0, 9)));
		wits.add(witnesses.get(randInt(0, 9)));
		wits.add(witnesses.get(randInt(0, 9)));

		return new CivilCase(def, wits, acc);
	}

	public static int randInt(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}
}
