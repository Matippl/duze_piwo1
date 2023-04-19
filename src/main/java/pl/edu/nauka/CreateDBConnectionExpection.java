package pl.edu.nauka;

public class CreateDBConnectionExpection extends RuntimeException{
    public CreateDBConnectionExpection( Throwable cause) {
        super("Nie udalo sie nawiazac polaczenia z baza danych", cause);
    }
}
