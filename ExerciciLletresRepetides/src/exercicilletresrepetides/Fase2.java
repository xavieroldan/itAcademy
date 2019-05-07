package exercicilletresrepetides;

import java.util.ArrayList;
import java.util.List;

/*
 * FASE 2
 * Canvia la taula per una llista (List<Character>)
 * Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. Sinó, imprimeix: ‘CONSONTANT’.
 * Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen números!’.
 */
/**
 *
 * @author Xavier Roldán
 */
public class Fase2
{
    public static final String CONSONANTS = "BCDFGHJKLMNÑPQRSTVWXYZbcdfghjklmnñpqrstvwxyz"; //Create the constant for the consonants
    public static final String VOCALS = "AEIOUaeiou"; //Create the constant for the vocals
    public static final String NUMBERS = "1234567890";  //Create the constant for the numbers              

    public static void main(String[] args)
    {
        String name = "Xa2vier2"; // Input the name to process

        List<String> lettersList = new ArrayList<>(); // Create the array list of Strings

        char[] nameTable = name.toCharArray(); // covert name to char array 
        for (int i = 0; i < name.length(); i++) // loop to read all the array values
        {
            String letter = String.valueOf(nameTable[i]); // change the char to string value           
            lettersList.add(letter); // Add the char array values covert to string to the array list of strings
            System.out.print(letter + " ");

            getType(letter); // Call to the method to identify the type of character is reading now

        }
        
    }

    // Method to identify the type of character
    public static void getType(String letter)
    {
        if (CONSONANTS.contains(letter))
        {
            System.out.println("CONSONANT");
        }

        else if (VOCALS.contains(letter))
        {
            System.out.println("VOCAL");
        }
        else if (NUMBERS.contains(letter))
        {
            System.out.println("Els noms de persones no contenen números!");
        }

    }

}
    

