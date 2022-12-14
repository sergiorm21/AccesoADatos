/*Sergio Reina Montes*/
package UDActividad5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ejercicio2 {
    
    static Scanner sc = new Scanner(System.in);
    static RandomAccessFile archivo = null;

    public static void main(String[] args) {

        FileWriter archivo = null;
        PrintWriter pw = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String ruta;
            File fichero = null;
            

            FileWriter fichero = null;
            PrintWriter pw = null;

            System.out.println("Bienvenido, selecciona lo que quieres hacer.");

            System.out.println("1 - Crear un fichero.");
            System.out.println("2 - Mostrar contenido de un fichero.");
            System.out.println("3 - Escribir al final de un fichero.");
            System.out.println("4 - Salir.");
            System.out.println("Elige la opcion");
            int opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 1:
                    ruta = "C:\\Users\\reina.moser\\Documents\\NetBeansProjects\\AccesoADatos\\src\\UDActividad5\\SergioReinaExtra1.txt";
                    fichero = new File(ruta);

                    if (!fichero.exists()) {
                        fichero.createNewFile();
                    } else {
                        System.out.println("No se puede crear porque ya existe.");
                    }

                case 2:
                    try {
                    ruta = "C:\\Users\\reina.moser\\Documents\\NetBeansProjects\\AccesoADatos\\src\\UDActividad5\\SergioReinaExtra1.txt";
                    fichero = new File(ruta);

                    if (!fichero.exists()) {
                        System.out.println("El archivo ya existe");
                    } else {
                        FileReader fr = new FileReader(fichero);
                        br = new BufferedReader(fr);

                        String linea = br.readLine();

                        while (linea != null) {
                            System.out.println(linea);
                            linea = br.readLine();
                        }
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }

                case 3:
                    try {
                    ruta = "C:\\Users\\reina.moser\\Documents\\NetBeansProjects\\AccesoADatos\\src\\UDActividad5\\SergioReinaExtra1.txt";
                    fichero = new FileWriter(ruta);
                    Printwriter pw = new Printwriter(fichero);

                    if (!fichero.exists()) {
                        System.out.println("El archivo ya existe.");
                    } else {
                        for (int i = 0; i < 10 , i++) {
                            pw.println("Linea " + 1);
                        }
                    }

                } catch (Excepcion e) {
                    e.printStackTrace();
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
