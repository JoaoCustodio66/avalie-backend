package tech.Avalie.entities;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Objects;

@Document(collection = "avaliacoes")
public class Avaliacao {
    private String id;
    private String text;
    private int nota;
    private ObjectId id_aluno;
    private ObjectId id_aula;
    private Date data;

    public Avaliacao(){}

    public Avaliacao(String id, String text, int nota, ObjectId id_aluno, ObjectId id_aula, Date data) {
        this.id = id;
        this.text = text;
        this.nota = nota;
        this.id_aluno = id_aluno;
        this.id_aula = id_aula;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public ObjectId getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(ObjectId id_aluno) {
        this.id_aluno = id_aluno;
    }

    public ObjectId getId_aula() {
        return id_aula;
    }

    public void setId_aula(ObjectId id_aula) {
        this.id_aula = id_aula;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Avaliacao avaliacao = (Avaliacao) o;
        return nota == avaliacao.nota && Objects.equals(id, avaliacao.id) && Objects.equals(text, avaliacao.text) && Objects.equals(id_aluno, avaliacao.id_aluno) && Objects.equals(id_aula, avaliacao.id_aula) && Objects.equals(data, avaliacao.data);
    }

    @Override
    public int hashCode() {
        int ret = 6;

        ret = ret * 13 + this.id.hashCode();
        ret = ret * 13 + this.text.hashCode();
        ret = ret * 13 + Integer.hashCode(this.nota);
        ret = ret * 13 + this.id_aluno.hashCode();
        ret = ret * 13 + this.id_aula.hashCode();
        ret = ret * 13 + this.data.hashCode();

        if(ret < 0)ret = -ret;
        return  ret;
    }

    @Override
    public String toString() {
        return "avaliacao{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", nota=" + nota +
                ", id_aluno=" + id_aluno +
                ", id_aula=" + id_aula +
                ", data=" + data +
                '}';
    }
}