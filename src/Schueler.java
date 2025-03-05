import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class Schueler {
    private String name; // private = restricted access
    private int Alter;

    // Getter
    public String getName() {
        return name;
    }
    public int getAlter() {
        return Alter;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
    public void setAlter(int newNAlter) {
        this.Alter = newNAlter+50;
    }
    public void berechneAlterUndGeburtstag( String geburtstag)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate geburtsdatum = LocalDate.parse(geburtstag, formatter);
        LocalDate heute = LocalDate.now();
        int alter = (int) ChronoUnit.YEARS.between(geburtsdatum, heute);
        LocalDate naechsterGeburtstag = geburtsdatum.withYear(heute.getYear());
        if (naechsterGeburtstag.isBefore(heute) || naechsterGeburtstag.equals(heute)) {
            naechsterGeburtstag = naechsterGeburtstag.plusYears(1);
        }
        // Tage bis zum nächsten Geburtstag berechnen
        long tageBisNaechsterGeburtstag = ChronoUnit.DAYS.between(heute, naechsterGeburtstag);

        // Ausgabe
        System.out.println(getName()+" du bist " + alter + " Jahre jung");
        System.out.println("Tage bis zum nächsten Geburtstag: " + tageBisNaechsterGeburtstag + " Tage");
    }
}