package com.zhaopin.DBUtil;

import com.zhaopin.java.Job;
import com.zhaopin.java.User;
import javafx.scene.input.DataFormat;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by ttc on 17-11-20.
 */
public class User_DB_JDBC implements User_DB
{
    public List li ;
    private static PreparedStatement ps=null;
    private static ResultSet rs=null;
    private static String sql=null;
    private static Connection conn;
    private User t=new User();
    @Override
    public User select_userinfo(User user)
    {

        try
        {
            conn = DBUtil.connedDB();

            sql = "select * from USERS_INFO where username=?and pwd=?";

            ps = conn.prepareStatement(sql);
            ps.setString(1,user.getUsername());
            ps.setString(2,user.getPassword());

            rs = ps.executeQuery();
            while (rs.next())
            {
                user.setId(rs.getInt("userid"));
                user.setBirthday(rs.getDate("birthday"));
                user.setName(rs.getString("uname"));
                user.setSex(rs.getString("sex"));
                user.setAddress(rs.getString("address"));
                user.setEmail(rs.getString("email"));
                user.setTel(rs.getString("tel"));
                user.setEducation(rs.getString("education"));
                user.setSchool(rs.getString("school"));
                user.setDiscipline(rs.getString("disciplinel"));
                user.setPhoto(rs.getString("photo"));
                user.setExpect_sal(rs.getString("expect_sal"));
                user.setExperience(rs.getString("experience"));
            }



            DBUtil.releaseDB(ps,rs);
            return user;
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        DBUtil.releaseDB(ps,rs);
        System.out.println(t);
        return t;

    }


    @Override
    public boolean update_userinfo(User user)
    {
        conn=DBUtil.connedDB();
        sql=" UPDATE  users_info set uname=?,sex=?,birthday=?,address=?,email=?,tel=?,education=?,school=?,discipline=?,photo=?,expect_sal=?,experience=? where username=? " ;


        try
        {
            ps=conn.prepareStatement(sql);
            ps.setString(1,user.getName());
            ps.setString(2,user.getSex());
            ps.setDate(3,(Date)user.getBirthday());
            ps.setString(4,user.getAddress());
            ps.setString(5,user.getEmail());
            ps.setString(6,user.getTel());
            ps.setString(7,user.getEducation());
            ps.setString(8,user.getSchool());
            ps.setString(9,user.getDiscipline());
            ps.setString(10,user.getPhoto());
            ps.setString(11,user.getExpect_sal());
            ps.setString(12,user.getExperience());
            ps.setString(13,user.getUsername());
            int i=ps.executeUpdate();
            if(i>0)
            {
                DBUtil.releaseDB(ps);
                return true;
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }

        DBUtil.releaseDB(ps);
        return false;
    }

    @Override
    public boolean insert_user(User user)
    {
        conn=DBUtil.connedDB();
        sql=" INSERT  INTO users_info(username,pwd,uname,sex,birthday,address,email,tel,education,school,discipline,photo,expect_sal,experience) " +
                "VALUES (?,?,'无','无',null ,'无','无','无','无','无','无','无','无','无')";

        try
        {

            ps=conn.prepareStatement(sql);
            ps.setString(1,user.getUsername());
            ps.setString(2,user.getSex());
            int i=ps.executeUpdate();
            if(i>0)
            {
                DBUtil.releaseDB(ps);
                return true;
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }

        DBUtil.releaseDB(ps);
        return false;
    }
    @Override
    public List select_jobinfo()
    {
        Job job=new Job();

        try
        {
            conn = DBUtil.connedDB();

            sql = "select * from JOB_INFO ";

            ps = conn.prepareStatement(sql);


            rs = ps.executeQuery();
            while (rs.next())
            {
                  job=null;
//                user.setId(rs.getInt("userid"));
//                user.setBirthday(rs.getDate("birthday"));
//                user.setName(rs.getString("uname"));
                li.add(job);
            }



            DBUtil.releaseDB(ps,rs);
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        DBUtil.releaseDB(ps,rs);
        System.out.println(t);

return li;
    }







    @Override
    public List selectQuestion()
    {

        List<QuestionInfo> li=new ArrayList();

        try
        {
            conn = DBUtil.connedDB();

            sql = "select * from question ";

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next())
            {
                QuestionInfo question=new QuestionInfo();
//                System.out.println(rs.getString("question_title"));
                question.setQuestionId(rs.getInt("question_id"));
                question.setQuestionTitle(rs.getString("question_title"));
                question.setQuestionIntroduce(rs.getString("question_introduce"));
                question.setQuestionType(rs.getInt("question_type"));
                question.setQuestionRaiseId(rs.getInt("question_raise_id"));
                Date date= rs.getDate("question_create_time");
                SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                question.setQuestionCreateTime(s.format(date));
                question.setQuestionTopic(rs.getInt("question_topic"));
                li.add(question);
//                System.out.println(question);

            }

            DBUtil.releaseDB(ps,rs);
            return li;


        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        DBUtil.releaseDB(ps,rs);

        return null;
    }

    @Override
    public boolean insert(User user)
    {
        conn=DBUtil.connedDB();
        sql=" INSERT  INTO user_account(user_id,user_name,user_password,user_introduce) VALUES (seq_user.nextval,?,?,?)";

        try
        {
            ps=conn.prepareStatement(sql);
            ps.setString(1,user.getName());
            ps.setString(2,user.getPassword());
            ps.setString(3,"");
            int i=ps.executeUpdate();
            if(i>0)
            {
                DBUtil.releaseDB(ps);
                return true;
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }

        DBUtil.releaseDB(ps);
        return false;
    }

    @Override
    public void delete(int id)
    {
        sql=" delete from  user_info  where uno=? ";
        conn=DBUtil.connedDB();

        try
        {
            ps=conn.prepareStatement(sql);
            ps.setInt(1,id);
            int i=ps.executeUpdate();
            if(i>0)
            {
                System.out.println("删除成功");
            }
            else
            {
                System.out.println("删除失败");
            }

        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            DBUtil.releaseDB(ps);
        }

    }
}
