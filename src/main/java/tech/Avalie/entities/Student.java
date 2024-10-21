package tech.Avalie.entities;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "alunos")
public class Student {
    @Id
    private String id;
    private String nome;
    private String ra;
    private String email;
    private String telefone;

    private ObjectId id_curso;
    private ObjectId id_grade;
    private Boolean ativo;

    public Student(String id, String nome, String ra, String email, String telefone, ObjectId id_curso, ObjectId id_grade, Boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.ra = ra;
        this.email = email;
        this.telefone = telefone;
        this.id_curso = id_curso;
        this.id_grade = id_grade;
        this.ativo = ativo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", ra='" + ra + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", id_curso='" + id_curso + '\'' +
                ", id_grade='" + id_grade + '\'' +
                ", ativo=" + ativo +
                '}';
    }
}
