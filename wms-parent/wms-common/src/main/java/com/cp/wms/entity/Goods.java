package com.cp.wms.entity;

import com.cp.wms.Enum.Unit;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @CLASSNAME com.cp.wms.entity
 * @DISCRIPT TODO
 * @AUTHOR dell
 * @TIME 2019-08-2019/8/27-11:32
 * @MOTTO
 * 桃花坞里桃花庵，桃花庵下桃花仙。
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
public class Goods{

    private int id;
    private String code;
    private String name;
    private String goodsType;
    private String spec;
    private String producingArea;//生产地
    private String remark;//备注
    private Unit unit;//单位
    private String createDate;
    private String createUser;
}
