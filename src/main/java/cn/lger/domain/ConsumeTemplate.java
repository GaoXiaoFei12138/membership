package cn.lger.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ConsumeTemplate extends SMSTemplate{
    private String amount ;

    private String totalAmount ;

    private String balance ;

    private String totalBalance ;
}
