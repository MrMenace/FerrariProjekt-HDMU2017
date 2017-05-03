package domain;

public class Kunde {
private long cprNr;
private String navn;
	public Kunde(String navn, long cprNr){
		this.navn = navn;
		this.cprNr = cprNr;
	}
	public String getNavn(){
		return navn;
	}
	public long getCprNr(){
		return cprNr;
	}
	@Override
	public String toString(){
		return navn + " " + cprNr;
	}
}