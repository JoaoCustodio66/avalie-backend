package avalie.model;

import org.bson.types.ObjectId;

import java.util.Objects;

public class Curso {
    private ObjectId id;
    private String descricao;
    private Boolean ativo;

    public Curso(){}

    public Curso(ObjectId id, String descricao, Boolean ativo) {
        this.id = id;
        this.descricao = descricao;
        this.ativo = ativo;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
        Curso curso = (Curso) o;
        return Objects.equals(id, curso.id) && Objects.equals(descricao, curso.descricao) && Objects.equals(ativo, curso.ativo);
    }

    @Override
    public int hashCode() {
        int ret = 6;

        ret = ret * 13 + this.id.hashCode();
        ret = ret * 13 + this.descricao.hashCode();
        ret = ret * 13 + this.ativo.hashCode();

        if(ret < 0)ret = -ret;
        return  ret;
    }

    @Override
    public String toString() {
        return "curso{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", ativo=" + ativo +
                '}';
    }
}
