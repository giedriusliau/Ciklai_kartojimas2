public class Main {
    public static void main(String[] args) {

        System.out.println("--- 1 uzd ---");
        // Sukurkite ciklą kuris atspausdintų 10 kartų žodį “labas”.
        for (int i = 0; i < 9; i++) {
            System.out.println("labas");
        }

        System.out.println("--- 2 uzd ---");
        // Sukurkite ciklą kuris atspausdintų skaičius nuo 0 iki 9.”.
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("--- 3 uzd ---");
        // Sukurkite ciklą kuris atspausdintų skaičius nuo 0 iki 9.”.
        for (int i = 0; i < 5; i++) {
            if(i == 2){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("--- 4 uzd ---");
        for (int i = 0; i < 5; i++) {
            if(i == 3){
                break;
            }
            System.out.println(i);
        }
    }
}