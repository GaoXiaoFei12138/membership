package cn.lger.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-12-13.
 */
@Entity
@Getter
@Setter
@ToString
public class Commodity {

    @Id
    @GeneratedValue(generator="id")
    @GenericGenerator(name="id",strategy="uuid")
    private String id;
    private String commodityName;
    private Long commodityIntegral;
    private Integer commodityNumber;
    private Float commodityPrice;
}
