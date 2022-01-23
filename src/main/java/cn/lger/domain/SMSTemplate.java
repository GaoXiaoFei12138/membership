package cn.lger.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SMSTemplate {
    private String phone;

    private String templateId;

    private String memberName;
}
