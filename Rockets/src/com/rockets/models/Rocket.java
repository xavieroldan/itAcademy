/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rockets.models;

import java.util.List;

/**
 *
 * @author Xavier Roldán <info@xavierroldan.com>
 */
public class Rocket
{
    private String code;
    private List<Thruster> trusthers;

    public Rocket()

    {
    }

    public Rocket(String code, List<Thruster> trusthers)
    {
        this.setCode(code);
        this.setTrusthers(trusthers);
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public List<Thruster> getTrusthers()
    {
        return trusthers;
    }

    public void setTrusthers(List<Thruster> trusthers)
    {
        this.trusthers = trusthers;
    }

    public void accelerateRocket() throws InterruptedException

    {
        for (int i = 0; i < this.getTrusthers().size(); i++) // one accelerate rocket 1
        {
            this.getTrusthers().get(i).accelerateT();
        }
    }

    public void brakeRocket() throws InterruptedException

    {
        for (int i = 0; i < this.getTrusthers().size(); i++) // one accelerate rocket 1
        {
            this.getTrusthers().get(i).brakeT();
        }
    }

    public double getRocketSpeed() // get the rocket speed
    {
//        Ara suposem que el coet està volant a l
//        ’espai sense fricció.La velocitat la podem calcular de la següent manera:
//        v = vo + 100 √PT
//        vo: és la velocitat inicial (la velocitat a la que anava abans de fer aquest càlcul)
//        PT: és la suma de la potencia de cada propulsor

        double output = 0;
        double vo = 0;
        double pT = 0;

        for (int i = 0; i < this.getTrusthers().size(); i++)
        {
            List<Thruster> pList = this.getTrusthers();
            double p = pList.get(i).getPowNow();
            pT = pT + p;
        }

        output = vo + (100 * (Math.sqrt(pT)));
        return output;
    }

}
