/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rockets.models;

import com.rockets.views.Interface;
import java.util.UUID;

/**
 *
 * @author Xavier Roldán <info@xavierroldan.com>
 */
public class Thruster
{
    private int powNow;
    private int powMax;
    private UUID code;

    public Thruster()
    {
    }

    public Thruster(int powNow, int powMax)
    {
        this.setPowNow(powNow);
        this.setPowMax(powMax);
        this.setCode(code);
    }

    public int getPowNow()
    {
        return powNow;
    }

    public void setPowNow(int powNow)
    {
        this.powNow = powNow;
    }

    public int getPowMax()
    {
        return powMax;
    }

    public void setPowMax(int powMax)
    {
        this.powMax = powMax;
    }

    public UUID getCode()
    {
        return code;
    }

    public void setCode(UUID code)
    {
        this.code = code;
    }

    public void brakeT() throws InterruptedException // Brake with threads
    {
        Interface myInterface = new Interface();

        Runnable r1 = () ->
        {
            int nowP = this.getPowNow();
            int newP = nowP - 10;

            if (nowP > 0)
            {
                this.setPowNow(newP);
            }
        };

        Thread t1 = new Thread(r1);
        t1.start();
        t1.sleep(250);

        myInterface.thrusterStatus(this);

    }

    public void accelerateT() throws InterruptedException // Accelerate with threads

    {
        Interface myInterface = new Interface();

        Runnable r1 = () ->
        {
            int nowP = this.getPowNow();
            int maxP = this.getPowMax();
            int newP = nowP + 10;

            if (nowP < maxP)
            {
                this.setPowNow(newP);
            }
        };

        Thread t1 = new Thread(r1);
        t1.start();
        t1.sleep(250);

        myInterface.thrusterStatus(this);
    }

}
