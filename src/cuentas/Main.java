package cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        operativa_cuenta(cuenta1); // Llamada al método operativa_cuenta
    }

    public static void operativa_cuenta(CCuenta cuenta) {
        double saldoActual = cuenta.estado();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            cuenta.retirar(2300);
            System.out.println("Retiro realizado. Nuevo saldo: " + cuenta.estado());
        } catch (Exception e) {
            System.out.println("Fallo al retirar: " + e.getMessage());
        }

        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(695);
            System.out.println("Ingreso realizado. Nuevo saldo: " + cuenta.estado());
        } catch (Exception e) {
            System.out.println("Fallo al ingresar: " + e.getMessage());
        }
    }
}