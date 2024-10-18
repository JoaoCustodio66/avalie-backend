package avalie.model;

import org.bson.types.ObjectId;

import java.util.Objects;

public class Aluno {
    private ObjectId id;
    private String nome;
    private String ra;
    private String email;
    private String telefone;
    private ObjectId id_curso;
    private ObjectId id_grade;
    private Boolean ativo;

    public Aluno(){}

    public Aluno(ObjectId id, String nome, String ra, String email, String telefone, ObjectId id_curso, ObjectId id_grade, Boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.ra = ra;
        this.email = email;
        this.telefone = telefone;
        this.id_curso = id_curso;
        this.id_grade = id_grade;
        this.ativo = ativo;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ObjectId getId_curso() {
        return id_curso;
    }

    public void setId_curso(ObjectId id_curso) {
        this.id_curso = id_curso;
    }

    public ObjectId getId_grade() {
        return id_grade;
    }

    public void setId_grade(ObjectId id_grade) {
        this.id_grade = id_grade;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(id, aluno.id) && Objects.equals(nome, aluno.nome) && Objects.equals(ra, aluno.ra) && Objects.equals(email, aluno.email) && Objects.equals(telefone, aluno.telefone) && Objects.equals(id_curso, aluno.id_curso) && Objects.equals(id_grade, aluno.id_grade) && Objects.equals(ativo, aluno.ativo);
    }

    @Override
    public int hashCode() {
        int ret = 6;

        ret = ret * 13 + this.id.hashCode();
        ret = ret * 13 + this.nome.hashCode();
        ret = ret * 13 + this.ra.hashCode();
        ret = ret * 13 + this.email.hashCode();
        ret = ret * 13 + this.telefone.hashCode();
        ret = ret * 13 + this.id_curso.hashCode();
        ret = ret * 13 + this.id_grade.hashCode();
        ret = ret * 13 + this.ativo.hashCode();

        if(ret < 0 )ret = -ret;
        return ret;
    }

    @Override
    public String toString() {
        return "aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", ra='" + ra + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", id_curso=" + id_curso +
                ", id_grade=" + id_grade +
                ", ativo=" + ativo +
                '}';
    }
}
