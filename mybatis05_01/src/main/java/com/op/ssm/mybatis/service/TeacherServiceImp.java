package com.op.ssm.mybatis.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.op.ssm.mybatis.mapper.StudentDao;
import com.op.ssm.mybatis.mapper.TeacherDao;
import com.op.ssm.mybatis.pojo.Teacher;
import com.op.ssm.mybatis.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @version : 1.0
 * @File : com.op.ssm.mybatis.service.TeacherServiceImp
 * @Author : cjgong
 * @Time : 2022/6/12 15:51
 * @desc :
 */

public class TeacherServiceImp implements TeacherService {
    private TeacherDao teacherDao;


    public TeacherServiceImp() {
        // 获取sqlSession
        SqlSession sqlSession = MybatisUtil.getSqlSession(true);
        // 通过sqlSession获取接口实现类
        TeacherDao teacherDaoImp = sqlSession.getMapper(TeacherDao.class);
        this.teacherDao = teacherDaoImp;
    }

    /*
    *
    * pageNum:请求的是第几页
    * pageSize:分页单位
    * */
    @Override
    public PageInfo<Teacher> findTeacher(int pageNum, int pageSize){
        /*
        * 修改了下一行代码执行的sql语句
        *    先查询该表的总记录数
        *    在下面执行sql语句的后面添加  limit
        * */
        Page<Teacher> teacherPage = PageHelper.startPage(pageNum, pageSize);
        List<Teacher> teacherList = teacherDao.selectTable02();
        PageInfo<Teacher> teacherPageInfo = new PageInfo<>(teacherList);

        return teacherPageInfo;

        // 获取页面中所要展示的数据
        //List<Teacher> result01 = teacherPageInfo.getList();
        //// 获取当前页
        //System.out.println("获取到当前页："+teacherPageInfo.getPageNum());
        //System.out.println("获取分页单位："+teacherPageInfo.getPageSize());
        //System.out.println("获取总页数："+teacherPageInfo.getPages());
        //System.out.println("获取上一页的页号："+ (teacherPageInfo.isIsFirstPage()?1:teacherPageInfo.getPrePage()));
        //System.out.println("获取下一页的页号："+ (teacherPageInfo.isIsLastPage()?teacherPageInfo.getPages():teacherPageInfo.getNextPage()));
    }
}
