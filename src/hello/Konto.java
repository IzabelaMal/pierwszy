package hello;
/* to jest klasa konto*/
public class Konto {

	private final int numer;
	private int saldo;
	private Osoba wlasciciel;
	
	public Konto(int numer, int saldo, Osoba wlasciciel) {
		this.numer = numer;
		this.saldo = saldo;
		this.wlasciciel = wlasciciel;
	}
	
	public Osoba getWlasciciel() {
		return wlasciciel;
	}

	public void setWlasciciel(Osoba wlasciciel) {
		this.wlasciciel = wlasciciel;
	}


	public int getNumer() {
		return numer;
	}


	public int getSaldo() {
		return saldo;
	}


	@Override
	public String toString() {
		return "Konto nr " + numer + ", " + saldo + ", wł. " + wlasciciel + "]";
	}
	
	public void wplata(int kwota) {
		saldo += kwota;
		
	}
}
