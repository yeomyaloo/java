
public class OdtDocConverter extends DocConverter{

	public OdtDocConverter() {
		// �����ڿ��� �θ� Ŭ������ �����ڸ� �̿��ؼ� �ڽ��� ��ȯ�� �� �ִ� ���� ���� Ȯ���� ���
		super("odt");
		
	}

	@Override
	public void save(String fileName) {
		System.out.printf("%s.%s�� ��ȯ�ؼ� �����մϴ�.\n", fileName,getExtension());
		//���� �̸��� save �Լ��� �Ű� ������ ���޵Ǵ� �̸�
		//Ȯ���ڴ� �θ� Ŭ������ ��ϵ� ���ڿ�
	}

}
