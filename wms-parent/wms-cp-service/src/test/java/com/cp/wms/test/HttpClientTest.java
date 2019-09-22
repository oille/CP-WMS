package com.cp.wms.test;

import com.cp.wms.com.cp.wms.util.HttpClientUtil;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @CLASSNAME com.cp.wms.test
 * @DISCRIPT TODO
 * @AUTHOR DZL
 * @TIME 2019-09-2019/9/9-9:58
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
public class HttpClientTest{

    @Test
    public void testSendHttpPost1() {
        String responseContent = HttpClientUtil.getInstance()
                .sendHttpPost("http://127.0.0.1:8888/aquazz/company!getAll");
        System.out.println("response Content" + responseContent);
    }

    @Test
    public void testSendHttpPost2() {
        Integer id = 1686393;
        String name = "福州大福公司";
        String responseContent = HttpClientUtil.getInstance()
                .sendHttpPost("http://127.0.0.1:8888/aquazz/company!getAll?e.id="+id+"&e.name="+name+"");
        System.out.println("response Content" + responseContent);
    }

    @Test
    public void testSendHttpPost3() {
        Map<String, String> maps = new HashMap<String, String>();
        maps.put("username", "test01");
        maps.put("password", "123456");
        String responseContent = HttpClientUtil.getInstance().sendHttpPost("http://localhost:8089/test/send", maps);
        System.out.println("reponse content:" + responseContent);
    }

    @Test
    public void testSendHttpPost4() {
        Map<String, String> maps = new HashMap<String, String>();
        maps.put("username", "test01");
        maps.put("password", "123456");
        List<File> fileLists = new ArrayList<File>();
        fileLists.add(new File("D://test//httpclient//1.png"));
        fileLists.add(new File("D://test//httpclient//1.txt"));
        String responseContent = HttpClientUtil.getInstance().sendHttpPost("http://localhost:8089/test/sendpost/file",
                maps, fileLists);
        System.out.println("reponse content:" + responseContent);
    }

    @Test
    public void testSendHttpGet() {
        String responseContent = HttpClientUtil.getInstance()
                .sendHttpGet("http://localhost:8089/test/send?username=test01&password=123456");
        System.out.println("reponse content:" + responseContent);
    }

    @Test
    public void testSendHttpsGet() {
        String responseContent = HttpClientUtil.getInstance().sendHttpsGet("https://www.baidu.com");
        System.out.println("reponse content:" + responseContent);
    }
}
