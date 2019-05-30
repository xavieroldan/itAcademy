package com.jobs.application;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

public class JobsController
{

    private EmployeeRepository repository;

    public JobsController()
    {
        repository = new EmployeeRepository();
    }

    public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception
    {
        Employee boss = new Employee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateBoss());
        repository.addMember(boss);
    }

    public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception
    {
        Employee employee = new Employee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
        repository.addMember(employee);
    }

    public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception
    {
        Employee managerEmployee = new Employee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateManagerEmployee());
        repository.addMember(managerEmployee);
    }

    public void createVolunteer(String name, String address, String phone) throws Exception
    {
        Volunteer volunteer = new Volunteer(name, address, phone);
        repository.addMember(volunteer);
    }

    public void payAllEmployeers()
    {
        for (AbsStaffMember member : this.repository.getAllMembers())
        {
            member.pay();
        }
    }

    public String getAllEmployees()
    {
        String output = "";

        for (AbsStaffMember member : this.repository.getAllMembers())
        {

            double thisTotalPayed = member.getTotalPaid();
            String thisTotalPayedS = String.valueOf(thisTotalPayed);
            output += "\n" + member + "\t|Pagado: " + thisTotalPayedS;
        }

        return output;
    }
}
