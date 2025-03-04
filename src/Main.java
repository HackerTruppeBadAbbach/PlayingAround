public class Main {
    public static void main(String[] args) {

        Schueler s= new Schueler();

        System.out.println("Wie heisst du?");
        s.setName(System.console().readLine());
        System.out.println("Wann bist du geboren?");
        s.berechneAlterUndGeburtstag(System.console().readLine());
        //s.setAlter(Integer.parseInt(System.console().readLine()));

        //System.out.println(s.getName()+" sieht aber aus wie "+ s.getAlter()+"!");
    }
}