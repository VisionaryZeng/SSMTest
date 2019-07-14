package com.itheima.controller;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.Cargo;
import com.itheima.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/pages")
public class CargoController
{
    @Autowired
    private CargoService cargoService;

    @RequestMapping("/list.do")
    public ModelAndView list(@RequestParam(defaultValue = "1") Integer pageNum,@RequestParam(defaultValue = "1") Integer pageSize)
    {
        PageInfo<Cargo> pageInfo = cargoService.findAllByPage(pageNum, pageSize);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("pageInfo",pageInfo);
        modelAndView.setViewName("product-list");
        return modelAndView;

    }




}