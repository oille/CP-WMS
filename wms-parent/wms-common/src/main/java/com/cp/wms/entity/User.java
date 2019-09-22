package com.cp.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @CLASSNAME com.cp.wechat.middleware.entity
 * @DISCRIPT TODO
 * @AUTHOR DZL
 * @TIME 2019-09-2019/9/9-20:39
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
@Data //get set toString
//@AllArgsConstructor 全参构造
@NoArgsConstructor //空参构造
@Accessors(chain=true) //链式访问
public class User{
    /** 主键ID */
    private Integer id;
    /** 是否关注 */
    private Boolean subscribe;
    private String openId;
    /** 昵称 */
    private String nickname;
    /** 性别描述 */
    private String sexDesc;
    /** 性别 */
    private int sex;
    /** 语言 */
    private String language;
    /** 市 */
    private String city;
    /** 省 */
    private String province;
    /** 国家 */
    private String country;
    /** 头像 */
    private String headImgUrl;
    /** 关注时间*/
    private Long subscribeTime;
    /** 取消关注时间 */
    private Long unsubscribeTime;
    /** 性别 */
    private String remark;
    private String groupId;
    private String subscribeScene;
    private String tagIds;
    private String qrScene;
    private String qrSceneStr;
}
