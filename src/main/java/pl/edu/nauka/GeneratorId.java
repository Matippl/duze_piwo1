package pl.edu.nauka;

import java.util.List;

public class GeneratorId {
    private GeneratorId() {
    }

    public static Long generuj(List<Uczen> uczniowie){
        var id = 0L;
        for(int i =0; i<uczniowie.size();i++){
            var uczen = uczniowie.get(i);
            if(uczen.getId()>id){
                id = uczen.getId();
            }
        }
        return ++id;
    }

}
