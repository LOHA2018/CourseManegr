package team.loha.coursemanage.entity;

public class Question {
    long id;
    long teamId;
    long studentId;
    long seminarId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTeamId() {
        return teamId;
    }

    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public long getSeminarId() {
        return seminarId;
    }

    public void setSeminarId(long seminarId) {
        this.seminarId = seminarId;
    }
}
