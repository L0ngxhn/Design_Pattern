package test;

import component.Hero;
import component.JaVen4;
import decorator.Skill_Q;
import decorator.Skill_R;
import decorator.Skills;

public class Test {
	public static void main(String[] args) {
		// ��װ�ε����
		Hero hero = new JaVen4("�������ǻ���");
		// װ�������� ��װ����� ������
		Hero skills = new Skills(hero);  // ��Componentװ�����¹���
		
		Hero q = new Skill_Q(skills, "��������"); // ��Decorator�ٴ�װ���¹���
		// ע��˴���q  ����hero
		Hero r = new Skill_R(q, "�°����");
		
		r.learnSkills();
	}
}
