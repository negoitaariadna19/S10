package Memento;

public class FileSnapshot {
     String content;
     Integer version;
     String dateTime;
     String message;

    public FileSnapshot(String content, Integer version, String dateTime, String message) {
        this.content = content;
        this.version = version;
        this.dateTime = dateTime;
        this.message = message;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

public String getDetails()
{
   return version+" "+dateTime+" "+message;
}



}


