import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //T: WYSWIETLANIE DANYCH
        System.out.println("Ala ma kota");
        System.out.println("Kot ma Alę");

        System.out.print("Ala ma kota\n");
        System.out.print("Kot ma Alę\n");

        //T: ZMIENNE
        //1. liczby calkowite
        int zmienna1 = 45;
        short zmienna2 = 23;
        long zmienna3 = 12;
        byte zmienna4 = 34;

        //2. liczby z przecinkiem
        double zmiennaP1 = 3.14;
        float zmiennaP2 = 23.45F;

        // 3. inne
        String tekst = "Ala ma kota";
        boolean czyLeciZNamiPilot = true;
        char literka = 'a';

        System.out.println("Zawartosc zmiennej zmienna1: " + zmienna1);
        System.out.println("Zawartosc zmiennej zmiennaP2: " + zmiennaP2);
        System.out.println("Zawartosc zmiennej czyLeciZNamiPilot: " + czyLeciZNamiPilot);

        //T: OPERACJE MATEMATYCZNE cz1- podstawy
        int liczba1 = 5;
        int liczba2 = 3;

        int suma = liczba1 + liczba2;
        int roznica = liczba1 - liczba2;
        int iloczyn = liczba1 * liczba2;
        double iloraz = (double) liczba1 / liczba2;
        int modulo = liczba1 % liczba2;

        System.out.println(suma);
        System.out.println(roznica);
        System.out.println(iloczyn);
        System.out.println(iloraz);
        System.out.println(modulo);

        //T: OPERACJE MATEMATYCZNE cz2 - jak zmodyfikowac zmienna
        int liczba3 = 10;

        liczba3 = liczba3 + 2;
        liczba3 = liczba3 - 2;
        liczba3 = liczba3 * 2;
        liczba3 = liczba3 / 2;

        liczba3 += 2;
        liczba3 -= 2;
        liczba3 *= 2;
        liczba3 /= 2;

        //T: OPERACJE MATEMATYCZNE cz3 - inkrementacja i dekrementacja
        liczba3 = liczba3 + 1;
        liczba3 += 1;
        liczba3++;

        liczba3 = liczba3 - 1;
        liczba3 -= 1;
        liczba3--;

        //T: KONWERSJA TYPÓW
        //Rzutowanie niejawne
        int number1 = 4;
        double number2 = number1;

        //Rzutowanie jawne
        double number3 = 3.14;
        int number4 = (int) number3;

        //Parsowanie - konwersja tekstu
        String tekst1 = "23";
        int number5 = Integer.parseInt(tekst1);
        String tekst2 = "2.73";
        double number6 = Double.parseDouble(tekst2);

        //Konwersja na String
        String tekst3 = "" + number5;
        String tekst4 = "" + number6;

        //T: POBIERANIE DANYCH Z KONSOLI
        Scanner skaner = new Scanner(System.in);
//        System.out.print("Podaj swoje Miasto: ");
//        String miasto = skaner.nextLine();
//
//        System.out.print("Podaj swój wiek: ");
//        int wiek = Integer.parseInt(skaner.nextLine());
//
//        System.out.println("Twoje miasto: " + miasto);
//        System.out.println("Twoj wiek: " + wiek);

        //T: LOSOWANIE LICZB
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(100)); //0-99
        System.out.println(random.nextInt()); //
        System.out.println(random.nextInt());
        // System.out.println( (char)random.nextInt(origin: 65, 91));

        // T: FUNKCJE / METODY
        //1. nic nie zwraca i nic nie przyjmuje           System.out.println();
        //2. nic nie zwraca ale cos przyjmuje             System.out.println("Kot ma Alę")
        //3. cos zwraca i nic nie przyjmuje               skaner.nextLine()
        //4. cos zwraca i cos przyjmuje                   random.nextDouble(100)

        double wynik = iloczynDwochLiczb(2.5, 3);
        System.out.println(wynik);
        System.out.println(iloczynDwochLiczb(4, 7));

        pokazHelloWorld();
        pokazHelloWorld();
        pokazHelloWorld();

        //T: INSTRUKCJE WARUNKOWE IF
        //operacje porownania
        // == - rowne
        // != - rozne
        // > - wieksze
        // < - mniejsze
        // >= - wieksze lub rowne
        // <= - mniejsze lub rowne
//        System.out.print("Podaj liczbe: ");
//        int num = Integer.parseInt(skaner.nextLine());
//
//        if(num == 10){
//            System.out.println("Liczba wynosi 10");
//        }
//        else if (num > 10){
//            System.out.println("Liczba jest wieksza od 10");
//        }
//        else {
//            System.out.println("Liczba jest mniejsza niz 10");
//        }

        //operacje logiczne
        // && - AND
        // || - OR
        // ! - NEGACJA

        //czy liczba jest z zakresu 5-10
//        if(num >= 5 && num <= 10){
//            System.out.println("Ta liczba jest z tego zakresu V");
//        }else{
//            System.out.println("Ta liczba NIE JEST z tego zakresu X");
//        }
//
//        //czy liczba jest poza zakresem 15-20
//        if(num < 15 || num > 20){
//            System.out.println("Liczba jest poza zakresem V");
//        }else{
//            System.out.println("Liczba jest w zakresie X");
//        }

        //T: PETLA FOR
        //powtorzyc jakas czynnosc jakas ilosc razy np. 10 razy
        //Chcemy zmieniac liczbe w jakims zakresie (np. 5-10)

//        for(int i = 0; i < 10; i++){
//            System.out.print( "a ");
//        }
//        System.out.println();
//        for(int i = 5; i <= 10; i++){
//            System.out.print( i + " ");
//        }

        //T: PETLA WHILE
        //nie wiemy ile razy cos chcemy wykonac
        // wykonujemy tak dlugo az waruniek nie zostanie spelniony
        //warunek sprawdzamy na poczatku
//
//        System.out.print("Podaj liczbe z zakresu 5-10: ");
//        int liczba = Integer.parseInt( skaner.nextLine());
//
//        while(liczba < 5 || liczba > 10){
//            System.out.println("Podaj liczbe z zakresu 5-10: ");
//            liczba = Integer.parseInt( skaner.nextLine());
//        }
//        System.out.println("Podano: " + liczba);


        //T: PETLA DO...WHILE
        //warunek sprawdzamy na koncu
        //wykona sie min. raz
//
//        int liczba22 = 5;
//        do{
//            System.out.print("Podaj liczbe z zakresu 5-10: ");
//            liczba = Integer.parseInt( skaner.nextLine());
//        }while(liczba22 < 5 || liczba22 > 10);
//        System.out.println("Podano: " + liczba22);

        //T: TABLICE JEDNOWYMIAROWE
        //tworzenie
        int tablica1[] = new int[5]; // tablica z indexami: 0 1 2 3 4
        int tablica2[] = new int[]{23, 45, 67, 12, 9};
        int tablica3[] = {23, 45, 67, 12, 9};

        //zapis do tablicy
        tablica1[0] = 15;
        tablica1[1] = 4;
        //[...]
        tablica1[4] = 30;

        // odczyt z tablicy
        for (int i = 0; i < tablica1.length; i++) {
            System.out.println(tablica1[i]);
        }

        //T: TABLICE WIELOWYMIAROWE
        int tablica4[][] = new int[3][4]; // 3 wiersze, 4 kolumny
        System.out.println(tablica4.length);
        System.out.println(tablica4[0].length);

        for (int i = 0; i < tablica4.length; i++) {             // obsluguje wiersze
            for (int j = 0; j < tablica4[i].length; j++) {      // obsluugje kolumny
                tablica4[i][j] = random.nextInt(100);
                System.out.print(tablica4[i][j] + "\t");      // \t = tabulator
            }
            System.out.println(tablica4);
        }

        //T: LISTY
        //tworzenie
        ArrayList<String> imiona = new ArrayList<String>();

        //dodawanie elementow
        imiona.add("Basia");    // index 0
        imiona.add("Kasia");    // index 1
        imiona.add("Asia");     // index 2
        imiona.add("Kasia");    // index 3

        //wyswietlanie
        for (int i = 0; i < imiona.size(); i++) {
            System.out.println(imiona.get(i));
        }

        //usuwanie
//        imiona.remove(1);
        imiona.remove("Kasia");

        for (int i = 0; i < imiona.size(); i++) {
            System.out.println(imiona.get(i));
        }

        //T: KLASY
        //szablony definiujacy obiekt
        //pola - definiuja cechy tych obiektow
        //metody - definiuja zachowanie tych obiektow


        Osoba osoba1 = new Osoba("Janek", "Kowalski", 12);
        System.out.println(osoba1.getImie());
        System.out.println(osoba1.getNazwisko());
        System.out.println(osoba1.getWiek());

        osoba1.przedstawSie();


        Osoba osoba2 = new Osoba("Marian", "Nowak");

        osoba2.przedstawSie();

        Osoba osoba3 = new Osoba(osoba2);

        osoba3.przedstawSie();

        //T: DZIEDZICZENIE --- 07.06.2022
        //klasa bzaowa
        //klasa pochodna
        Uczen uczen1 = new Uczen("Jan", "Kowalski", 14, 5, "8c");
        uczen1.przedstawSie();

        Osoba uczen2 = new Uczen("Tomasz", "Lis", 16, 4, "2A");
        uczen2.przedstawSie();

        Osoba uczen3 = new Uczen("Mariusz", "Pomidor", 12, 2, "6G");
        uczen3.przedstawSie();


        //T: ZAPIS DO PLIKU --- 07.06.2022
        String doPliku = "Teraz wczytuje ze zmiennej jak to widzisz to jestes super";
        File file = new File("test.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(doPliku + "I teraz jest mieszane ze zmiennej i z komendy");
        fileWriter.close();

        //Zadanie 1. Zapisz do pliku (po enterze) liczby od 0 do 99 (pętla for). Nazwij plik „liczbyInt1.txt”.
        /*
        Zadanie 2. Zapisz do pliku (po enterze) 20 losowych liczb zmiennoprzecinkowych (pętla for) z zakresu 10-20. Nazwij plik „liczbyDouble1.txt”.
Zadanie 3. Zapisz do pliku (po enterze) 5 imion. Nazwij plik „listaImion1.txt”
Zadanie 4. Zapisz do pliku (po średniku) liczby od 100 do 199 (pętla for). Nazwij plik „liczbyInt2.txt
Zadanie 5. Zapisz do pliku (po średniku) 20 losowych liczb zmiennoprzecinkowych (pętla for) z zakresu 20-30. Nazwij plik „liczbyDouble2.txt”
Zadanie 6. Zapisz do pliku (po średniku) 5 imion. Nazwij plik „listaImion2.txt”
Zadanie 7. Zapisz do pliku (po sredniku) 10 wierszy losowych liczb całkowitych z zakresu 200-299. W każdym wierszu powinno być 5 liczb (2xpętla for). Nazwij plik „liczbyInt3.txt”.
Zadanie 8. Zapisz do pliku 5 wierszy losowych liczb całkowitych z zakresu 30-40. W każdym wierszu powinno być 10 liczb (2xpętla for). Nazwij plik „liczbyDouble3.txt”.
         */
        File file1 = new File("liczbyInt1.txt");
        FileWriter fileWriter1 = new FileWriter(file1);
        for (int i = 0; i < 100; i++) {
            fileWriter1.write(i + "\n");
        }
        fileWriter1.close();


        // zad. 2

        File file2 = new File("liczbyDoubleLosowe.txt");
        FileWriter fileWriter2 = new FileWriter(file2);

        for (int i = 0; i < 21; i++) {
            Random random2 = new Random();
            double losowa = random2.nextDouble() * 10 + 10;

            fileWriter2.write(losowa + "\n");
        }
        fileWriter2.close();

        // zad.3
        File file3 = new File("listaImion1.txt");
        FileWriter fileWriter3 = new FileWriter(file3);
        fileWriter3.write("Antek \n");
        fileWriter3.write("Szymek \n");
        fileWriter3.write("Maciek \n");
        fileWriter3.write("Filip \n");
        fileWriter3.write("Marcel");
        fileWriter3.close();

        //zad.4
        File file4 = new File("liczbyInt2.txt");
        FileWriter fileWriter4 = new FileWriter(file4);
        for (int i = 100; i < 200; i++) {
            fileWriter4.write(i + ";");
        }
        fileWriter4.close();

        //zad.5

        File file5 = new File("liczbyDoubleLosowe2.txt");
        FileWriter fileWriter5 = new FileWriter(file5);

        for (int i = 0; i < 21; i++) {
            Random random2 = new Random();
            double losowa2 = random2.nextDouble() * 20 + 10;

            fileWriter5.write(losowa2 + ";");
        }
        fileWriter5.close();

        //zad.6
        File file6 = new File("listaImion2.txt");
        FileWriter fileWriter6 = new FileWriter(file6);
        fileWriter6.write("Antek;Szymek;Maciek;Filip;Marcel");
        fileWriter6.close();

        //zad.7
        File file7 = new File("liczbyInt3.txt");
        FileWriter fileWriter7 = new FileWriter(file7);

        Random random3 = new Random();
        int tablica5[][] = new int[10][5];
        for (int i = 0; i < 11; i++) {          //obluga wierszy
            for(int j = 0; j < 6; j++){         //obsluga kolumn
                fileWriter7.write(random3.nextInt(200,299) + ";");
            }
            fileWriter7.write("\n");
        }
        fileWriter7.close();

        //zad.8
        File file8 = new File("liczbyDouble3.txt");
        FileWriter fileWriter8 = new FileWriter(file8);

        Random random4 = new Random();
        int tablica6[][] = new int[5][10];
        for (int i = 0; i < 5; i++) {          //obluga wierszy
            for(int j = 0; j < 10; j++){         //obsluga kolumn
                fileWriter8.write(random4.nextDouble(30.00,40.00) + ";");
            }
            fileWriter8.write("\n");
        }
        fileWriter8.close();
        {

        }



        //ODCZYT Z PLIKU - 21.06.2022
        File fileOdczyt = new File("TEST.txt")
    }

    static double iloczynDwochLiczb(double liczba1, double liczba2) {
        return liczba1 * liczba2;
    }

    static void pokazHelloWorld() {
        System.out.println("Hello world!");
    }
}
