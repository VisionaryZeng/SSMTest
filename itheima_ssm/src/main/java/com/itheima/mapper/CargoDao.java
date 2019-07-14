package com.itheima.mapper;

import com.itheima.domain.Cargo;

import java.util.List;

public interface CargoDao
{
    /**查询所有的商品*/
    List<Cargo> findAll();
    /**添加商品*/
    int save(Cargo cargo);
    /**更新商品*/
    int update(Cargo cargo);
    /**删除商品*/
    int delete(String id);

}
