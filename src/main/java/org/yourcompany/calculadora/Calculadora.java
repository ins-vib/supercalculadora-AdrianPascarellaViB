package org.yourcompany.calculadora;

/**
 *
 * @author Adrian Pascarella
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculadora {

    public static void main(String[] args) {
        System.out.println("Programa inicialitzat");
        mostrarMenuConsola();
        System.out.println("\nPrograma tancat");
    }

    /**
     * Calcula el nombre de dígits d’un número enter.
     * Funciona tant per a nombres positius com negatius.
     * Si el nombre és 0, retorna 1.
     *
     * @param nombre Número del qual es vol saber el nombre de dígits
     * @return Quantitat de dígits que té {@code nombre}
     */
    public static int nombreDigits(int nombre) {
        if (nombre == 0) {
            return 1; // el 0 té un dígit
        }        
        int comptador = 0;
        while (nombre != 0) {
            nombre /= 10;
            comptador++;
        }
        return comptador;
    }

    /**
     * Retorna la suma dels primers n números positius o negatius.
     * Funciona per a nombres enters positius i negatius.
     *
     * @param nombre Número més allunyat de 0 dels que sumarem
     * @return El sumatori dels nombres des de el {@code nombre} fins al 0
     */
    public static int sumaPrimersNumeros(int nombre) {
        int comptador, sumatori = 0;
        boolean positiu;
        positiu = nombre>=0;
        if (!positiu) {nombre*=-1;}
        comptador=nombre+1;
        while (comptador != 0) {
            comptador--;
            sumatori += comptador;
        }
        if (!positiu) return sumatori*=-1;
        return sumatori;
    }

    /**
     * Retorna el producte factorial del número.
     * Funciona per a nombres enters positius i negatius.
     *
     * @param nombre Número del que calcularem el producte factorial
     * @return La suma factorial del nombre {@code nombre}
     */
    public static int calcularFactorial(int nombre) {
        int actual, factorial;
        boolean positiu;
        positiu = nombre>=0;
        if (!positiu) {nombre*=-1;}
        factorial=nombre;
        actual=nombre;
        while (actual != 1) {
            actual--;
            factorial*=actual;
        }
        if (!positiu) {
            return factorial*=-1;
        }
        return factorial;
    }

    /**
     * Retorna el sumatori dels quadrats dels n primers números.
     * Funciona per a nombres enters positius i negatius, el resultat sempre es positiu.
     *
     * @param nombre Número del que calcularem el sumatori de quadrats
     * @return El sumatori dels quadrats del nombre {@code nombre}
     */
    public static int sumaQuadrats(int nombre) {
        int comptador, sumatori = 0;
        boolean positiu;
        positiu = nombre>=0;
        if (!positiu) {nombre*=-1;}
        comptador=nombre+1;
        while (comptador != 0) {
            comptador--;
            sumatori += comptador*comptador;
        }
        return sumatori;
    }

    /**
     * Retorna el resultat de elevar una base a un exponent.
     * Funciona per a nombres enters positius.
     *
     * @param base Número que serà multiplicat per si mateix
     * @param exponent Número de vegades que es repeteix la multiplicació
     * @return El producte final de elevar la base {@code base} a l'exponent {@code exponent}
     */
    public static int calcularPotencia(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        int resultado = base;
        for (int i = 1; i < exponent; i++) {
            int sumaParcial = 0;
            for (int j = 0; j < base; j++) {
                sumaParcial += resultado;
            }
            resultado = sumaParcial;
        }
        return resultado;
    }

    /**
     * Indica si un nombre es primer o no.
     * Funciona per nombres enters positius i negatius.
     *
     * @param nombre nombre que s'analitzarà si es primer o no.
     * @return true si {@code nombre} es primer, false en cas contrari.
     */
    public static boolean esPrimer(int nombre) {return nombre%2!=0;}

    /**
     * Indica si un nombre es primer o no.
     *
     * @param nombre nombre que s'analitzarà si es primer o no.
     * @return true si {@code nombre} es primer, false en cas contrari.
     */
    public static boolean esPerfecte(int nombre) {
        int sumatori=0;
        for (int i=1; i<=(nombre/2); i++) if (nombre%i==0) sumatori+=i;
        return sumatori==nombre;
    }

    /**
     * Menú de la SuperCalculadora.
     * 
     * Permet accedir a les operacions.
     */
    public static void mostrarMenuConsola() {
        Scanner sc = new Scanner(System.in);
        int nombre, operacio;
        boolean sortir = false;

        while (!sortir) {
            
            System.out.println("\nMenú de SuperCalculadora:\n");
            System.out.println("1- Suma dels primers n números");
            System.out.println("2- Factorial d'un nombre");
            System.out.println("3- Suma dels quadrats dels primers n números");
            System.out.println("4- Potència d'un nombre");
            System.out.println("5- Nombre de dígits d'un nombre");
            System.out.println("6- Identificar si un nombre es primer");
            System.out.println("7- Identificar si un nombre es perfecte");
            System.out.println("0- Sortir");

            try {

                System.out.print("\nIngresa la operació que vols utilitzar: ");
                operacio = sc.nextInt();
                System.out.println("");

                switch (operacio) {
                    case 0:
                        System.out.println("Sortint del programa...");
                        sortir = true;
                        sc.close();
                        break;
                        
                    case 1:
                        System.out.print("Ingresar el nombre més allunyat del 0 del sumatori: ");
                        nombre = sc.nextInt();
                        System.out.println("\nResultat: " + sumaPrimersNumeros(nombre));
                        break;
                        
                    case 2:
                        System.out.print("Ingresar el nombre que es vol calcular el producte factorial: ");
                        nombre = sc.nextInt();
                        System.out.println("\nResultat: " + calcularFactorial(nombre));
                        break;
                        
                    case 3:
                        System.out.print("Ingresar el nombre més allunyat del 0 que es vol fer la suma dels quadrats: ");
                        nombre = sc.nextInt();
                        System.out.println("\nResultat: " + sumaQuadrats(nombre));
                        break;
                        
                    case 4:
                        System.out.print("Ingresar la base: ");
                        int base = sc.nextInt();
                        System.out.print("Ingresar l'exponent: ");
                        int exponent = sc.nextInt();
                        System.out.println("\nResultat: " + calcularPotencia(base, exponent));
                        break;
                        
                    case 5:
                        System.out.print("Ingresar el nombre que es vol saber el nombre de dígits: ");
                        nombre = sc.nextInt();
                        System.out.println("\nResultat: " + nombreDigits(nombre));
                        break;
                        
                    case 6:
                        System.out.print("Ingresar el nombre que es vol saber si es primer: ");
                        nombre = sc.nextInt();
                        System.out.println("\nResultat: " + (esPrimer(nombre) ? "Sí" : "No"));
                        break;
                        
                    case 7:
                        System.out.print("Ingresar el nombre que es vol saber si es perfecte: ");
                        nombre = sc.nextInt();
                        System.out.println("\nResultat: " + (esPerfecte(nombre) ? "Sí" : "No"));
                        break;
                        
                    default:
                        System.out.println("\nOpció no vàlida!");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nERROR: Els valors introduïts han de ser nombres enters...");
                sc.next();
            } catch (Exception e) {
                System.out.println("\nERROR: S'ha produït un error inesperat...");
            }
        }
    }


}