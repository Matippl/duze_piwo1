package pl.edu.nauka;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static java.util.Optional.ofNullable;

public class KartotekaDb implements Kartoteka {
    @Override
    public void dodajUcznia(Uczen uczen) {
        try {
            var ps = ConnectionDb.getConnection().prepareStatement(
                    "INSERT INTO Uczen(imie,nazwisko,pesel,dataUrodzenia) values(?,?,?,?)"
            );
            ps.setString(1, uczen.getImie());
            ps.setString(2, uczen.getNazwisko());
            ps.setString(3, uczen.getPesel());
            ps.setDate(4, ofNullable(uczen.getDataUrodzeia()).map(Date::valueOf).orElse(null));

            var result = ps.executeUpdate();
            System.out.println("Dodano" + result + "rekordow");


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Uczen wyszukajUcznia(String imie, String nazwisko) {
        return null;
    }

    @Override
    public Uczen wyszukajUcznia(Long id) {
        return null;
    }

    @Override
    public void zmienDane(Uczen uczen) {

    }

    @Override
    public void usunUcznia(String imie, String nazwisko) {

    }

    @Override
    public List<Uczen> getUczniowie() {

        List<Uczen> uczniowie = new ArrayList<>();

        try {
            var ps = ConnectionDb.getConnection().prepareStatement(
                    "SELECT * FROM Uczen"

            );
            var rs = ps.executeQuery();
            while (rs.next()) {
                var uczen = new Uczen(
                        rs.getLong("id"),
                        rs.getString("imie"),
                        rs.getString("nazwisko"),
                        rs.getString("pesel"),
                        ofNullable(rs.getDate("dataUrodzenia")).map(Date::toLocalDate).orElse(null)
                );
                uczniowie.add(uczen);
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return uczniowie;
    }


}
