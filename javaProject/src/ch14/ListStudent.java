package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListStudent {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		list.add(new Student("202201","��ö��","����",1,"�ڱ���"));
		list.add(new Student("202202","����ȣ","����",2,"�ֱ���"));
		list.add(new Student("202203","ȫ�浿","����",3,"�豳��"));
		System.out.println("�й�\t�̸�\t����\t�г�\t��������");
		/*for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);//����Ʈ.get(�ε���)
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()+"\t"+
			s.getYear()+"\t"+s.getProfessor());
		}*/
		for (Student s : list) {
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()+"\t"+
					s.getYear()+"\t"+s.getProfessor());
		}
	}
}
