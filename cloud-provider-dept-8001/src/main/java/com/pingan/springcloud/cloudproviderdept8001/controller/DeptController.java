package com.pingan.springcloud.cloudproviderdept8001.controller;

import com.pingan.springcloud.entities.Dept;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DeptController
{



	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id)
	{
		Dept dept = new Dept();
		dept.setDeptno(1L);
		dept.setDb_source("数据库1");
		return dept;
	}




}
