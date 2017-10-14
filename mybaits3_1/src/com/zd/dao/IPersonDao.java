package com.zd.dao;

import java.util.List;
import java.util.Map;

import com.zd.entity.Person;

public interface IPersonDao {
	//添加
	public void save(Person person);
	// 修改
	public void update(Person person);
	// 删除
	public void del(int pid);
	// 根据id查询
	public Person queryById(int pid);
	// 查询所有
	public List<Person> queryAll();
	// 模糊查询
	public List<Person> queryByLike(Map map);
	// 根据年龄区间查询
	public List<Person> queryByAge(Map map);
	// 查询个数
	public int queryCount();
	//查询薪资高于平均薪资的员工信息
	public List<Person> queryArg();
}
