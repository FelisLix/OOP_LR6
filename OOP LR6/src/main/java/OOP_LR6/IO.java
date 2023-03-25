package OOP_LR6;

import OOP_LR6.Abiturient.Abiturient;

import java.io.*;

public class IO {

    public Abiturient[] readObjects(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abiturients.dat"))){
            return (Abiturient[]) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeObjects(Abiturient[] abiturients){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abiturients.dat"))) {
            oos.writeObject(abiturients);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
