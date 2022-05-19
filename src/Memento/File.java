package Memento;

public class File {
    private String content;
    private int id;
    private String address;
    private String name;

    public File(String content, int id, String address, String name) {
        this.content = content;
        this.id = id;
        this.address = address;
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String print(){
       return content + " "+ id + " " +address+ " "+name;

    }
    public File restoreToSomePoint(FileSnapshot fileSnapshot)
    {
this.content= fileSnapshot.content;
return this;

    }

    public FileSnapshot createfileSnapshot()
    {
FileSnapshot fileSnapshot=new FileSnapshot(content,VersionControl.getNewVersion(),"10/10/2021","mesaj");
return fileSnapshot;

    }


}
