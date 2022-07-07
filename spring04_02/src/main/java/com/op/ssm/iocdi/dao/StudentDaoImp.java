package com.op.ssm.iocdi.dao;

import com.op.ssm.iocdi.pojo.Student;
import com.op.ssm.iocdi.util.JDBCUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @version : 1.0
 * @File : com.op.ssm.iocdi.dao.StudentDaoImp
 * @Author : cjgong
 * @Time : 2022/5/29 15:50
 * @desc :
 */
@Slf4j
@Repository("studentDao")
public class StudentDaoImp implements StudentDao {

    //  spring框架里关于jdbc的工具类
    private JdbcTemplate jdbcTemplate;

    @Resource(name = "dataSource")
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public int insertTable(Student student) {
        log.debug("StudentDaoImp>>>insertTable start ……");
        Connection connection = JDBCUtil.getConnection();
        PreparedStatement preparedStatement=null;
        String sql="INSERT INTO `t_student` VALUES(NULL,?,?,?);";
        int result = 0;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,student.getStudent_name());
            preparedStatement.setString(2,student.getStudent_sex());
            preparedStatement.setDouble(3,student.getStudent_account());

            result = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally{
            JDBCUtil.close(connection,preparedStatement,null);
        }
        log.info("所影响的行数为："+result);
        log.debug("StudentDaoImp>>>insertTable end ……");
        return result;
    }
    @Override
    public int updateTable(Student student,double salary){
        log.debug("StudentDaoImp>>>updateTable start ……");
        String sql="UPDATE `t_student` SET `t_student`.`student_account`=`t_student`.`student_account`+ ? WHERE `t_student`.`student_id`=?";
        int result = jdbcTemplate.update(sql, salary, student.getStudent_id());
        log.info("所影响的行数为："+result);
        log.debug("StudentDaoImp>>>updateTable end ……");
        return result;
    }
    @Override
    public int deleteTable(Student student){
        log.debug("StudentDaoImp>>>deleteTable start ……");
        log.info("所影响的行数为：3");
        log.debug("StudentDaoImp>>>deleteTable end ……");
        return 3;
    }
    @Override
    public List  selectTable(){
        log.debug("StudentDaoImp>>>selectTable start ……");
        String sql="SELECT `t_student`.`student_id`,`t_student`.`student_name`,`t_student`.`student_sex`,`t_student`.`student_account`\n" +
                "FROM `t_student`";
        List<Map<String, Object>> studentList = jdbcTemplate.queryForList(sql);
        log.info("查询到结果记录数为："+studentList.size());
        log.debug("StudentDaoImp>>>selectTable end ……");
        return studentList;
    }
}
