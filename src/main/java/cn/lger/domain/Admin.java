package cn.lger.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-12-13.
 */
@Entity
@Getter
@Setter
@ToString
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String username;
    private String password;
    private String role;
    private String email;
    private String phone;
}
