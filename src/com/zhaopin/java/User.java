package com.zhaopin.java;

import java.util.Date;

/**
 * Created by ttc on 17-11-20.
 */
public class User
{
    private int id;
    private String username ;  //�û���
    private String password ;  //����
    private String name   ;    //����
    private String sex   ;    // �Ա�
    private Date birthday  ; //��������
    private String address  ;  //�־�ס��
    private String email   ;    //��������
    private String tel     ;   // �绰
    private String education ;  //ѧ��
    private String school    ;  //ѧУ
    private String discipline;  // רҵ
    private String photo      ; // ��Ƭ
    private String expect_sal ; //������н
    private String experience ; // ����


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