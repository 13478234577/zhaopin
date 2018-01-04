package com.zhaopin.java;

import java.sql.Date;

/**
 * Created by ttc on 18-1-3.
 */
public class Job
{

    private int  id;
    private String jobname;
    private String company_name; //公司名
    private String company_address;
    private String require_education;// 要求学历
    private String sal;
    private String experience; // 经验
    private Date date;
    private String other;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getJobname()
    {
        return jobname;
    }

    public void setJobname(String jobname)
    {
        this.jobname = jobname;
    }

    public String getCompany_name()
    {
        return company_name;
    }

    public void setCompany_name(String company_name)
    {
        this.company_name = company_name;
    }

    public String getCompany_address()
    {
        return company_address;
    }

    public void setCompany_address(String company_address)
    {
        this.company_address = company_address;
    }

    public String getRequire_education()
    {
        return require_education;
    }

    public void setRequire_education(String require_education)
    {
        this.require_education = require_education;
    }

    public String getSal()
    {
        return sal;
    }

    public void setSal(String sal)
    {
        this.sal = sal;
    }

    public String getExperience()
    {
        return experience;
    }

    public void setExperience(String experience)
    {
        this.experience = experience;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public String getOther()
    {
        return other;
    }

    public void setOther(String other)
    {
        this.other = other;
    }
}
