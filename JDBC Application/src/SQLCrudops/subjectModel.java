package SQLCrudops;

public class subjectModel {

    int id;
    String name;
    Float marks;
    Boolean oral;

    public subjectModel(int id, String name, Float marks, Boolean oral) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.oral = oral;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMarks() {
        return marks;
    }

    public void setMarks(Float marks) {
        this.marks = marks;
    }

    public Boolean getOral() {
        return oral;
    }

    public void setOral(Boolean oral) {
        this.oral = oral;
    }

    @Override
    public String toString() {
        return "subjectModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", oral=" + oral +
                '}';
    }
}
