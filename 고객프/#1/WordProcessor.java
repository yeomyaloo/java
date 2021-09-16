import java.util.HashMap;
import java.util.Map;

public class WordProcessor {
	//���� = ������?
	private ISpellChecker spellChecker;
	private Map<String,DocConverter> converters;
	private String fileName;
	
	public WordProcessor(String fileName) {
		//���� �̸�(�۾��� ������ �̸�)�� �Է� �޾� ����
		this.fileName = fileName;
		converters = new HashMap<String, DocConverter>();
	}
	public void addDocConverter(DocConverter converter) {
		//���� ��ȯ ��ü�� Map�� �߰�(Ű�� Ȯ����, ���� DocConverter)
		converters.put(converter.getExtension(), converter);
		
	}
	public void convertDocTo(String ext) {
		//Ư�� Ȯ���� ���·� ���� ��ȯ ����
		if(converters.containsKey(ext)) {
			DocConverter c = converters.get(ext);
			c.save(fileName);
		}
		
	}

	public void setSpellChecker(ISpellChecker spellChecker) {
		//spellChecker ��ü ����
		this.spellChecker = spellChecker;
		
	}
	public void checkSpelling() {
		//��ϵ� spellChecker ��ü�� check() �Լ� ȣ��
		if (spellChecker != null) {
			spellChecker.check();
		}
	}

	

}
