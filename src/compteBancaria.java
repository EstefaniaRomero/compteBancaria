import java.util.Scanner;

public class compteBancaria {
    /*Compte bancaria:

L’usuari té una compte bancaria amb un saldo inicial de 1.000€. Al iniciar el software,
l’usuari pot retirar o ingresar diners.

El saldo a ingresar no pot ser mai el doble del saldo actual en el banc, és a dir,
si té 1.000€, no es poden ingressar més de 2.000€. Al fer un ingrés,
s’aplica un 5% de comissió sobre la quantitat a ingressar.

Mai es pot retirar més diners que els que hi ha al banc.

El software es finalitza si l’usuari escull no fer més operacions.*/

    private static double balanceUser = 1000;
    private static final int REMOVE = 1;
    private static final int ENTRY = 2;
    private static final int ESCAPE = 3;

    public static void main(String[] args) {

        int option = askToUser();
        int balance = askMoney(option);
        calculateBalance (balance);
        altreOperacio();
        removeMoney (option);

    }

    private static boolean altreOperacio() {
        System.out.println("Vols fer una altre operació? S/N");
        Scanner sc = new Scanner(System.in);
        String text=sc.nextLine();
        return text.equalsIgnoreCase("S");
    }

    private static void removeMoney(int option) {
        System.out.println("Quants diners vols retirar?: ");
        Scanner sc = new Scanner(System.in);
        int optionRemove = sc.nextInt();

    }

    private static void calculateBalance(int balance) {

        while (true) {
            if (balance <= (balanceUser * 2)) {

                balanceUser = balanceUser + balance - (balance * 0.05);
                System.out.println("El teu saldo actual es: " + balanceUser);


            } else System.out.println("No pots ingressar més del doble del teu saldo ");

        }
        

    }

    private static int askMoney(int option) {

        int money = 0;
        if (option == ENTRY) {
            System.out.println("Quants diners vols ingressar? ");
            Scanner sc = new Scanner(System.in);
            money = sc.nextInt();
        }
        return money;
    }
    private static int askToUser() {
        System.out.println("Què vols fer? Retirar (1) o Ingresar (2) o Sortir (3):");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
    return option;
    }




}


