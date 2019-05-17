package com.videos.project;

import com.videos.project.models.User;
import com.videos.project.models.Video;
import com.videos.project.views.Interface;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App
{

    public static void main(String[] args)
    {
        //Variables declaration
        int idUser = 0;
        int videoId = 0;
        int menUserSel;
        int idVideo;

        boolean bolNewUser;
        boolean loginRes = false;
        boolean exitUserMenu = false;
        boolean exitApp = false;
        Scanner sc = new Scanner(System.in);

        List<String> newUserDates = new ArrayList<>();
        List<String> loginUser = new ArrayList<>();
        List<User> databaseUsers = new ArrayList<>();
        List<String> newVideoData1 = new ArrayList<>();
        List<String> tagsList = new ArrayList<>();
        List<Video> databaseVideos = new ArrayList<>();

        Interface myInterface = new Interface();

        do
        {
            //Main menu
            System.out.println("\nBienvenido a Video Dominios");
            System.out.println("===========================\n");

            do
            {
                bolNewUser = myInterface.mainMenu(); // Ask if you are a new user
                if (bolNewUser == true)
                {
                    //to create a user
                    User addedUser = new User(); // Yes: Create a new user object
                    idUser++; // add one to the users id counter
                    String sIdUser = Integer.toString(idUser); // change to string

                    newUserDates = myInterface.setNewUser(sIdUser); // get the dates into the new user object
                    addedUser.createUser(newUserDates); // add all the dates to the object
                    //add the user to the datababase

                    databaseUsers.add(addedUser);
                    System.out.println("\nNuevo usuario creado. Logeate para comenzar!");
                    System.out.println("============================================");
                }
                else
                {
                    do
                    {
                        //to login user
                        loginUser = myInterface.loginMenu();
                        // to compare the users BBDD (return true/false)            
                        loginRes = chekLoginDB(databaseUsers, loginUser);
                        if (loginRes == false)
                        {
                            myInterface.loginError();
                        }
                    }
                    while (loginRes == false);
                }
            }
            while (loginRes == false);

            // Loged OK
            System.out.println("\nLogin correcto\n");

            // Set the idUser from the login
            idUser = Integer.parseInt(loginUser.get(0));
            //User menu
            do
            {
                menUserSel = myInterface.userMenu();
                switch (menUserSel)
                {
                    case 1://Create new video

                        Video addedVideo = new Video();
                        videoId++;
                        addedVideo.setIdVideo(videoId);//set the video id
                        addedVideo.setOwner(idUser);//set the video owner
                        newVideoData1 = myInterface.menNewVideo();//get the title and the url
                        addedVideo.setTitle(newVideoData1.get(0));//set title
                        addedVideo.setUrl(newVideoData1.get(1));// set url                        
                        tagsList = myInterface.menSetTags();//get the tags
                        addedVideo.setTagsList(tagsList);// set the tags list
                        databaseVideos.add(addedVideo);//add to the database of videos

                        System.out.println("Nuevo video creado!");
                        exitUserMenu = false;
                        break;

                    case 2://List user videos

                        System.out.println("\nEstos son tus vídeos:");
                        System.out.println("=====================");
                        listVideos(idUser, databaseVideos);
                        exitUserMenu = false;
                        break;
                    case 3://Delete a video

                        System.out.println("\nElige la ID del video a eliminar:");
                        System.out.println("=================================");
                        listVideos(idUser, databaseVideos);
                        try
                        //verify is a int
                        {
                            int answer = sc.nextInt();//get the ID video

                            //verify if video exists
                            idVideo = 0;
                            for (int i = 0; i < databaseVideos.size(); i++)
                            {
                                idVideo = databaseVideos.get(i).getIdVideo();
                                //verify exists in the user video list
                                if (idVideo == answer)
                                {
                                    //delete video
                                    databaseVideos.remove(i);
                                    System.out.println("Video eliminado");
                                }
                                else
                                {
                                    //if not exists message and out menu
                                    System.out.println("El video " + answer + " no existe.");
                                }
                            }
                        }
                        catch (Exception e)
                        {
                            sc.next();
                            myInterface.ioError();
                        }
                        break;

                    case 4://Exit to Main
                        System.out.println("//Exit to Main");
                        exitUserMenu = true;
                        break;

                    case 5://Exit App
                        exitApp = true;
                        exitUserMenu = true;
                        break;

                    default:
                        myInterface.ioError();
                        exitUserMenu = false;
                }
            }
            while (exitUserMenu == false);

            //Closing exit app message
            System.out.println("Gracias por tu visita y hasta pronto!");
        }
        while (exitApp == false);
    }

//Method to check the user login in the DB
    public static boolean chekLoginDB(List<User> databaseUsers, List<String> loginUser)
    {
        //
        String dbUserId;
        String dbPass;
        String logUserId = loginUser.get(0);
        String logUserPass = loginUser.get(1);
        int loginCount = 0;

        for (int i = 0; i < databaseUsers.size(); i++) // Loop to compare the array
        {
            //read the object userid and password
            dbUserId = databaseUsers.get(i).getUserId();
            dbPass = databaseUsers.get(i).getPassword();
            // compare with the login dates
            if (dbUserId.equals(logUserId) && dbPass.equals(logUserPass))
            {
                loginCount = 1; // true: add 1 to other counter
            }
            // false continue
        }
        if (loginCount == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
// Method to search all the user videos

    private static void listVideos(int idUser, List<Video> databaseVideos)
    {
        int userIdVideo;
        int idVideo;
        String titleVideo;
        String url;
        List<String> tags = new ArrayList<>();

        for (int i = 0; i < databaseVideos.size(); i++) // Loop to search the videos
        {
            //read the object userid and password
            idVideo = databaseVideos.get(i).getIdVideo();
            userIdVideo = databaseVideos.get(i).getOwner();
            titleVideo = databaseVideos.get(i).getTitle();
            url = databaseVideos.get(i).getUrl();
            tags = databaseVideos.get(i).getTagsList();

            // compare with the login dates
            if (userIdVideo == idUser)
            {
                System.out.println("ID: " + idVideo + "|Título: " + titleVideo + " |Url: " + url + " |Tags:" + tags);
            }
            // false continue
        }
    }

}
//Crea un programa en Java amb l’estructura de domini de les classes:
//- OK Video: esta format por una URL, un títol i una llista de tags*.
//- OK Usuari: esta format per un nom, cognom, password i una data de registre.
// OK Un usuari pot crear nous vídeos i veure un llistat dels seus videos.
//OK*Un tag es un text amb una paraula, tenir en compte que un video pot tenir varis tags.
//OK:La estructura no ha de permetre afegir camps buits, en cas de que n’hi hagi ha de retornar una excepció.
