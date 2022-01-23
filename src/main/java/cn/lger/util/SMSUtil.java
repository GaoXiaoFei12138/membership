package cn.lger.util;

import cn.lger.domain.ConsumeTemplate;
import cn.lger.domain.RegisterTemplate;
import cn.lger.domain.SMSTemplate;
import org.apache.http.HttpResponse;

import java.util.HashMap;
import java.util.Map;

public class SMSUtil {
    private static final String host = "https://gyytz.market.alicloudapi.com";
    private static final String path = "/sms/smsSend";
    private static final String method = "POST";
    private static final String appcode = "bff278fefd2c44a9ae87b066c41778a5";
    private static final String smsSignId = "cc560fbd523b4f15a9a1852e696bd6d2";

    public static void sendSMS(SMSTemplate smsTemplate) {
        String param = null;
        if (smsTemplate instanceof ConsumeTemplate) {
            ConsumeTemplate consumeTemplate = (ConsumeTemplate) smsTemplate;
            param = "**memberName**:" + consumeTemplate.getMemberName() + ","
                    + "**amount**:" + consumeTemplate.getAmount() + ","
                    + "**totalAmount**:" + consumeTemplate.getTotalAmount() + ","
                    + " **balance**:" + consumeTemplate.getBalance() + ","
                    + "**totalBalance**:" + consumeTemplate.getTotalBalance();
            smsTemplate.setTemplateId("986559a69a964296a85515e2bbd4f1a8");
        }

        if (smsTemplate instanceof RegisterTemplate) {
            RegisterTemplate registerTemplate = (RegisterTemplate) smsTemplate;
            param = "**memberName**:" + registerTemplate.getMemberName() + ","
                    + "**amount**:" + registerTemplate.getAmount()
                    + "**totalAmount**:" + registerTemplate.getTotalAmount();
            smsTemplate.setTemplateId("7a946c7a25fb45f6aa3974fbcaf4ef30");
        }

        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<>();
        querys.put("mobile", smsTemplate.getPhone());
        querys.put("param", param);
        querys.put("smsSignId", smsSignId);
        querys.put("templateId", smsTemplate.getTemplateId());

        Map<String, String> bodys = new HashMap<>();


        try {
            /**
             * 重要提示如下:
             * HttpUtils请从
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
             * 下载
             *
             * 相应的依赖请参照
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
             */
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            System.out.println(response.toString());
            //获取response的body
            //System.out.println(EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
