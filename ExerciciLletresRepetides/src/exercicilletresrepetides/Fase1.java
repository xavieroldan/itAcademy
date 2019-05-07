package exercicilletresrepetides;
/*
 * FASE 1
 * Crea una taula (char[]) amb el teu nom on cada posició correspongui a una lletra.
 * Fes un bucle que recorri aquesta taula i mostri per consola cadascuna de les lletres.
 */
/**
 *
 * @author Xavier Roldán
 */
public class Fase1
{
    public static void main(String[] args)
    {
        String name = "Xavier"; // name String

        char[] nameTable = name.toCharArray(); // covert name to char array
        for (int i = 0; i < name.length(); i++) // loop to show all the array values
        {
            System.out.println(nameTable[i]); // output the result
        }

    }

}