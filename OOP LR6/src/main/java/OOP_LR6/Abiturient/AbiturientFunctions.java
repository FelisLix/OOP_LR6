package OOP_LR6.Abiturient;

import OOP_LR6.IO;

import java.util.Scanner;

public class AbiturientFunctions {
    private Scanner scanner;
    private final Abiturient abiturient = new Abiturient();
    private final IO io = new IO();
    private final Filter filter = new Filter();

    public void printAbiturientsName(Abiturient[] abiturients){
        scanner = new Scanner(System.in);
        System.out.println("Ім’я: ");
        String name = scanner.nextLine();
        abiturient.printAbiturients(filter.AbiturientsName(abiturients, name));
    }

    public void printAbiturientsMarkHigherThen(Abiturient[] abiturients){
        scanner = new Scanner(System.in);
        System.out.println("Середній бал: ");
        int mark = scanner.nextInt();
        abiturient.printAbiturients(filter.AbiturientsMarkHigherThen(abiturients, mark));
    }

    public void printAbiturientsWithHigherMark(Abiturient[] abiturients) {
        scanner = new Scanner(System.in);
        System.out.println("Число n абітурієнтів:");
        int n = scanner.nextInt();
        abiturient.printAbiturients(filter.AbiturientsWithHigherMark(abiturients, n));

    }

    public void writeObjectsInFile(Abiturient[] abiturients) {
        io.writeObjects(abiturients);
        System.out.println("Записано!");
    }

    public Abiturient[] addNewAbiturient(Abiturient[] abiturients){
        scanner = new Scanner(System.in);

        System.out.println("ID: ");
        int ID = scanner.nextInt();

        System.out.println("Прізвище: ");
        String surname = scanner.nextLine();

        System.out.println("Ім'я: ");
        String name = scanner.nextLine();

        System.out.println("По батькові: ");
        String fName = scanner.nextLine();

        System.out.println("Адреса: ");
        String address = scanner.nextLine();

        System.out.println("Телефон: ");
        int phone = scanner.nextInt();

        System.out.println("Середній бал: ");
        double mark = scanner.nextDouble();

        System.out.println("Записано!");
        return abiturient.addNew(abiturients, new Abiturient(ID, surname, name, fName, address, phone, mark));
    }

    public Abiturient[] deleteAbiturient(Abiturient[] abiturients){
        System.out.println("ID:");
        int index = scanner.nextInt();
        System.out.println("Видалено!");
        return abiturient.delete(abiturients, index);
    }


}
