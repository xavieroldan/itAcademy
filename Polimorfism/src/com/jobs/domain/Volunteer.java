package com.jobs.domain;

public class Volunteer extends AbsStaffMember
{

    public Volunteer(String name, String address, String phone) throws Exception
    {
        super(name, address, phone);
    }

    @Override
    public void pay()
    {
        totalPaid = 0;
    }

    @Override
    public String toString()
    {
        return "Tipo: becario  |Nombre: " + name + "\t|Sueldo: --.-";
    }

}
