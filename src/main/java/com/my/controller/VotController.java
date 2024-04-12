package com.my.controller;

import com.my.entity.Volunteer;
import com.my.mapper.VolunteerMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static com.my.mapper.volunteerDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static org.mybatis.dynamic.sql.SqlBuilder.isLike;

@RestController
@RequestMapping("/importDataDynamicSQL")
public class VotController {
    @Autowired
    //@Autowired(required = false)
    private VolunteerMapper volunteerMapper;


    /**
    查询指定列
     */
    @GetMapping("/list01")
    public List<Volunteer> list( ) {
        SelectStatementProvider select = SqlBuilder.select(vtId)
                .from(volunteer)
                .build()
                .render(RenderingStrategies.MYBATIS3);

        //List<volunteer> list = volunteerService.list1();
        return volunteerMapper.selectMany(select);
    }



    /**
       查询找所有列
        */
    @GetMapping("/list02")
    public List<Volunteer> list02( ) {
        SelectStatementProvider select = SqlBuilder.select(volunteerMapper.selectList)
                .from(volunteer)
                .build()
                .render(RenderingStrategies.MYBATIS3);

        System.out.println("=========="+select.toString());

        return volunteerMapper.selectMany(select);
    }

    /**


     * @return
     */
    @PostMapping("/list03")
    public List<Volunteer> list3(@RequestBody(required = false) Volunteer stu) {
        SelectStatementProvider select = SqlBuilder.select(volunteerMapper.selectList)
                .from(volunteer)
                .where(vtName, isLike("%" + stu.getVtName() + "%"))
                .and(vtName, isEqualTo("1"))
                //.or(sex, isEqualTo("女"))
                .orderBy(vtName)
                .build()
                .render(RenderingStrategies.MYBATIS3);
        return volunteerMapper.selectMany(select);
    }

    /**
     * 新增单条添加
     * @return
     */

    @PostMapping("/votAdd01")
    public int votAdd01(@RequestBody(required = false) Volunteer stu) {

        return volunteerMapper.insert(stu);
    }

    /**
     * 批量新增
     * @param
     * @return
     */

    @PostMapping("/votAdd02")
    public int votAdd02(@RequestBody(required = false) List<Volunteer> votList) {

        return volunteerMapper.insertMultiple(votList);
    }

    /**
     * 十万条插入性能测试
     * 批量新增
     * @param
     * @return
     */

    @PostMapping("/votAdd03")
    public String votAdd03() {
        List<Volunteer> votList =new ArrayList<>();
        Volunteer volt=new Volunteer();
        int count=10;
        for(int i=0;i<count;i++){

            volt.setVtAvatar("图片地址"+i);
            volt.setVtIntegralCount(i);
            volt.setVtName("姓名"+i);
            votList.add(volt);
        }
        LocalDateTime currentTimeStart = LocalDateTime.now();
        int addAllFlag=volunteerMapper.insertMultiple(votList);
        LocalDateTime currentTimeEND = LocalDateTime.now();


        Duration duration = Duration.between(currentTimeStart, currentTimeEND);

        return"开始时间：" +currentTimeStart +"结束时间："+currentTimeEND +"时间差值(秒):"+duration.getSeconds();
    }





}
