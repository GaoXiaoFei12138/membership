package cn.lger.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-12-17.
 */
@Entity
@Getter
@Setter
@ToString
public class ExchangeRecord {

    @Id
    @GeneratedValue(generator="id")
    @GenericGenerator(name="id",strategy="uuid")
    private String id;
    @ManyToOne
    private Member member;
    @ManyToOne
    private Gift gift;
}
