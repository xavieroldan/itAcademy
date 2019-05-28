/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rockets.views;

import com.rockets.models.Rocket;
import com.rockets.models.Thruster;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Xavier Roldán <info@xavierroldan.com>
 */
public class Interface
{
    public void rocketAtrib(Rocket input)
    {
        List<Thruster> inputThrusters = input.getTrusthers();
        int[] listPow = new int[inputThrusters.size()];

        for (int i = 0; i < inputThrusters.size(); i++)
        {
            listPow[i] = inputThrusters.get(i).getPowMax();
        }

        System.out.print("\n" + input.getCode() + ":");

        for (int i = 0; i < listPow.length; i++)
        {
            System.out.print(listPow[i] + "|");
        }
    }

    public void rocketSpeed(Rocket input) // get the rocket speed
    {
        double output = input.getRocketSpeed();
        System.out.println("Velocidad:" + input.getCode() + ":" + output);
    }

    public void thrusterStatus(Thruster input)
    {
        UUID code = input.getCode();
        System.out.println("\tVariando thruster ID|" + code.toString());
    }

}
