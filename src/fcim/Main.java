package fcim;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.afisare();

        Book book2 = new Book("Cartier","Ernest Hemingway", "Pentru cine bat clopotele", 2017, 378);
        book2.afisare();

        Book book3 = new Book("Adevarul","Vasili Grossman", "Viata si destin", 2015, 612);
        book3.afisare();
    }


}
