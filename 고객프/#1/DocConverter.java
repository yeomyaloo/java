public abstract class DocConverter { //�߻� Ŭ����
    private String ext;

    public DocConverter(String extension) {
        ext = extension;
    }

    public String getExtension() {
        return ext;
    }

    public abstract void save(String fileName);
}
