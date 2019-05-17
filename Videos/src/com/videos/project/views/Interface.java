package com.videos.project.views;

import com.videos.project.models.Video;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Xavier Roldán <info@xavierroldan.com>
 */
public class Interface
{
    String userId;

    //Method - Main menu 
    public boolean mainMenu()
    {
        boolean isExiting = false;
        boolean output = false;
        Scanner sc = new Scanner(System.in);

        do
        {
            System.out.println("¿Eres un nuevo usuario? (S/N)");
            String answer = sc.nextLine().toLowerCase();
            switch (answer)
            {
                case "s":
                {
                    isExiting = true;
                    output = true;
                    break;
                }
                case "n":
                {
                    isExiting = true;
                    output = false;
                    break;
                }
                default:
                {
                    ioError();
                    isExiting = false;
                    break;
                }
            }
        }
        while (isExiting == false);
        return output;
    }

    //Method to get the new user dates
    public List<String> setNewUser(String userId)
    {
        Scanner sc = new Scanner(System.in);
        List<String> output = new ArrayList<>();
        boolean isExiting = false;
        do
        {
            try
            {
                System.out.println("Indícanos tus datos para el registro:");
                System.out.println("=====================================");

                System.out.println("Nombre:");
                String answer = sc.nextLine();
                blankError(answer); // Check blank field
                output.add(answer);

                System.out.println("Apellido:");
                answer = sc.nextLine();
                blankError(answer); // Check blank field
                output.add(answer);

                System.out.println("Password:");
                answer = sc.nextLine();
                blankError(answer); // Check blank field
                output.add(answer);

                LocalDate localDate = LocalDate.now();
                output.add(localDate.toString());

                this.userId = userId;
                output.add(userId);

                isExiting = true;

            }
            catch (Exception e) // Blank error exception result
            {
                for (int i = 0; i < output.size(); i++) // clean the array
                {
                    output.remove(i);
                }
                isExiting = false;
            }
        }
        while (isExiting == false);
        return output;
    }

    //Method to login users
    public List<String> loginMenu()
    {
        Scanner sc = new Scanner(System.in);
        List<String> output = new ArrayList<>();
        boolean isExiting = false;
        do
        {
            try
            {
                System.out.println("Introduce tus datos para entrar:");
                System.out.println("================================");

                System.out.println("ID usuario: ");
                String answer = sc.nextLine();
                blankError(answer); // Check blank field 

                output.add(answer);

                System.out.println("Password: ");
                answer = sc.nextLine();
                blankError(answer); // Check blank field                
                output.add(answer);

                isExiting = true;
            }
            catch (Exception e)
            {
                for (int i = 0; i < output.size(); i++) // clean the array
                {
                    output.remove(i);
                }
                isExiting = false;
            }
        }
        while (isExiting == false);
        return output;
    }

    //Method - User menu
    public int userMenu()
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nElige la opción indicando el número: ");
            System.out.println("==================================== ");
            System.out.println("[1] Crear video");
            System.out.println("[2] Ver lista de tus videos");
            System.out.println("[3] Borrar video");
            System.out.println("[4] Cerrar sesión");
            System.out.println("[5] Salir de la aplicación");
            int output = sc.nextInt();
            return output;
        }

        catch (Exception e)
        {
            return 0;
        }
    }

    //Method to get data to create new video
    public List menNewVideo()
    {
        Scanner sc = new Scanner(System.in);
        List<String> output = new ArrayList<>();
        boolean isExiting = false;

        do
        {
            try
            {
                System.out.println("Vamos a crear un nuevo video");
                System.out.println("============================");
                System.out.println("Título:");
                String answer = sc.nextLine();
                blankError(answer); // Check blank field 
                output.add(answer);

                System.out.println("Url:");
                answer = sc.nextLine();
                blankError(answer); // Check blank field 
                output.add(answer);

                isExiting = true;
            }
            catch (Exception e)
            {
                for (int i = 0; i < output.size(); i++) // clean the array
                {
                    output.remove(i);
                }
                isExiting = false;
            }
        }
        while (isExiting == false);

        return output;
    }

    //Method to get the video tags List
    public List menSetTags()
    {
        Scanner sc = new Scanner(System.in);
        List<String> output = new ArrayList<>();
        boolean bolExitTag = false;
        do
        {
            boolean isExiting = false;
            do
            {
                try
                {
                    System.out.println("Tag: ");
                    String answer = sc.nextLine();
                    blankError(answer); // Check blank field 
                    tagBlankEspaceError(answer);//Check one word tag

                    output.add(answer);

                    isExiting = true;
                }
                catch (Exception e)
                {
                    for (int i = 0; i < output.size(); i++) // clean the array
                    {
                        output.remove(i);
                    }
                    isExiting = false;
                }
            }
            while (isExiting == false);

            boolean exitNewTag = false;
            do
            {
                System.out.println("¿Quieres añadir otra tag? [S/N]");
                String nextTag = sc.nextLine().toLowerCase();
                switch (nextTag)
                {
                    case "s":
                        bolExitTag = false;
                        exitNewTag = true;
                        break;
                    case "n":
                        exitNewTag = true;
                        bolExitTag = true;
                        break;
                    default:
                        ioError();
                        exitNewTag = false;
                        bolExitTag = false;
                        break;
                }
            }
            while (exitNewTag == false);

        }
        while (bolExitTag == false);

        return output;
    }
    //List user videos

    public List<Video> listVideos(List dataBaseVideos)
    {
        return null;
    }
    //TODO: Delete video

    //Method to output message io error 
    public void ioError()
    {
        System.out.println("\nFormato incorrecto. Vuelva a intentarlo");
    }

    //Method to output message login error 
    public void loginError()
    {
        System.out.println("\nCredenciales incorrectas. Vuelva a intentarlo\n");
    }

    //Method blank error Exception
    public void blankError(String input) throws Exceptions
    {
        if (input.equals(""))
        {
            System.out.println("Error por campo vacío. Vuelva a intentarlo.");
            throw new Exceptions();
        }
    }

    //Method tag with spaces error Exception
    public void tagBlankEspaceError(String input) throws Exceptions
    {
        char[] charInput = input.toCharArray();
        int checkerror = 0;

        for (int i = 0; i < charInput.length; i++)
        {
            char c = charInput[i];
            if (c == ' ')
            {
                checkerror++;
            }
        }
        if (checkerror >= 1)
        {
            System.out.println("Error por tag de más de una palabra. Vuelva a intentarlo.");
            throw new Exceptions();
        }
    }
}
