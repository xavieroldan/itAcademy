package exercicilletresrepetides;

import java.util.HashMap;
import java.util.Map;

/**
 * FASE 3 Emmagatzemar en un Map tant les lletres de la llista com el nombre de
 * vegades que apareixen
 */
/**
 *
 * @author Xavier Roldán
 */
public class Fase3
{
    public static
            void main(String[] args)
    {
        String name = "PepeP"; // name String

        char[] nameTable = name.toCharArray(); // covert name to char array
        for (int i = 0; i < name.length(); i++) // loop to show all the array values
        {
            System.out.println(nameTable[i]); // output the result
        }

        Map< Character, Integer> nameMap = new HashMap<>(); // Create the Map
        for (int i = 0; i < name.length(); i++)
        {
            char c = nameTable[i]; // get the char to analize
            boolean bolMap = nameMap.containsKey(nameTable[i]); // verify if the map has the char
            if (bolMap != true)
            {
                nameMap.put(nameTable[i], 1);// if not exist , put the new information at the map
            }
            else
            {
                nameMap.put(c, nameMap.get(c) + 1); // if exist update the counter
            }

        }
        System.out.println(nameMap);

    }
}
