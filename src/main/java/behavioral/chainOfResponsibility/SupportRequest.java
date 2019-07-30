package behavioral.chainOfResponsibility;

public class SupportRequest {
    private String title;
    private int type;

    SupportRequest(String title, int type){
        this.title = title;
        this.type = type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
