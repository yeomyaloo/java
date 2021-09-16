public abstract class DocConverter { //추상 클래스
    private String ext;

    public DocConverter(String extension) {
        ext = extension;
    }

    public String getExtension() {
        return ext;
    }

    public abstract void save(String fileName);
}
