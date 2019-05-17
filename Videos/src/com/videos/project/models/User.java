package com.videos.project.models;

import java.util.ArrayList;
import java.util.List;

public class User
{
    private String userId;

    private String name;

    private String surname;

    private String regDate;

    private String password;

    private List userVideos;

    public User()
    {
    }

    public User(int idUser)
    {
        this.userId = userId;
    }

    public void createUser(List newUserDates)
    {
        this.name = (String) newUserDates.get(0);
        this.surname = (String) newUserDates.get(1);
        this.password = (String) newUserDates.get(2);
        this.regDate = (String) newUserDates.get(3);
        this.userId = (String) newUserDates.get(4);

        System.out.println("Usuario creado: \nNombre: " + name
                + "\nApellido: " + surname
                + "\nPassword: " + password
                + "\nID:" + userId
                + "\nFecha: " + regDate);
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public String getRegDate()
    {
        return regDate;
    }

    public String getPassword()
    {
        return password;
    }

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public List<String> getLogin()
    {
        String getUserId = userId;
        String getPass = password;
        List<String> output = new ArrayList<>();
        output.add(getUserId);
        output.add(getPass);
        return output;
    }

    public List getUserVideos()
    {
        return userVideos;
    }

    public void setUserVideos(List userVideos)
    {
        this.userVideos = userVideos;
    }
}
