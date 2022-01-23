package cn.lger.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RegisterTemplate extends SMSTemplate{
    private String amount ;

    private String totalAmount ;
}
