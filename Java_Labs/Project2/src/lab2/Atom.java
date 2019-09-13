package lab2;

public class Atom {

	/* 
	 * Number of Protons in the Atom
	*/
	private int numProtons;
	
	/*
	 * Number of Electrons in the Atom
	*/
	
	private int numElectrons;
	
	/*
	 * Number of Neutrons in the Atom
	*/
	
	private int numNeutrons;

	
	/**
	 * Constructs Atom object with given number of Protons, Neutrons, and Electrons
	 * @param givenProtons
	 * @param givenElectrons
	 * @param givenNeutrons
	 */
	public Atom(int givenProtons, int givenNeutrons, int givenElectrons) {
		
		/*
		 * Sets  instance variables to given variables for each Protons, Neutrons, and Electrons
		 */
		
		numProtons = givenProtons;
		numElectrons = givenElectrons;
		numNeutrons = givenNeutrons;

	}
	/*
	 * Method for obtaining AtomicMass
	 * @return atomicWeight
	 */
	public int getAtomicMass() {
		return numProtons + numNeutrons;
		
	}
	/*
	 * Method for obtaining Atomic Charge. Difference in Protons and Electrons
	 * @return numProtons - numElectrons
	 */
	
	public int getAtomicCharge() {
		return numProtons - numElectrons;
		
	}
	
	/*
	 * Method to decay the Atom. Decrements Protons and Neutrons by two
	 */
	public void decay() {
		numProtons = numProtons - 2;
		numNeutrons = numNeutrons - 2;
		
		
	}
	
}
