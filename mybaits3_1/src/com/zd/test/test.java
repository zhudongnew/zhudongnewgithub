package com.zd.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zd.dao.PersonDaoImpl;
import com.zd.entity.Person;


public class test {

	public static void main(String[] args) {
		PersonDaoImpl dao = new PersonDaoImpl();
//		//���
//		Person p = new Person(0, "С��", "��", 28, 3600, "13236563214");
//		dao.save(p);
		
		//�޸�
//		Person p = new Person(6, "С��", "��", 26, 6600, "13236563214");
//		dao.update(p);
		
		//ɾ��
//		dao.del(2);
		
		// ����id��ѯ
//		Person p = dao.queryById(3);
//		System.out.println(p);
		
		// ��ѯ����
//		List<Person> list = dao.queryAll();
//		for (Person p : list) {
//			System.out.println(p);
//		}
		
		// ģ����ѯ
//		Map map = new HashMap();
//		map.put("xing", "С"+"%");
//		List<Person> list = dao.queryByLike(map);
//		for (Person p : list) {
//			System.out.println(p);
//		}
		
		// �������������ѯ
//		Map map = new HashMap();
//		map.put("minAge", 16);
//		map.put("maxAge", 20);
//		List<Person> list = dao.queryByAge(map);
//		for (Person p : list) {
//			System.out.println(p);
//		}
		
		//�����
//		int c = dao.queryCount();
//		System.out.println("������"+c);
		
		//��ѯн�ʸ���ƽ��н�ʵ�Ա����Ϣ
		List<Person> list = dao.queryArg();
		for (Person p : list) {
			System.out.println(p);
		}
	}

}
