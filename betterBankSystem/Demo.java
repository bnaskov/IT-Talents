package betterBankSystem;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		Bank ubbBank = new Bank("UBB", "Sofia, Tz. street, 120");
		Deposit shortDeposit = new Deposit("Short Deposit", 3, 3);
		Deposit longDeposit = new Deposit("Long Deposit", 5, 12);
		Credit homeCredit = new Credit("Home Credit", 6);
		Credit consumerCredit = new Credit("Consumer Credit", 10);

		Client ivan = new Client("Ivan", "Sofia", 2000, 1200);
		Client mario = new Client("Mario", "Turnovo", 4000, 800);
		Client george = new Client("George", "Sofia", 1000, 1500);
		Client mitko = new Client("Mitko", "Plovdiv", 12000, 1000);
		Client pesho = new Client("Pesho", "Sofia", 500, 900);
		Client maria = new Client("Maria", "Sliven", 3000, 3000);
		Client iva = new Client("Iva", "Varna", 7400, 1300);
		Client irena = new Client("Irena", "Varna", 2500, 1400);
		Client mira = new Client("Mira", "Plovdiv", 4000, 1800);
		Client petya = new Client("Petya", "Sofia", 1200, 2200);
		ArrayList<Client> clients = new ArrayList(Arrays.asList(ivan, mario,
				george, mitko, pesho, maria, iva, irena, mira, petya));

		// Randomizer.Deposit(ubbBank, clients);

		try {
			mario.openDeposit(ubbBank, new Deposit("Short Deposit", 3, 3), 2000);
			mario.openDeposit(ubbBank, new Deposit("Short Deposit", 3, 3), 1000);
			// System.out.println(ubbBank);
			mario.takeCredit(ubbBank, new Credit("Consumer Credit", 10), 1000,
					12);
			System.out.println(ubbBank);
			System.out.println("Mario before bank paying deposit interest:");
			System.out.println(mario);
			System.out
					.println("Mario after the bank has paid all deposit payments:");
			ubbBank.payDepositInterest();
			ubbBank.payDepositInterest();
			ubbBank.payDepositInterest();
			System.out.println(mario);
			// System.out.println(ubbBank);
			System.out
					.println("Mario after paying one credit monthly payment:");
			mario.payCreditsMonthlyPayment(ubbBank);
			System.out.println(mario);
		} catch (IllegalArgumentException iae) {
			System.out.println(iae.getMessage());
		}

	}
}
