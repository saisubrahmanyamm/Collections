import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;

public class PhoneContactList {

	public static Hashtable<String, Hashtable<String, ArrayList<String>>> savingNumbersofWorkAndHome(String name)
			throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> workPhoneNumbers = new ArrayList<String>();
		ArrayList<String> homePhoneNumbers = new ArrayList<String>();
		ArrayList<String> otherPhoneNumbers = new ArrayList<String>();
		System.out.println("How many 'Work' phone numbers do you have : ");
		int workPhoneNumbersCount = Integer.parseInt(br.readLine());

		for (int iterator = 1; iterator <= workPhoneNumbersCount; iterator++) {
			System.out.println("Enter " + iterator + " work phone number :");
			workPhoneNumbers.add(br.readLine());
		}
		System.out.println("How many 'Home' phone numbers do you have : ");
		int homePhoneNumbersCount = Integer.parseInt(br.readLine());
		for (int iterator = 1; iterator <= homePhoneNumbersCount; iterator++) {
			System.out.println("Enter " + iterator + " home phone numbers :");
			homePhoneNumbers.add(br.readLine());
		}
		System.out.println("How many 'Other' phone numbers do you have : ");
		int otherPhoneNumbersCount = Integer.parseInt(br.readLine());
		for (int iterator = 1; iterator <= otherPhoneNumbersCount; iterator++) {
			System.out.println("Enter " + iterator + " other phone numbers :");
			otherPhoneNumbers.add(br.readLine());
		}
		Hashtable<String, ArrayList<String>> fields = new Hashtable<String, ArrayList<String>>();
		fields.put("Work", workPhoneNumbers);
		fields.put("Home", homePhoneNumbers);
		fields.put("Other", otherPhoneNumbers);

		Hashtable<String, Hashtable<String,ArrayList<String>>> fieldsList = new Hashtable<String, Hashtable<String,ArrayList<String>>>();
		fieldsList.put(name, fields);
		return fieldsList;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayList<Hashtable<String, Hashtable<String, ArrayList<String>>>> phoneContacts = new ArrayList<Hashtable<String, Hashtable<String, ArrayList<String>>>>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of names do u want to save : ");
		int names = Integer.parseInt(br.readLine());
		for (int iterator = 1; iterator <= names; iterator++) {
			System.out.println("Enter " + iterator + " Name :");
			String contactName = br.readLine();
			phoneContacts.add(savingNumbersofWorkAndHome(contactName));
		}
		System.out.println(phoneContacts);
	}
}
