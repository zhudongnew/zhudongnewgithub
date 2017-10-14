package com.zd.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zd.dao.PersonDaoImpl;
import com.zd.entity.Person;


public class test {

	public static void main(String[] args) {
		PersonDaoImpl dao = new PersonDaoImpl();
//		//添加
//		Person p = new Person(0, "小明", "男", 28, 3600, "13236563214");
//		dao.save(p);
		
		//修改
//		Person p = new Person(6, "小明", "男", 26, 6600, "13236563214");
//		dao.update(p);
		
		//删除
//		dao.del(2);
		
		// 根据id查询
//		Person p = dao.queryById(3);
//		System.out.println(p);
		
		// 查询所有
//		List<Person> list = dao.queryAll();
//		for (Person p : list) {
//			System.out.println(p);
//		}
		
		// 模糊查询
//		Map map = new HashMap();
//		map.put("xing", "小"+"%");
//		List<Person> list = dao.queryByLike(map);
//		for (Person p : list) {
//			System.out.println(p);
//		}
		
		// 根据年龄区间查询
//		Map map = new HashMap();
//		map.put("minAge", 16);
//		map.put("maxAge", 20);
//		List<Person> list = dao.queryByAge(map);
//		for (Person p : list) {
//			System.out.println(p);
//		}
		
		//查个数
//		int c = dao.queryCount();
//		System.out.println("个数："+c);
		
		//查询薪资高于平均薪资的员工信息
		List<Person> list = dao.queryArg();
		for (Person p : list) {
			System.out.println(p);
		}
	}

}
