package avalie.model;

import org.bson.types.ObjectId;

import java.util.List;
import java.util.Objects;

public class Grade {
    private ObjectId id;
    private int semestre;
    private ObjectId curso;
    private int ano;
    private String turma;
    private List<ObjectId> disciplinas;

    public Grade(){}

    public Grade(ObjectId id, int semestre, ObjectId curso, int ano, String turma, List<ObjectId> disciplinas) {
        this.id = id;
        this.semestre = semestre;
        this.curso = curso;
        this.ano = ano;
        this.turma = turma;
        this.disciplinas = disciplinas;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public ObjectId getCurso() {
        return curso;
    }

    public void setCurso(ObjectId curso) {
        this.curso = curso;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public List<ObjectId> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<ObjectId> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grade grade = (Grade) o;
        return semestre == grade.semestre && ano == grade.ano && Objects.equals(id, grade.id) && Objects.equals(curso, grade.curso) && Objects.equals(turma, grade.turma) && Objects.equals(disciplinas, grade.disciplinas);
    }

    @Override
    public int hashCode() {
        int ret = 6;

        ret = ret * 13 + this.id.hashCode();
        ret = ret * 13 + Integer.hashCode(this.semestre);
        ret = ret * 13 + this.curso.hashCode();
        ret = ret * 13 + Integer.hashCode(this.ano);
        ret = ret * 13 + this.turma.hashCode();
        ret = ret * 13 + this.disciplinas.hashCode();

        if (ret <0 )ret =-ret;
        return ret;

    }

    @Override
    public String toString() {
        return "grade{" +
                "id=" + id +
                ", semestre=" + semestre +
                ", curso=" + curso +
                ", ano=" + ano +
                ", turma='" + turma + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
