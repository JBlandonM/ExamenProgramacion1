import java.util.Scanner;

public class ExceriseOneJonathanBlandon {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        System.out.print("\nPrecio Total a Pagar: ");
        int totalxPagar = read.nextInt();
        System.out.print("Cancela con: ");
        int montoPagado = read.nextInt();
        int montoVuelto = montoPagado - totalxPagar;
        System.out.println("\nSu Cambio es: " + montoVuelto + " Colones, De La Siguiente Manera:\n");

        montoVuelto = montoPagado - totalxPagar;
        int vectorBills[] = new int[] { 20000, 10000, 5000, 2000, 1000 };
        int vectorCoins[] = new int[] { 500, 100, 50, 25, 10, 5 };
        for (int i = 0; i < 5; i++) {
            if (montoVuelto >= vectorBills[i]) {
                int amountOfBill = 0;
                while ((vectorBills[i] * (amountOfBill + 1)) <= montoVuelto) {
                    amountOfBill++;
                }
                montoVuelto = montoVuelto - (vectorBills[i] * amountOfBill);
                System.out.println("Billetes de " + vectorBills[i] + "= " + amountOfBill);
            } else {

            }
        }
        int montoVueltoMonedas = montoVuelto;
        for (int i = 0; i < 6; i++) {
            if (montoVueltoMonedas >= vectorCoins[i]) {
                int amountOfCoins = 0;
                while ((vectorCoins[i] * (amountOfCoins + 1)) <= montoVueltoMonedas) {
                    amountOfCoins++;
                }
                montoVueltoMonedas = montoVueltoMonedas - (vectorCoins[i] * amountOfCoins);
                System.out.println("Monedas de " + vectorCoins[i] + "= " + amountOfCoins);
            } else {

            }
        }
        System.out.println("\n¡GRACIAS POR SU COMPRA!\n");
    }
}
