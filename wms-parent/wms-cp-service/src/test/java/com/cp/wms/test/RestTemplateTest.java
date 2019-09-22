package com.cp.wms.test;

import com.cp.wms.com.cp.wms.util.RestTemplateUtil;
import com.cp.wms.entity.User;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @CLASSNAME com.cp.wms.test
 * @DISCRIPT TODO
 * @AUTHOR DZL
 * @TIME 2019-09-2019/9/10-10:26
 * @MOTTO 桃花坞里桃花庵，桃花庵下桃花仙。
 * 桃花仙人种桃树，又摘桃花换酒钱。
 * 酒醒只在花前坐，酒醉还来花下眠。
 * 半醉半醒日复日，花落花开年复年。
 * 但愿老死花酒间，不愿鞠躬车马前。
 * 车尘马足富者事，酒盏花枝隐士缘。
 * 若将显者比隐士，一在平地一在天。
 * 若将花酒比车马，彼何碌碌我何闲。
 * 世人笑我太疯癫，我笑他人看不穿。
 * 不见五陵豪杰墓，无花无酒锄作田。
 */
public class RestTemplateTest{

    @Test
    public void testJavaObj() {
        User user = new User();
        user.setCity("ggg");
        user.setCountry("中国");
        user.setGroupId("111");
        user.setHeadImgUrl("==========");
        user.setLanguage("---------");

        RestTemplate restTemplate = RestTemplateUtil.getInstance("utf-8");
        String url = "http://127.0.0.1:5001/user";
        ResponseEntity result = restTemplate.postForEntity(url, user, User.class);
        System.out.println(result);
    }
}
