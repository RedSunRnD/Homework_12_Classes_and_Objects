public class Main {
    public static void main(String[] args) {
        Author sergeyLukyanenko = new Author("Сергей", "Лукьяненко");
        Author viktorPelevin = new Author("Виктор", "Пелевин");
        Book nochnoyDozor = new Book("Ночной Дозор", sergeyLukyanenko, 1998);
        Book generationP = new Book("Generation П", viktorPelevin, 1990);
        generationP.setYear(1995);
        System.out.println("generationP.getYear() = " + generationP.getYear());
    }
}