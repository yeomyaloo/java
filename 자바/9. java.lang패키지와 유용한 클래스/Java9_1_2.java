package javaStandard;
//equals() �������̵��� ���� �� ����� �� 
//��ü ���� ���ϱ� ������ ���� ������ �ν��Ѵ�. 
public class Ex9_1_2 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
				
		if(v1.equals(v2))
			System.out.println("v1�� v2�� �����ϴ�");
		else
			System.out.println("v1�� v2�� �ٸ��ϴ�.");
	}

}

class Value{
	int value;
	
	Value(int value){
		this.value = value;
	}
	
	public boolean equals(Object obj) {
		
		//���������� ����ȯ ������ �ݵ�� instanceof�� Ȯ�����־�� �Ѵ�
		if (!(obj instanceof Value)) return false;
		Value v = (Value)obj; // obj�� ���� ���⿡ ����ȯ�� ���ش�. 
		
		return this.value == v.value;
		
	}
}