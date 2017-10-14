package com.zd.dao;

import java.util.List;
import java.util.Map;

import com.zd.entity.Person;

public interface IPersonDao {
	//���
	public void save(Person person);
	// �޸�
	public void update(Person person);
	// ɾ��
	public void del(int pid);
	// ����id��ѯ
	public Person queryById(int pid);
	// ��ѯ����
	public List<Person> queryAll();
	// ģ����ѯ
	public List<Person> queryByLike(Map map);
	// �������������ѯ
	public List<Person> queryByAge(Map map);
	// ��ѯ����
	public int queryCount();
	//��ѯн�ʸ���ƽ��н�ʵ�Ա����Ϣ
	public List<Person> queryArg();
}
