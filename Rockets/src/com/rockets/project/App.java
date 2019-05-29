package com.rockets.project;

import com.rockets.models.Rocket;
import com.rockets.models.Thruster;
import com.rockets.views.Interface;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Xavier Roldán <info@xavierroldan.com>
 */
public class App
{
    public static void main(String[] args) throws InterruptedException
    {
        //Declare the variables
        String codeRocket1;
        String codeRocket2;

        List<Thruster> r1TrusthersList = new ArrayList<>();
        List<Thruster> r2TrusthersList = new ArrayList<>();

        Interface myInterface = new Interface(); // Start the view

        //Define the rockets values
        //Code, power start, power max  
        codeRocket1 = "32WESSDS";//Rocket 1
        int[] powNow1 =
        {
            0,
            0,
            0
        };
        int[] powMax1 =
        {
            10,
            30,
            80
        };

        codeRocket2 = "LDSFJA32";//Rocket 2          
        int[] powNow2
                =
                {
                    0,
                    0,
                    0,
                    0,
                    0,
                    0
                };
        int[] powMax2
                =
                {
                    30,
                    40,
                    50,
                    50,
                    30,
                    10
                };

        //Adding the thrusters
        //thrusters rocket 1
        for (int i = 0; i < powNow1.length; i++)
        {
            Thruster t = new Thruster();

            UUID code = getUUID();
            t.setCode(code);

            int powNow = powNow1[i];
            t.setPowNow(powNow);

            int powMax = powMax1[i];
            t.setPowMax(powMax);

            r1TrusthersList.add(t);
        }

        //thrusters rocket 2
        for (int i = 0; i < powNow2.length; i++)
        {
            Thruster t = new Thruster();

            UUID code = getUUID();
            t.setCode(code);

            int powNow = powNow2[i];
            t.setPowNow(powNow);

            int powMax = powMax2[i];
            t.setPowMax(powMax);

            r2TrusthersList.add(t);
        }
        // Assembly the rockets
        Rocket rocket1 = new Rocket(codeRocket1, r1TrusthersList);
        Rocket rocket2 = new Rocket(codeRocket2, r2TrusthersList);

        //Output the rockets configuration
        myInterface.rocketAtrib(rocket1);
        myInterface.rocketAtrib(rocket2);

        //Output the rocket speed
        System.out.println("\n");
        myInterface.rocketSpeed(rocket1);
        myInterface.rocketSpeed(rocket2);

//Accelerar amb els coets tres cops: fils separats per a cada motor
        System.out.println("\nAccelerar amb els coets tres cops: fils separats per a cada motor");
        for (int i = 0; i < 3; i++)
        {
            rocket1.accelerateRocket();
            System.out.println(rocket1.getCode() + "|Aceleración:" + (i + 1) * 10 + "|Velocidad:" + rocket1.getRocketSpeed());
        }

        for (int i = 0; i < 3; i++)
        {
            rocket2.accelerateRocket();
            System.out.println(rocket2.getCode() + "|Aceleración:" + (i + 1) * 10 + "|Velocidad:" + rocket2.getRocketSpeed());
        }

        //Output the rocket speed
        System.out.println("\n");
        myInterface.rocketSpeed(rocket1);
        myInterface.rocketSpeed(rocket2);

//6. Frenar cinc cops amb el primer coet (“32WESSDS”) i accelerar set amb el segon coet
        System.out.println("\n6. Frenar cinc cops amb el primer coet (“32WESSDS”) i accelerar set amb el segon coet");
        for (int i = 0; i < 5; i++)
        {
            rocket1.brakeRocket();
            System.out.println(rocket1.getCode() + "|Desaceleración:" + (i + 1) * 10 + "|Velocidad:" + rocket1.getRocketSpeed());
        }

        for (int i = 0; i < 7; i++)
        {
            rocket2.accelerateRocket();
            System.out.println(rocket2.getCode() + "|Aceleración:" + (i + 1) * 10 + "|Velocidad:" + rocket1.getRocketSpeed());
        }

//7. Mostrar a pantalla la velocitat actual
        //Output the rocket speed
        System.out.println("\n");
        myInterface.rocketSpeed(rocket1);
        myInterface.rocketSpeed(rocket2);

        //Accelerar 15 cops amb els dos coets.
        System.out.println("\nAccelerar 15 cops amb els dos coets.");
        for (int i = 0; i < 15; i++)
        {
            rocket1.accelerateRocket();
            System.out.println(rocket1.getCode() + "Aceleración:" + (i + 1) * 10 + "|Velocidad:" + rocket1.getRocketSpeed());
            rocket2.accelerateRocket();
            System.out.println(rocket2.getCode() + "Aceleración:" + (i + 1) * 10 + "|Velocidad:" + rocket1.getRocketSpeed());
        }

        //9. Mostrar a pantalla la velocitat actual
        //Output the rocket speed
        System.out.println("\n");
        myInterface.rocketSpeed(rocket1);
        myInterface.rocketSpeed(rocket2);
    }

    public static UUID getUUID() // Method to generate a UUID code
    {
        UUID output = UUID.randomUUID();
        return output;
    }
}

/**
 * FASE 1: Volem fer un software de carreres de coets. Un coet està identificat
 * per un codi de 8 caràcters i un número de propulsors. Realitza els següents
 * passos: OK //1. Creem dos coets amb els codis “32WESSDS” I “LDSFJA32”. El
 * primer coet tindrà tres propulsors i el segon sis propulsors. OK //2. Mostrar
 * a pantalla el codi dels coets i el número de propulsors que té.
 */
//FASE 2:
//Volem millorar el software perquè el propulsor tingui una potència màxima.
//Modifiquem en el main anterior:
// 1. Creem dos coets amb els codis “32WESSDS” I “LDSFJA32”. El primer coet tindrà
//tres propulsors (potència: 10,30,80) i el segon sis propulsors (potència:
//30,40,50,50,30,10) .
// 2. Mostrar a pantalla el codi dels coets , el número de propulsors que té i la potència
//màxima de cada propulsor.
// FASE 3:
//Per la fase 3 modificarem els propulsors afegint també una potencia actual. Un propulsor
//tindrà una potència màxima (no la pot superar) i una potencia actual (la potencia que té el
//propulsor en aquell moment). Tots els propulsors tindran una potència actual que
//començarà amb 0.
//El coet tindrà dos mètodes, accelerar o frenar i augmentarà o es reduirà de 10 en 10 la
//potencia de cada propulsors.
///3. Mostrar a pantalla la velocitat actual dels coets
///4. Accelerar amb els coets tres cops
///5. Mostrar a pantalla la velocitat actual
///6. Frenar cinc cops amb el primer coet (“32WESSDS”) i accelerar set amb el segon
//coet.
///7. Mostrar a pantalla la velocitat actual
///8. Accelerar 15 cops amb els dos coets.
///9. Mostrar a pantalla la velocitat actual
