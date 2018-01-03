package com.zhaopin.java;

import java.util.Date;

/**
 * Created by ttc on 17-11-20.
 */
public class User
{
    private int id;
    private String username ;  //用户名
    private String password ;  //密码
    private String name   ;    //姓名
    private String sex   ;    // 性别
    private Date birthday  ; //出生日期
    private String address  ;  //现居住地
    private String email   ;    //电子邮箱
    private String tel     ;   // 电话
    private String education ;  //学历
    private String school    ;  //学校
    private String discipline;  // 专业
    private String photo      ; // 照片
    private String expect_sal ; //期望月薪
    private String experience ; // 经验


    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public Date getBirthday()
    {
        return birthday;
    }

    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getTel()
    {
        return tel;
    }

    public void setTel(String tel)
    {
        this.tel = tel;
    }

    public String getEducation()
    {
        return education;
    }

    public void setEducation(String education)
    {
        this.education = education;
    }

    public String getSchool()
    {
        return school;
    }

    public void setSchool(String school)
    {
        this.school = school;
    }

    public String getDiscipline()
    {
        return discipline;
    }

    public void setDiscipline(String discipline)
    {
        this.discipline = discipline;
    }

    public String getPhoto()
    {
        return photo;
    }

    public void setPhoto(String photo)
    {
        this.photo = photo;
    }

    public String getExpect_sal()
    {
        return expect_sal;
    }

    public void setExpect_sal(String expect_sal)
    {
        this.expect_sal = expect_sal;
    }

    public String getExperience()
    {
        return experience;
    }

    public void setExperience(String experience)
    {
        this.experience = experience;
    }
}