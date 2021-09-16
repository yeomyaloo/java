
public class OdtDocConverter extends DocConverter{

	public OdtDocConverter() {
		// 생성자에서 부모 클래스의 생성자를 이용해서 자신이 변환할 수 있는 파일 포맷 확장자 등록
		super("odt");
		
	}

	@Override
	public void save(String fileName) {
		System.out.printf("%s.%s로 변환해서 저장합니다.\n", fileName,getExtension());
		//파일 이름은 save 함수에 매개 변수로 전달되는 이름
		//확장자는 부모 클래스에 등록된 문자열
	}

}
