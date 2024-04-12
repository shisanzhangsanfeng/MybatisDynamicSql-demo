package com.my.mapper;

import static com.my.mapper.volunteerDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.my.entity.Volunteer;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
//import org.mybatis.dynamic.sql.util.mybatis3.CommonSelectMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface VolunteerMapper  {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    //BasicColumn[] selectList = BasicColumn.columnList(vtId, vtIntegralCount, vtAvatar, vtName, vtCardno, vtPhone, vtVillage, vtBuild, vtJoinDate, vtType, isDel, createId, createUser, createTime, updateUser, updateTime, updateId, voladdress, vtRemark);
    BasicColumn[] selectList = BasicColumn.columnList(vtId, vtIntegralCount, vtAvatar, vtName);


    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Volunteer> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Volunteer> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("volunteerResult")
    Optional<Volunteer> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @Results(id = "volunteerResult", value = {
            @Result(column = "vt_id", property = "vtId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "vt_integral_count", property = "vtIntegralCount", jdbcType = JdbcType.INTEGER),
            @Result(column = "vt_avatar", property = "vtAvatar", jdbcType = JdbcType.VARCHAR),
            @Result(column = "vt_name", property = "vtName", jdbcType = JdbcType.VARCHAR)
    })
    List<Volunteer> selectMany(SelectStatementProvider selectStatement);

/*
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @Results(id = "volunteerResult", value = {
            @Result(column = "vt_id", property = "vtId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "vt_integral_count", property = "vtIntegralCount", jdbcType = JdbcType.INTEGER),
            @Result(column = "vt_avatar", property = "vtAvatar", jdbcType = JdbcType.VARCHAR),
            @Result(column = "vt_name", property = "vtName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "vt_cardno", property = "vtCardno", jdbcType = JdbcType.VARCHAR),
            @Result(column = "vt_phone", property = "vtPhone", jdbcType = JdbcType.VARCHAR),
            @Result(column = "vt_village", property = "vtVillage", jdbcType = JdbcType.INTEGER),
            @Result(column = "vt_build", property = "vtBuild", jdbcType = JdbcType.INTEGER),
            @Result(column = "vt_join_date", property = "vtJoinDate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "vt_type", property = "vtType", jdbcType = JdbcType.INTEGER),
            @Result(column = "is_del", property = "isDel", jdbcType = JdbcType.INTEGER),
            @Result(column = "create_id", property = "createId", jdbcType = JdbcType.INTEGER),
            @Result(column = "create_user", property = "createUser", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_user", property = "updateUser", jdbcType = JdbcType.VARCHAR),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_id", property = "updateId", jdbcType = JdbcType.INTEGER),
            @Result(column = "volAddress", property = "voladdress", jdbcType = JdbcType.VARCHAR),
            @Result(column = "vt_remark", property = "vtRemark", jdbcType = JdbcType.LONGVARCHAR)
    })
    List<Volunteer> selectMany(SelectStatementProvider selectStatement);

    */


    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, volunteer, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, volunteer, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer vtId_) {
        return delete(c -> 
            c.where(vtId, isEqualTo(vtId_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Volunteer record) {
        return MyBatis3Utils.insert(this::insert, record, volunteer, c ->
            c.map(vtId).toProperty("vtId")
            .map(vtIntegralCount).toProperty("vtIntegralCount")
            .map(vtAvatar).toProperty("vtAvatar")
            .map(vtName).toProperty("vtName")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<Volunteer> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, volunteer, c ->
            c.map(vtId).toProperty("vtId")
            .map(vtIntegralCount).toProperty("vtIntegralCount")
            .map(vtAvatar).toProperty("vtAvatar")
            .map(vtName).toProperty("vtName")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Volunteer record) {
        return MyBatis3Utils.insert(this::insert, record, volunteer, c ->
            c.map(vtId).toPropertyWhenPresent("vtId", record::getVtId)
            .map(vtIntegralCount).toPropertyWhenPresent("vtIntegralCount", record::getVtIntegralCount)
            .map(vtAvatar).toPropertyWhenPresent("vtAvatar", record::getVtAvatar)
            .map(vtName).toPropertyWhenPresent("vtName", record::getVtName)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Volunteer> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, volunteer, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Volunteer> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, volunteer, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Volunteer> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, volunteer, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Volunteer> selectByPrimaryKey(Integer vtId_) {
        return selectOne(c ->
            c.where(vtId, isEqualTo(vtId_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, volunteer, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Volunteer record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(vtId).equalTo(record::getVtId)
                .set(vtIntegralCount).equalTo(record::getVtIntegralCount)
                .set(vtAvatar).equalTo(record::getVtAvatar)
                .set(vtName).equalTo(record::getVtName);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Volunteer record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(vtId).equalToWhenPresent(record::getVtId)
                .set(vtIntegralCount).equalToWhenPresent(record::getVtIntegralCount)
                .set(vtAvatar).equalToWhenPresent(record::getVtAvatar)
                .set(vtName).equalToWhenPresent(record::getVtName)
                ;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Volunteer record) {
        return update(c ->
            c.set(vtIntegralCount).equalTo(record::getVtIntegralCount)
            .set(vtAvatar).equalTo(record::getVtAvatar)
            .set(vtName).equalTo(record::getVtName)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Volunteer record) {
        return update(c ->
            c.set(vtIntegralCount).equalToWhenPresent(record::getVtIntegralCount)
            .set(vtAvatar).equalToWhenPresent(record::getVtAvatar)
            .set(vtName).equalToWhenPresent(record::getVtName)

            .where(vtId, isEqualTo(record::getVtId))
        );
    }
}