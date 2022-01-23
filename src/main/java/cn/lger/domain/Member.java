package cn.lger.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-12-06.
 */
@Entity
@Getter
@Setter
@ToString
public class Member {

    @Id
    private String id;
    private String iconPath;
    private String memberName;
    private String password;
    private String phone;
    private LocalDate birthday;
    private String sex;
    //会员等级
    @ManyToOne
    private MemberGrade memberGrade;
    //会员积分
    private Long memberIntegral;
    //会员余额
    private Float balance;
    //会员状态 挂失、停用、正常
    private String state;
    private String email;

    public void setBirthday(String birthday) {
        this.birthday = LocalDate.parse(birthday);
    }
}
