package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1.uzdevums

        int x = 7;
        System.out.println(x > 0);//true
        System.out.println(x < 0);//false
        System.out.println(x > 5 && x <= 10);//true
        System.out.println(!(x <= 5 && x < 10));//true
        System.out.println(x == 0 && x == 10);//false
        System.out.println(x * x > 10);//true

        System.out.println();

        //2.uzdevums

        //int mēnesis = x (Ievadit mēnešu cipars no 1-12)


        int mēnesis = 8;
        String mēnešaNosaukums;

        switch (mēnesis) {
            case 1:
                mēnešaNosaukums = "Janvāris";
                break;
            case 2:
                mēnešaNosaukums = "Februāris";
                break;
            case 3:
                mēnešaNosaukums = "Marts";
                break;
            case 4:
                mēnešaNosaukums = "Aprīlis";
                break;
            case 5:
                mēnešaNosaukums = "Maijs";
                break;
            case 6:
                mēnešaNosaukums = "Jūnijs";
                break;
            case 7:
                mēnešaNosaukums = "Jūlijs";
                break;
            case 8:
                mēnešaNosaukums = "Augusts";
                break;
            case 9:
                mēnešaNosaukums = "Septembris";
                break;
            case 10:
                mēnešaNosaukums = "Oktobris";
                break;
            case 11:
                mēnešaNosaukums = "Novembris";
                break;
            case 12:
                mēnešaNosaukums = "Decembris";
                break;
            default:
                mēnešaNosaukums = "Nezināma diena";
        }

        System.out.println(mēnešaNosaukums);


        //3.uzdevums

        System.out.println("Ievadi pirmo skaitli ");
        int a = scanner.nextInt();
        System.out.println("Ievadi otro skaitli");
        int b = scanner.nextInt();
        System.out.println("Ievadi trešo skaitli");
        int c = scanner.nextInt();
        if ((a > b) && (a > c)) {
            System.out.println(a + " ir lielākais skatlis");
        } else if ((b > a) && (b > c)) {
            System.out.println(b + " ir lielākais skatlis");
        } else if ((c > a) && (c > b)) {
            System.out.println(c + " ir lielākais skatlis");
        }

        //4.uzdevums

        String color = "zaļā";
        System.out.println("Tagad pie luksofora deg " + color + " krāsa un tas nozīmē:");
        if (color.equals("zaļā")) {
            System.out.println("Var iet");
        } else if (color.equals("dzeltenā")) {
            System.out.println("Nevar iet, jāgaida zaļā krāsa");
        } else if (color.equals("sarkanā")) {
            System.out.println(" STOP - Nevar iet");
        } else if (color.equals("Luksafors nedarbojas"));



        //5.uzdevums


         public static void printBusinessCard( ) {
            System.out.println("Vizītkarte");
            System.out.println("******************");
            System.out.println("Vārds: Vladimirs");
            System.out.println("Uzvārds: Caplinskis");
            System.out.println("Telefona numurs: +371 #########");
            System.out.println("Dzimšanas gads: 19##");
            System.out.println("******************");
            System.out.println("Vizītkarte");
            System.out.println("******************");
            System.out.println("Vārds: Vladimirs");
            System.out.println("Uzvārds: Caplinskis");
            System.out.println("Telefona numurs: +371 #########");
            System.out.println("Dzimšanas gads: 19##");
            System.out.println("******************");
            System.out.println("Vizītkarte");
            System.out.println("******************");
            System.out.println("Vārds: Vladimirs");
            System.out.println("Uzvārds: Caplinskis");
            System.out.println("Telefona numurs: +371 #########");
            System.out.println("Dzimšanas gads: 19##");
            System.out.println("******************");

            //6.uzdevums
            public static void printBusinessCardTwo(String name, String surname, int telephone, int dateOfBirth){
                System.out.println("Vizītkarte" + "\n"  + "Vārds: " + name + "\n" + "Uzvārds: " + surname + "\n" +
                        "Telefona numurs: +371" + telephone + "\n" + "Dzimšanas gads: " + dateOfBirth + "\n");


                //7.uzdevums
                int sum = sumOfTwoNumbers (6, 8);
                System.out.println(sum);


























    }



 }

    private static void sumOfTwoNumbers() {
    }