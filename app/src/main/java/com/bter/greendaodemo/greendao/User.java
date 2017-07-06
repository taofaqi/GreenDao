package com.bter.greendaodemo.greendao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Transient;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by taofaqi on 2017/7/6.
 *
 * @Entity 标识实体类，GreenDao会映射成sqlite中的一个表
 * @Id 标识主键
 * @Property 标识该属性在表中对应的列名称
 * @Transient 标识该属性将不会映射到表中，也就是没有这列
 */

@Entity
public class User {
    @Id
    private Long id;

    @Property(nameInDb = "sex")
    private int memberSex;//性别

    @Transient
    private String memberDetailAddr;//用户的详细地址

    private String memberNickname;//昵称
    private String memberLastX;//X币
    private String memberIcon;//头像地址链接
    private String memberMobile;//手机号
    private int memberId;//用户ID

    private String memberLastExperience;//用户经验值
    private String memberLevelName;//用户等级昵称
    private long memberBirthday;//用户生日
    private String memberProvince;//用户所在地

    @Generated(hash = 199140408)
    public User(Long id, int memberSex, String memberNickname, String memberLastX,
                String memberIcon, String memberMobile, int memberId,
                String memberLastExperience, String memberLevelName,
                long memberBirthday, String memberProvince) {
        this.id = id;
        this.memberSex = memberSex;
        this.memberNickname = memberNickname;
        this.memberLastX = memberLastX;
        this.memberIcon = memberIcon;
        this.memberMobile = memberMobile;
        this.memberId = memberId;
        this.memberLastExperience = memberLastExperience;
        this.memberLevelName = memberLevelName;
        this.memberBirthday = memberBirthday;
        this.memberProvince = memberProvince;
    }

    @Generated(hash = 586692638)
    public User() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMemberSex() {
        return this.memberSex;
    }

    public void setMemberSex(int memberSex) {
        this.memberSex = memberSex;
    }

    public String getMemberLastX() {
        return this.memberLastX;
    }

    public void setMemberLastX(String memberLastX) {
        this.memberLastX = memberLastX;
    }

    public String getMemberNickname() {
        return this.memberNickname;
    }

    public void setMemberNickname(String memberNickname) {
        this.memberNickname = memberNickname;
    }

    public String getMemberIcon() {
        return this.memberIcon;
    }

    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon;
    }

    public String getMemberMobile() {
        return this.memberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
    }

    public int getMemberId() {
        return this.memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberLastExperience() {
        return this.memberLastExperience;
    }

    public void setMemberLastExperience(String memberLastExperience) {
        this.memberLastExperience = memberLastExperience;
    }

    public String getMemberLevelName() {
        return this.memberLevelName;
    }

    public void setMemberLevelName(String memberLevelName) {
        this.memberLevelName = memberLevelName;
    }

    public long getMemberBirthday() {
        return this.memberBirthday;
    }

    public void setMemberBirthday(long memberBirthday) {
        this.memberBirthday = memberBirthday;
    }

    public String getMemberProvince() {
        return this.memberProvince;
    }

    public void setMemberProvince(String memberProvince) {
        this.memberProvince = memberProvince;
    }
}