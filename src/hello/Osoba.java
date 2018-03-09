package hello;

import java.time.LocalDate;
import java.time.Period;

public class Osoba {
    private String imie, nazwisko;
    private LocalDate dataUrodzenia;
    
    public Osoba() {
   	 
    }
    
    Osoba(String imi, String naz) {
   	 imie = imi;
   	 nazwisko = naz;
    }
    
    public Osoba(String imie, String nazwisko, LocalDate dataUrodzenia) {
   	 this.imie = imie;
   	 this.nazwisko = nazwisko;
   	 this.dataUrodzenia = dataUrodzenia;
    }
    
    public Osoba(String imie, String nazwisko, String dataUrodzenia) {
   	 // W ten sposób z jednego konstruktora możemy wywołać inny konstruktor tej samej klasy
   	 // Przy tym zapisie this musi być pierwszą instrukcją w konstruktorze
   	 this(imie, nazwisko, LocalDate.parse(dataUrodzenia));
    }

    public void przedstawSie() {
   	 System.out.println("Nazywam się " + imie + " " + nazwisko
   			 + " i mam " + getWiek() + " lat.");
    }
    
    public String getImie() {
   	 return imie;
    }
    
    public String getNazwisko() {
   	 return nazwisko;
    }
    
    public LocalDate getDataUrodzenia() {
   	 return dataUrodzenia;
    }
    
    public void setImie(String imie) {
   	 this.imie = imie;
    }
    
    public void setNazwisko(String nazwisko) {
   	 this.nazwisko = nazwisko;
    }

    public void setDataUrodzenia(LocalDate data) {
   	 this.dataUrodzenia = data;
    }
    
    public void setDataUrodzenia(String data) {
   	 this.dataUrodzenia = LocalDate.parse(data);
    }
    
    public int getWiek() {
   	 if(dataUrodzenia == null) {
   		 // jeśli data urodzenia jest nieznana, to jako wiek zwracamy -1
   		 return -1;
   	 }
   	 LocalDate dzisiaj = LocalDate.now();
   	 // liczba lat, miesięcy i dni pomiędzy jedną a drugą datą
   	 Period wiekDokladnie = Period.between(dataUrodzenia, dzisiaj);
   	 return wiekDokladnie.getYears();
    }

    // bez @Override działa tak samo
    public String toString() {
   	 return imie + " " + nazwisko + " " + getWiek() + " lat";
    }
    
    public String kimJestes() {
    	return "Jestem Osobą";
    }
}
