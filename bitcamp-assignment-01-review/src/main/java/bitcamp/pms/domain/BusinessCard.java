package bitcamp.pms.domain;

public class BusinessCard {

    private int no;
    private Member writer;
    private String name;
    private String tel;
    private String fax;
    private String email;
    private String memo;

    @Override
    public String toString() {
        return "BusinessCard{" +
                "no=" + no +
                ", writer=" + writer +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", fax='" + fax + '\'' +
                ", email='" + email + '\'' +
                ", memo='" + memo + '\'' +
                '}';
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Member getWriter() {
        return writer;
    }

    public void setWriter(Member writer) {
        this.writer = writer;
    }

    public void setWriterNo(int writerNo) {
        this.writer.setNo(writerNo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
