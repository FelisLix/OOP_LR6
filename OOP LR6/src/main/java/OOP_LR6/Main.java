package OOP_LR6;

import OOP_LR6.Abiturient.Abiturient;
import OOP_LR6.Abiturient.AbiturientFunctions;
import OOP_LR6.Abiturient.Filter;

import java.util.Scanner;

public class Main {
    private Scanner scanner;

    public static void main(String[] args) {
        new Main().run();

    }

    private void run() {
        scanner = new Scanner(System.in);
        Filter filter = new Filter();
        IO io = new IO();
        Abiturient abiturient = new Abiturient();
        AbiturientFunctions functions = new AbiturientFunctions();


        Abiturient[] abiturients = createAbiturientArray();
        int o;
        while ((o = menu()) != 0){
            switch (o){
                case 1 -> abiturient.printAbiturients(abiturients);
                case 2 -> abiturients = functions.addNewAbiturient(abiturients);
                case 3 -> abiturients = functions.deleteAbiturient(abiturients);
                case 4 -> functions.printAbiturientsName(abiturients);
                case 5 -> functions.printAbiturientsMarkHigherThen(abiturients);
                case 6 -> functions.printAbiturientsWithHigherMark(abiturients);
                case 7 -> abiturient.printAbiturients(filter.printAlphabetOrder(abiturients));
                case 8 -> functions.writeObjectsInFile(abiturients);
                case 9 -> abiturient.printAbiturients(io.readObjects());
            }
        }
    }

    public Abiturient[] createAbiturientArray(){
        return new Abiturient[]{
                new Abiturient(1, "Брик", "Йосип", "Яромирович", "680 AMSTERDAM AVE",14567842, 11.5),
                new Abiturient(2,"Зноба","Йосип","Денисович","560 BLAKE AVE",97634521, 8.4),
                new Abiturient(3,"Гужва","Іоанн","Захарович","101 CLAY ST",24397164, 6.7),
                new Abiturient(4,"Білинський","Царук","Радимович","17 LAKE RD",73649820, 4.9),
                new Abiturient(5,"Кабаненко","Есфір","Пилипович","122 HILLSIDE AVE",55314608, 12.0)
        };
    }

    public int menu(){
        System.out.println("""
                1. Показати список абітурієнтів;
                2. Додати нового абітурієнта;
                3. Видалити абітурієнта;
                4. Список абітурієнтів із вказаним іменем, в порядку спадання середнього балу;
                5. Список абітурієнтів, середній бал у яких вище заданого;
                6. Вибрати задане число n абітурієнтів, що мають найвищий середній бал.
                7. Список абітурієнтів в порядку алфавіту за прізвищем, при збігу прізвищ – за іменами;
                8. Записати список у файл;
                9. Показати список у файлі;
                0. Exit
                """);
        int res = scanner.nextInt();
        scanner.nextLine();
        return res;
    }
}