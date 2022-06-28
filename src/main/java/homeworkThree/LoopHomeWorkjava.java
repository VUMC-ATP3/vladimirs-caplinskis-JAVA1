package homeworkThree;

public class LoopHomeWorkjava {


    public static void main(String[] args) {

        // 1. uzdevums
        int sum = 0;
        Scanner nr = new Scanner(System.in);
        int number;

        System.out.println("\n1. uzdevums: Skaitļu summa");
        while(sum <= 100){
            System.out.println("Enter number: ");
            number = nr.nextInt();
            sum = sum + number;
            //System.out.println("Current sum is: " + sum);
        }
        System.out.println(sum);
        System.out.println("Gatavs");

        // 2. uzdevums
        boolean isPrime = true;
        Scanner scan = new Scanner(System.in);
        System.out.println(" Pirmsskaitlis");
        System.out.println("Enter number: ");
        int num = scan.nextInt();
        int i = 2;
        while (i <= num/2){
            if (num % i == 0){
                isPrime = false;
                break;
            }
            i++;
        }
        if(isPrime)
            System.out.println(num + " is a Prime number");
        else
            System.out.println(num + " is not a Prime number");

        //3.uzdevums
        int[] intMasivs = {4, 9, 46, 45, 787, 66, 75, 14, 4, 7};
        String[] stringMasivs = {"Aigars", "Adala", "Brendon", "Jadviga", "Santa", "Edgars"};
        char[] charMasivs = {'A', 'S', 'D', 'F', 'G', 'H'};

        //While metode
        System.out.println("Izmantojot while metodi, izdrukā Int masīvu.");
        int pecKartas = 0;
        while (pecKartas < intMasivs.length) {
            System.out.print(" , " + intMasivs[pecKartas]);
            pecKartas++;
        }
        System.out.println();

        System.out.println("Izmantojot while metodi, izdrukā String masīvu.");
        int a = 0;
        while (a < stringMasivs.length) {
            System.out.print(stringMasivs[a] + " , ");
            a++;
        }
        System.out.println();

        System.out.println("Izmantojot while metodi, izdrukā Char masīvu.");
        int b = 0;
        while (b < charMasivs.length) {
            System.out.print(charMasivs[b] + " , ");
            b++;
        }
        System.out.println();

        //do while metode
        System.out.println("Izmantojot do while metodi, izdrukā Int masīvu.");
        int c = 0;
        do {
            System.out.print(intMasivs[c] + " , ");
            c++;
        } while (c < intMasivs.length);
        System.out.println();

        System.out.println("Izmantojot do while metodi, izdrukā Strin masīvu.");
        int d = 0;
        do {
            System.out.print(stringMasivs[d] + " , ");
            d++;
        } while (d < stringMasivs.length);
        System.out.println();

        System.out.println("Izmantojot do while metodi, izdrukā Char masīvu.");
        int e = 0;
        do {
            System.out.print(charMasivs[e] + " , ");
            e++;
        } while (e < charMasivs.length);
        System.out.println();

        //for loop metode
        System.out.println("Izmantojot for loop metodi, izdrukā Int masīvu.");
        for (int i = 0; i < intMasivs.length; i++) {
            System.out.print(intMasivs[i] + " , ");
        }
        System.out.println();

        System.out.println("Izmantojot for loop metodi, izdrukā String masīvu.");
        for (int i = 0; i < stringMasivs.length; i++) {
            System.out.print(stringMasivs[i] + " , ");
        }
        System.out.println();

        System.out.println("Izmantojot for loop metodi, izdrukā char masīvu.");
        for (int i = 0; i < charMasivs.length; i++) {
            System.out.print(charMasivs[i] + " , ");
        }
        System.out.println();

        //for each metode
        System.out.println("Izmantojot for each metodi, izdrukā Int masīvu.");
        for (int izprinte : intMasivs
        ) {
            System.out.print(izprinte + " , ");
        }
        System.out.println();

        System.out.println("Izmantojot for each metodi, izdrukā String masīvu.");
        for (String izprinte : stringMasivs
        ) {
            System.out.print(izprinte + " , ");
        }
        System.out.println();

        System.out.println("Izmantojot for each metodi, izdrukā char masīvu.");
        for (char izprinte : charMasivs
        ) {
            System.out.print(izprinte + " , ");
        }
        System.out.println();

        //4.uzdevums

        int[] simtnieks = new int[100];
        int f = 2;
        for (int i = 0; i < simtnieks.length; i++) {
            simtnieks[i] = f;
            f = f + 2;
            System.out.print(simtnieks[i] + " , ");

            //5. uzdevums

            public static int faktorialaVertiba (int skaitlis){
                int faktorials = 1;
                for (int i = 1; i < skaitlis; i++) {
                    faktorials = faktorials * i;
                }
                return faktorials;
            }
            //5. uzdevums

            public static int faktorialaVertiba (int skaitlis){
                int faktorials = 1;
                for (int i = 1; i < skaitlis; i++) {
                    faktorials = faktorials * i;
                }
                return faktorials;
            }

            //6.uzdevums
            public static void ievadiPin (){
                Scanner scaner= new Scanner(System.in);
                int pareizsPin= 1234;
                int meginajums= 0;
                while (meginajums<3) {
                    System.out.println("Lūdzu ievadiet Pin kodu");
                    int ievaditais = scaner.nextInt();
                    if (pareizsPin == ievaditais) {
                        System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ");
                        break;
                    } else if (pareizsPin != ievaditais) {
                        System.out.println("Nepareizs PIN, mēģiniet vēlreiz.");
                        meginajums++;
                    } else {
                        System.out.println("Atvainojiet, bet jūs esat bloķēts!");
                    }



                }


    }





    }
}
