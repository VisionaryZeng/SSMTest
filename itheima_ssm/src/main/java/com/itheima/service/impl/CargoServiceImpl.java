package com.itheima.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.domain.Cargo;
import com.itheima.mapper.CargoDao;
import com.itheima.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CargoServiceImpl implements CargoService
{
    @Autowired
    private CargoDao cargoDao;

    /**
     * 分页查询所有的商品
     */
    @Override
    public PageInfo<Cargo> findAllByPage(Integer pageNum,Integer pageSize)
    {
        PageHelper.startPage(pageNum,pageSize);
        List<Cargo> cargoList = cargoDao.findAll();
        PageInfo<Cargo> pageInfo = new PageInfo<>(cargoList);
        return pageInfo;
    }

    /**
     * 添加商品
     *
     * @param cargo
     */
    @Override
    public int save(Cargo cargo)
    {
        String id = UUID.randomUUID().toString();
        cargo.setId(id);
        return cargoDao.save(cargo);
    }

    /**
     * 更新一个商品
     *
     * @param cargo
     */
    @Override
    public int update(Cargo cargo)
    {
        return cargoDao.update(cargo);
    }

    /**
     * 删除一个商品
     *
     * @param id
     */
    @Override
    public int delete(String id)
    {
        return cargoDao.delete(id);
    }
}