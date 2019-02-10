package work.utils;

import work.model.BaseEmployee;

import java.io.*;
import java.util.*;

public class Serializator implements Serializable {

    public static  void work(Collection collection,File filename) {
        if (!filename.getName().endsWith(".data")) throw new IllegalArgumentException();
        else {
            try {
                writeSet(collection, filename);
                readSet(filename);
            }catch (ClassNotFoundException cnfe){
                System.out.println("Error while deserializing");
            }
        }
    }

    private static void readSet(File filename) throws ClassNotFoundException {
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(filename))) {
            Set<? extends BaseEmployee> emp = (Set<? extends BaseEmployee>) is.readObject();
            //sout first five employees
            emp.stream().limit(5).forEach(System.out::println);
            //sout last 3 employees
            emp.stream().skip(emp.size() - 3).forEach(e -> System.out.println((e).getInfo().getID()));
        } catch (IOException ioe) {
            System.out.println("Error while file reading");
        }
    }

    private static void writeSet(Collection collection, File filename) {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(filename))) {
            //creating set
            NavigableSet<Object> database = new TreeSet<>().descendingSet();
            database.addAll(collection);
            os.writeObject(database);
            os.flush();
        } catch (IOException ioe) {
            System.out.println("Error while writting file");
        }
    }

}
