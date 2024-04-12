package com.my.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class volunteerDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final volunteer volunteer = new volunteer();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> vtId = volunteer.vtId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> vtIntegralCount = volunteer.vtIntegralCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> vtAvatar = volunteer.vtAvatar;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> vtName = volunteer.vtName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> vtCardno = volunteer.vtCardno;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> vtPhone = volunteer.vtPhone;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> vtVillage = volunteer.vtVillage;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> vtBuild = volunteer.vtBuild;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> vtJoinDate = volunteer.vtJoinDate;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> vtType = volunteer.vtType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> isDel = volunteer.isDel;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> createId = volunteer.createId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> createUser = volunteer.createUser;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createTime = volunteer.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> updateUser = volunteer.updateUser;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> updateTime = volunteer.updateTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> updateId = volunteer.updateId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> voladdress = volunteer.voladdress;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> vtRemark = volunteer.vtRemark;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class volunteer extends SqlTable {
        public final SqlColumn<Integer> vtId = column("vt_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> vtIntegralCount = column("vt_integral_count", JDBCType.INTEGER);

        public final SqlColumn<String> vtAvatar = column("vt_avatar", JDBCType.VARCHAR);

        public final SqlColumn<String> vtName = column("vt_name", JDBCType.VARCHAR);

        public final SqlColumn<String> vtCardno = column("vt_cardno", JDBCType.VARCHAR);

        public final SqlColumn<String> vtPhone = column("vt_phone", JDBCType.VARCHAR);

        public final SqlColumn<Integer> vtVillage = column("vt_village", JDBCType.INTEGER);

        public final SqlColumn<Integer> vtBuild = column("vt_build", JDBCType.INTEGER);

        public final SqlColumn<Date> vtJoinDate = column("vt_join_date", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> vtType = column("vt_type", JDBCType.INTEGER);

        public final SqlColumn<Integer> isDel = column("is_del", JDBCType.INTEGER);

        public final SqlColumn<Integer> createId = column("create_id", JDBCType.INTEGER);

        public final SqlColumn<String> createUser = column("create_user", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> updateUser = column("update_user", JDBCType.VARCHAR);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> updateId = column("update_id", JDBCType.INTEGER);

        public final SqlColumn<String> voladdress = column("volAddress", JDBCType.VARCHAR);

        public final SqlColumn<String> vtRemark = column("vt_remark", JDBCType.LONGVARCHAR);

        public volunteer() {
            super("volunteer");
        }
    }
}