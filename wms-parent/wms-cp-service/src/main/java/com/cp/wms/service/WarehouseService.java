package com.cp.wms.service;

import com.cp.wms.entity.Warehouse;
import com.cp.wms.exception.EPAException;
import com.cp.wms.mapper.WarehouseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WarehouseService{

    @Autowired
    private WarehouseMapper warehouseMapper;

    /**
     * 保存一个对象
     * @param warehouse
     * @return
     */
    public Integer addWarehouse(Warehouse warehouse){
        if(warehouse == null)
            throw new EPAException("对象不能为空");
        warehouseMapper.insert(warehouse);
        return warehouse.getId();
    }

    /**
     * 更新一个对象
     * @param warehouse
     * @return
     */
    public Warehouse updateWarehouse(Warehouse warehouse){
        if(warehouse == null)
            throw new EPAException("对象不能为空");
        warehouseMapper.updateById(warehouse);
        return warehouse;
    }

    /**
     * 查询一个对象
     * @param id
     * @return
     */
    public Warehouse getWarehouse(Integer id){
        if(id == null)
            throw new EPAException("ID为空");
        Warehouse warehouse = warehouseMapper.selectById(id);
        return warehouse;
    }

    /**
     * 查询一组个对象
     * @param ids
     * @return
     */
    public List<Warehouse> getListWarehouse(List<Integer> ids){
        if(ids == null || ids.size()==0)
            throw new EPAException("ID为空");
        List<Warehouse> wlist = warehouseMapper.selectBatchIds(ids);
        return wlist;
    }

    /**
     * 删除一个对象
     * @param id
     * @return
     */
    public int deleteWarehouse(Integer id){
        if(id == null)
            throw new EPAException("ID不能为空");
        return warehouseMapper.deleteById(id);
    }
}
