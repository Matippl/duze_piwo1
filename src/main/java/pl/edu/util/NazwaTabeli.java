package pl.edu.util;

public class NazwaTabeli {
    public static String nazwa(Object obj){
        if(obj==null)
            return null;
        Table table = obj.getClass().getAnnotation(Table.class);
        if(table==null)
            return null;
        return table.name();
    }
}
