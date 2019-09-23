package com.cp.wms.controller;

import com.cp.wms.entity.Warehouse;
import com.cp.wms.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @CLASSNAME com.cp.wms.controller
 * @DISCRIPT TODO
 * @AUTHOR DZL
 * @TIME 2019-09-2019/9/8-17:23
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
@RestController
public class WarehouseController{

    @Autowired
    private WarehouseService warehouseService;

    @PostMapping("/warehouse")
    public Integer addWarehouse(Warehouse warehouse){
        Integer id = warehouseService.addWarehouse(warehouse);
        return id;


    }

    @GetMapping("/warehouse/{id}")
    public Warehouse getWarehouse(@PathVariable("id") Integer id){
        Warehouse warehouse = warehouseService.getWarehouse(id);
        return warehouse;
    }
}
