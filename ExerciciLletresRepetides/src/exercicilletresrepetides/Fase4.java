package exercicilletresrepetides;

import java.util.ArrayList;
import java.util.List;

/*
 * FASE 4
 * Crea una altra llista amb el teu cognom on cada posició correspongui a una lletra.
 * Fusiona les dues llistes en una sola. A més, afegeix una posició amb un espai buit entre la primera i la
 * segona. És a dir, partim de la llista name i surname i al acabar l’execució només tindrem una que es dirà
 * fullName.
 * FullName: [‘N’, ‘A’, ‘M’, ‘E’, ‘ ‘, ‘S’, ‘U’, ‘R‘, ‘N’, ‘A’, ‘M’, ‘E’]
/**
 *
 * @author Xavier Roldán
 */
public class Fase4
{

    public static void main(String[] args)
    {

        // Variables inicialization
        String name;
        String surName;
        String letter;
        List<String> nameList = new ArrayList<>(); // Create the name's list 
        List<String> surNameList = new ArrayList<>(); // Create the surname's list 
        List<String> fullNameList = new ArrayList<>(); // Create the fullName list 

        name = "Xavier"; // Input the name to process
        surName = "Roldán"; // Input the surname to process

        // Char array start
        char[] nameTable = name.toCharArray();
        char[] surNameTable = surName.toCharArray();

        //Get the name into the name list
        for (int i = 0; i < name.length(); i++) // loop to read all the name array values
        {
            letter = String.valueOf(nameTable[i]); // change the char to string value           
            nameList.add(letter); // Add the char array values covert to string to the array list of strings
        }
        //Get the surname into the surname list
        for (int i = 0; i < surName.length(); i++) // loop to read all the name array values
        {
            letter = String.valueOf(surNameTable[i]); // change the char to string value           
            surNameList.add(letter); // Add the char array values covert to string to the array list of strings
        }
        //Put name, blank space and surname in the full name list from name and surname lists

        for (int i = 0; i < name.length(); i++)
        {
            letter = nameList.get(i);
            fullNameList.add(letter);    // Add the name        
        }
        fullNameList.add(" "); // Ad the blank space

        for (int i = 0; i < surName.length(); i++)
        {
            letter = surNameList.get(i);
            fullNameList.add(letter);    // Add thesur name        
        }

        System.out.println(fullNameList); // Output teh full name list
    }

}
