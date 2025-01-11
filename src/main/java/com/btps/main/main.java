package com.btps.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.btps.beans.Student;
import com.btps.mappers.StudentRowMapper;
import com.btps.resouces.SpringConfigFile;

/**
 * Hello world!
 *
 */
public class main 
{
    public static void main( String[] args )
    {
//        int std_rollno = 101;
//        String std_name = "deepak";
//        float std_marks = 91.5f;
//        
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
//        
//        String insert_sql_query = "INSERT INTO student VALUES(?,?,?)";
//        
//        int count =jdbcTemplate.update(insert_sql_query , std_rollno,std_name,std_marks);
//        
//        if(count>0) {
//        	System.out.println("Insertion Success");
//        }else {
//        	System.out.println("Insertion Failed");
//        }
//        
        ///Update
        
//        float marks = 98.3f;
//        int rollno = 101;
//        
//        String update_sql_query = "Update student set std_marks=? where std_roll=?";
//        
//        int count = jdbcTemplate.update(update_sql_query,marks,rollno);
//        
//        if(count>0) {
//        	System.out.println("Updation Success");
//        }else {
//        	System.out.println("Updation Failed");
//        }
//        
        // Delete Opertion
        
//        int rollno = 101;
//        
//        String delete_sql_query = "delete from student where std_roll=?";
//        
//        int count = jdbcTemplate.update(delete_sql_query,rollno);
//        
//        if(count>0) {
//        	System.out.println("Deletion performed");
//        }else {
//        	System.out.println("Deletion Failed");
//        }
        
        ///--------------- SELECT OPERATION-------
        
        String select_sql_query = "select * from student";
        
         List<Student> std_lst= jdbcTemplate.query(select_sql_query, new StudentRowMapper());
         
         for(Student std: std_lst) {
        	 System.out.println(std);
         }
        
    }
}
