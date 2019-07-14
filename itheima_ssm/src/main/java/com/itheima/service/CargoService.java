package com.itheima.service;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.Cargo;


public interface CargoService
{
    /**分页查询所有的商品*/
    PageInfo<Cargo> findAllByPage(Integer pageNum,Integer pageSize);
    /**添加商品*/
    int save(Cargo cargo);
    /**更新一个商品*/
    int update(Cargo cargo);
    /**删除一个商品*/
    int delete(String id);
}
