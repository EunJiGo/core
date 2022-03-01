package hello.core.member;

//회원 엔티티(실체, 객체)
public class Member {

    private Long id;
    private String name;
    private Grade grade;

    public Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGradle() {
        return grade;
    }

    public void setGradle(Grade gradle) {
        this.grade = gradle;
    }
}
