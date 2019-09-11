package lab2;

public class AtomTest {

	public static void main(String[] args) {
		Atom U238 = new Atom(92,146,92);
		System.out.println(U238.getAtomicMass());
		System.out.println(U238.getAtomicCharge());
		U238.decay();
		System.out.println(U238.getAtomicMass());
		System.out.println(U238.getAtomicCharge());
		

	}

}
