package curs7;

public class TestMostenire {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Tester obj =new Tester();
		//obj.setEmail(null);
		//Angajat->Tester->TesterAutomat
		//Angajat - clasa parinte; superclsa;
		TesterAutomat obj =new TesterAutomat();
		obj.setProgrammingLanguage("Java");
		obj.setDepartament("QA");
		obj.setSeniority("Senior");
	}

}
