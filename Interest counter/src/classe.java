
public class classe {

	public static void main(String[] args) {
		
		
		double costicc = 300; //costi mantenimento conto corrente in euro 
		double percentualeInteresse = 2.5; //percentuale interesse annuale 
		double sommaDeposita = 1000;      //somma depositata in euro 
		
		
		System.out.println("Partendo da 1000 EURO");
		//dopo un anno	
		sommaDeposita = sommaDeposita + (sommaDeposita/100)*percentualeInteresse;
		System.out.println("Dopo 1 anno avrai "+ sommaDeposita + " euro"); 
		//dopo 2 anni 
		sommaDeposita = sommaDeposita + (sommaDeposita/100)*percentualeInteresse;
		System.out.println("Dopo 2 anni avrai " + sommaDeposita + " euro");
		//dopo 3 anni
		sommaDeposita = sommaDeposita + (sommaDeposita/100)*percentualeInteresse;
		System.out.println("Dopo 3 anni avrai " + sommaDeposita + " euro");	
	}	

}
			