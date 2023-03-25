package OOP_LR6.Abiturient;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Abiturient implements Serializable {
    private int ID;
    private String Surname;
    private String Name;
    private String FName;
    private String Address;
    private int Phone;
    private double Mark;

    @Override
    public String toString() {
        return " id: " + ID +
                " || ПІБ: " + Surname +
                " " + Name +
                " " + FName +
                " || Адреса: " + Address +
                " || Телефон: " + Phone +
                " || Середній бал: " + Mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Abiturient that)) return false;
        return ID == that.getID() &&
                Phone == that.getPhone() &&
                Double.compare(that.getMark(), Mark) == 0 &&
                Objects.equals(Surname, that.getSurname()) &&
                Objects.equals(Name, that.getName()) &&
                Objects.equals(FName, that.getFName()) &&
                Objects.equals(Address, that.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, Surname, Name, FName, Address, Phone, Mark);
    }

    public void printAbiturients(Abiturient[] abiturients) {
        for (Abiturient abiturient : abiturients) {
            if (abiturient == null) break;
            System.out.println(abiturient);
        }
    }

    public Abiturient[] addNew(Abiturient[] abiturients, Abiturient newAbiturient) {
        Abiturient[] abs = new Abiturient[abiturients.length + 1];
        System.arraycopy(abiturients, 0, abs, 0, abiturients.length);
        abs[abiturients.length] = newAbiturient;
        return abs;
    }

    public Abiturient[] delete(Abiturient[] abiturients, int id) {
        Abiturient[] abs = new Abiturient[abiturients.length - 1];
        for (int i = 0, k = 0; i < abiturients.length; i++) {
            if (abiturients[i].getID() != id) {
                abs[k]= abiturients[i];
                k++;
            }
        }
        return Arrays.copyOf(abs, abs.length);
    }
}


