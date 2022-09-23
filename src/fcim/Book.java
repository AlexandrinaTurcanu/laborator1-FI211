package fcim;

public class Book {
    public String editura = "Polirom";
    public String autor = "ERICH MARIA REMARQUE";
    public String denumire = "Trei camarazi";
    public String gen = "razboi";
    public int anulEditiei = 2020;
    public int nrPagini = 250;

    public Book(){

    }
    public Book(String editura,String autor, String denumire, int anulEditiei, int nrPagini){
        this.editura = editura;
        this.autor = autor;
        this.denumire = denumire;
        this.anulEditiei = anulEditiei;
        this.nrPagini = nrPagini;
    }


    public void afisare(){
        System.out.println(this.editura + " Autor: " + this.autor + ": " + this.denumire + ", Genul: " + gen);
        System.out.println(" Editia anului " + this.anulEditiei + ", nr. pagini: " + nrPagini);
    }
}
