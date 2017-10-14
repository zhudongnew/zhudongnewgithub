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

	//���
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

	//�޸�
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

	// ɾ��
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

	// ����id��ѯ
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

	// ��ѯ����
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

	// ģ����ѯ
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

	// �������������ѯ
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

	// ��ѯ����
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

	//��ѯн�ʸ���ƽ��н�ʵ�Ա����Ϣ
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
