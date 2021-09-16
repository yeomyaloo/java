public class Main {
    public static void main(String[] args) {
    	WordProcessor wp = new WordProcessor("new doc");
        wp.setSpellChecker(new EngSpellChecker());
        wp.addDocConverter(new DocxDocConverter()); //추상클래ㅐ스
        wp.addDocConverter(new PdfDocConverter());
        wp.addDocConverter(new OdtDocConverter());
        wp.checkSpelling();
        wp.convertDocTo("odt");
        wp.convertDocTo("pdf");
        wp.convertDocTo("docx");
        wp.convertDocTo("wps");
    }
}

