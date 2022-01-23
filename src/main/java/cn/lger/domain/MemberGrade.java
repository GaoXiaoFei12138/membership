package cn.lger.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-12-06.
 */
@Entity
@Getter
@Setter
@ToString
public class MemberGrade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    //等级名
    private String gradeName;
    //折扣
    private Float discount;
    //备注信息
    private String comment = "";
}
