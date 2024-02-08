package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nombreUsuario;
        String nombreUsuarioBD="miguel";
        String contrasena;
        String contrasenaBD="miguel1234";
        String juego1="FreeFire";
        String juego2="Fifa";
        String juegoSeleccionado;
        Integer nivelVida=70;
        Integer contadorSkills=0;
        Integer contadorDisparos=0;
        Integer precioSkillVida=100000;
        Integer danoDisparos=-5;
        Boolean estaMuerto=false;

        Scanner leer=new Scanner(System.in);

        System.out.println("*****Bienvenido a Free Fire*****");
        System.out.println("Ingrese su nombre de usuario: ");
        nombreUsuario= leer.nextLine();
        System.out.println("Ingrese su contraseña: ");
        contrasena=leer.nextLine();
        if  (nombreUsuario.equals(nombreUsuarioBD) && contrasenaBD.equals(contrasena)){
            System.out.println("*****Iniciando*****");
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Bienvenido "+nombreUsuario);
            System.out.println("Seleccione un juego: ");
            juegoSeleccionado=leer.nextLine();
            if (juegoSeleccionado.equals(juego1)){

                do {
                    Random random=new Random();
                    int disparo=random.nextInt(2);

                    if (disparo==1){
                        contadorDisparos=contadorDisparos+1;
                        nivelVida=nivelVida+danoDisparos;
                        System.out.println("Te dispararon, tu vida quedo en: "+nivelVida);
                        if (contadorDisparos==3){
                            estaMuerto=true;
                        }
                        if (nivelVida==0){
                            estaMuerto=true;
                        }
                    }else{
                        //no le dieron
                        System.out.println("No le dieron");
                        contadorDisparos=0;
                    }

                }while (estaMuerto==false);

            }else{
                System.out.println("Servidores no disponibles");
            }
        }else{
            System.out.println("Contrasena o usuario incorrectos");
        }

    }
}