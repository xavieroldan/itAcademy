package com.myVehicles.app;

import com.myVehicles.models.Wheel;
import com.myVehicles.models.Car;
import com.myVehicles.models.Bike;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Xavier Roldán <info@xavierroldan.com>
 */
public class Main
{
    public static void main(String[] args) throws Exception
    {
        //Variable declaration

        String plate;
        String brand;
        String color;
        String typeVehicle;
        boolean isPlateVerified;
        boolean isTypeVerified;

        // Object Scanner declaration
        Scanner sc = new Scanner(System.in);

// Get the user information
        do
        {
            System.out.println("Escribe coche o moto:\n");
            typeVehicle = sc.nextLine();
            switch (typeVehicle)
            {

                case "coche":
                {
                    System.out.println("Construyamos un coche!");
                    isTypeVerified = true;
                    break;
                }
                case "moto":
                {
                    System.out.println("Construyamos una moto!");
                    isTypeVerified = true;
                    break;
                }
                default:
                {
                    System.out.println("Elige el tipo de vehículo entre las opciones correctas.\n");
                    isTypeVerified = false;
                    break; //
                }
            }
        }
        while (isTypeVerified == false);

        do
        {
            //get the plate 
            plate = setPlate();

            //Verify plate format
            isPlateVerified = false;
            isPlateVerified = verifyPlate(plate);
        }
        while (isPlateVerified == false);

        //get the brand
        System.out.println("Introduzca la marca:");
        brand = sc.nextLine();

        //get the color
        System.out.println("Introduzca el color:");
        color = sc.nextLine();

        //Now switch to bike and car
        switch (typeVehicle)
        {
            case "moto":
            {
                // Create vehicle BIKE
                Bike bike1 = new Bike(plate, brand, color);

                // Get user back wheel info and create the object
                Wheel backWheel = defineWheel("Características rueda trasera");

                // Get user front wheel info and create the object
                Wheel frontWheel = defineWheel("Características rueda delantera");

                // Define the 2 wheels of the object bike1
                bike1.addWheels(frontWheel, backWheel);
                break;
            }
            default:
            {
                // Create vehicle CAR
                Car car1 = new Car(plate, brand, color);

                // Get user back wheel info and create the object
                Wheel backWheel = defineWheel("Características ruedas traseras");

                // Get user front wheel info and create the object
                Wheel frontWheel = defineWheel("Características ruedas delanteras");

                // Create the front wheels
                List<Wheel> frontWheels = pairWheels(frontWheel);

                // Create the back wheels
                List<Wheel> backWheels = pairWheels(backWheel);

                // Define the 4 wheels of the object car1
                car1.addWheels(frontWheels, backWheels);
                break;
            }
        }
        //The end...
        System.out.println("Vehículo tipo " + typeVehicle + " construido!");
    }
    // get user information to create a wheel method 

    public static Wheel defineWheel(String output)

    {
        // Object Scanner and variables method declaration
        String brand;
        double diameter = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Defina " + output + ":");
        System.out.println("\nIntroduzca la marca:");
        brand = sc.nextLine();

        boolean isDiameterVerified;
        isDiameterVerified = false;

        do
        {

            diameter = 0;
            System.out.println("Introduzca el diámetro (decimales separados por coma [,]):");
            //trycatch to jump InputMismatchException at diameter Scanner with no double 
            try
            {
                diameter = sc.nextDouble();
            }
            catch (Exception e)
            {
                sc.next();
            }

            if (diameter > 0.4 && diameter < 4)
            {
                isDiameterVerified = true;
            }
            else
            {
                System.out.println("Formato de diámetro incorrecto.\nRecuerde: mayor de 0.4 y menor de 4.\n");
                isDiameterVerified = false;
            }

        }
        while (isDiameterVerified == false);

        Wheel newWheel = new Wheel(brand, diameter); // Create the object wheel with the user values

        return newWheel;

    }

    // create a List of pair of wheels method 
    public static List<Wheel> pairWheels(Wheel theWheel)
    {
        List<Wheel> pairWheels = new ArrayList<Wheel>();

        for (int i = 0; i < 2; i++)
        {
            pairWheels.add(theWheel);
        }

        return pairWheels;
    }

    // Get the plate method
    public static String setPlate()
    {
        String plate;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la matrícula:");
        plate = sc.nextLine();

        return plate;

    }

    //Verify plate format method
    public static boolean verifyPlate(String plate)
    {
        //change to lower case the plate string
        String plateMethod = plate.toLowerCase();

        // convert plate String to char array
        char[] plateChar = plateMethod.toCharArray();

        // verify autorized type of characters throw the array
        int num = 0;
        int let = 0;
        boolean success = false;

        for (int i = 0; i < plateChar.length; i++)
        {
            char c = plateChar[i]; // get from the array char the ascii code
            int ascii = (int) c;

            if (ascii >= 48 && ascii <= 57) // count the numbers
            {
                num++;
            }
            else if (ascii >= 97 && ascii <= 122) // count the letters
            {
                let++;
            }
        }

        if (num == 4 && (let >= 2 && let <= 3))
        {
            success = true;
            return success;
        }
        else
        {
            System.out.println("Formato de matrícula erróneo.\nRecuerde: 4 números y 2 ó 3 letras.");
            success = false;
            return success;
        }
    }

}

//0) OK/ Preguntar a l’usuari si vol crear un cotxe o una moto.
//1) OK/ Demanar a l’usuari la matrícula, la marca i el seu color.
//2) OK/ Crear el vehícle amb les dades anteriors.
//3) OK/ Afegir-li les rodes traseres corresponents, demanant a l’usuari la marca i el diametre.
//4) OK/ Afegir-li les rodes davanteres corresponents, demanant a l’usuari la marca i el diametre.
