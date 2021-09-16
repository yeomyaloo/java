import java.util.HashMap;
import java.util.Map;

public class WordProcessor {
	//변수 = 생성자?
	private ISpellChecker spellChecker;
	private Map<String,DocConverter> converters;
	private String fileName;
	
	public WordProcessor(String fileName) {
		//파일 이름(작업할 파일의 이름)을 입력 받아 저장
		this.fileName = fileName;
		converters = new HashMap<String, DocConverter>();
	}
	public void addDocConverter(DocConverter converter) {
		//문서 변환 객체를 Map에 추가(키는 확장자, 값은 DocConverter)
		converters.put(converter.getExtension(), converter);
		
	}
	public void convertDocTo(String ext) {
		//특정 확장자 형태로 파일 변환 저장
		if(converters.containsKey(ext)) {
			DocConverter c = converters.get(ext);
			c.save(fileName);
		}
		
	}

	public void setSpellChecker(ISpellChecker spellChecker) {
		//spellChecker 객체 지정
		this.spellChecker = spellChecker;
		
	}
	public void checkSpelling() {
		//등록된 spellChecker 객체의 check() 함수 호출
		if (spellChecker != null) {
			spellChecker.check();
		}
	}

	

}
