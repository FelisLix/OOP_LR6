package OOP_LR6.Abiturient;

import java.util.*;

public class Filter {
        public Abiturient[] AbiturientsName(Abiturient[] abiturients, String name){
            Arrays.sort(abiturients, Comparator.comparingDouble(Abiturient::getMark).reversed());
            Abiturient[] abs = new Abiturient[abiturients.length];
            int i = 0;
            for (Abiturient abiturient : abiturients) {
                if (abiturient.getName().equals(name)){
                    abs[i] = abiturient;
                    i++;
                }
            }

            return abs;
        }

        public  Abiturient[] AbiturientsMarkHigherThen( Abiturient[] abiturients, double mark){
            Abiturient[] abs = new Abiturient[abiturients.length];
            int i = 0;
            for (Abiturient abiturient : abiturients) {
                if (abiturient.getMark() > mark){
                    abs[i] = abiturient;
                    i++;
                }
            }
            return abs;
        }

        public Abiturient[] AbiturientsWithHigherMark(Abiturient[] abiturients, int n){
            Arrays.sort(abiturients, Comparator.comparingDouble(Abiturient::getMark).reversed());
            Abiturient[] abs = new Abiturient[n];
            System.arraycopy(abiturients, 0, abs, 0, n);
            return abs;
        }

        public Abiturient[] printAlphabetOrder(Abiturient[] abiturients){
            Arrays.sort(abiturients, Comparator.comparing(Abiturient::getSurname).thenComparing(Abiturient::getName));
            return abiturients;
        }
    }

