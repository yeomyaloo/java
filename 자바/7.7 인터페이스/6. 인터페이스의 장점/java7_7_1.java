package javaStandard;


//���߻���� ����ϴ� interface
interface Fightable extends Movable, Attackable{ }


//�������̽��� ������ �������̽��� �����ϱ� ������ extend ���� �ʾƵ� ��.��������
interface Movable{
	//������ ��ġ�� �̵��ϴ� ����� �޼���
	void move(int x, int y);
}

interface Attackable{
	void attack(Unit u);
}