package datastructure.chap11;

// 정점 설계
public class Vertex {

    private int id; // 정점 고유 번호
    private String data; // 정점에 저장할 데이터
    private boolean visitFlag; // 정점 방문 여부

    public Vertex(String data) {
        this.data = data;
        this.id = -1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isVisitFlag() {
        return visitFlag;
    }

    public void setVisitFlag(boolean visitFlag) {
        this.visitFlag = visitFlag;
    }
}
