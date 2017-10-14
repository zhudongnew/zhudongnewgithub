package com.zd.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.zd.entity.Person;

public class PersonDaoImpl implements IPersonDao{

	//添加
	public void save(Person person) {
		try {
			InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
			SqlSession session = sessionFactory.openSession(true);
			session.insert("save", person);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//修改
	public void update(Person person) {
		try {
			InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
			SqlSession session = sessionFactory.openSession(true);
			session.update("upd", person);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 删除
	public void del(int pid) {
		try {
			InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
			SqlSession session = sessionFactory.openSession(true);
			session.delete("del", pid);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 根据id查询
	public Person queryById(int pid) {
		Person p = null;
		try {
			InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
			SqlSession session = sessionFactory.openSession();
			p = session.selectOne("queryById", pid);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return p;
	}

	// 查询所有
	public List<Person> queryAll() {
		List<Person> plist = new ArrayList<Person>();
		try {
			InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
			SqlSession session = sessionFactory.openSession();
			plist = session.selectList("queryAll");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return plist;
	}

	// 模糊查询
	public List<Person> queryByLike(Map map) {
		List<Person> plist = new ArrayList<Person>();
		try {
			InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
			SqlSession session = sessionFactory.openSession();
			plist = session.selectList("queryByLike",map);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return plist;
	}

	// 根据年龄区间查询
	public List<Person> queryByAge(Map map) {
		List<Person> plist = new ArrayList<Person>();
		try {
			InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
			SqlSession session = sessionFactory.openSession();
			plist = session.selectList("queryByAge",map);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return plist;
	}

	// 查询个数
	public int queryCount() {
		int count = 0;
		try {
			InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
			SqlSession session = sessionFactory.openSession();
			count = session.selectOne("count");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return count;
	}

	//查询薪资高于平均薪资的员工信息
	public List<Person> queryArg() {
		List<Person> plist = new ArrayList<Person>();
		try {
			InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
			SqlSession session = sessionFactory.openSession();
			plist = session.selectList("queryArg");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return plist;
	}

}
