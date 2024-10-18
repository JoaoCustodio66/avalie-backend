package avalie.model;

import org.bson.types.ObjectId;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Aula {
    private ObjectId id;
    private String descricao;
    private ObjectId id_professor;
    private Date horario_inicio;
    private Date horario_fim;
    private List<String> dias_semana;


    public Aula() {
    }

    public Aula(String descricao, ObjectId id_professor, Date horario_inicio, Date horario_fim, List<String> dias_semana) {
        this.descricao = descricao;
        this.id_professor = id_professor;
        this.horario_inicio = horario_inicio;
        this.horario_fim = horario_fim;
        this.dias_semana = dias_semana;
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

    public ObjectId getId_professor() {
        return id_professor;
    }

    public void setId_professor(ObjectId id_professor) {
        this.id_professor = id_professor;
    }

    public Date getHorario_inicio() {
        return horario_inicio;
    }

    public void setHorario_inicio(Date horario_inicio) {
        this.horario_inicio = horario_inicio;
    }

    public Date getHorario_fim() {
        return horario_fim;
    }

    public void setHorario_fim(Date horario_fim) {
        this.horario_fim = horario_fim;
    }

    public List<String> getDias_semana() {
        return dias_semana;
    }

    public void setDias_semana(List<String> dias_semana) {
        this.dias_semana = dias_semana;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aula aula = (Aula) o;
        return Objects.equals(id, aula.id) && Objects.equals(descricao, aula.descricao) && Objects.equals(id_professor, aula.id_professor) && Objects.equals(horario_inicio, aula.horario_inicio) && Objects.equals(horario_fim, aula.horario_fim) && Objects.equals(dias_semana, aula.dias_semana);
    }

    @Override
    public int hashCode() {
        int ret = 6;

        ret = ret * 13 + this.id.hashCode();
        ret = ret * 13 + this.descricao.hashCode();
        ret = ret * 13 + this.id_professor.hashCode();
        ret = ret * 13 + this.horario_inicio.hashCode();
        ret = ret * 13 + this.horario_fim.hashCode();
        ret = ret * 13 + this.dias_semana.hashCode();

        if (ret < 0)ret =- ret;
        return ret;
    }

    @Override
    public String toString() {
        return "aula{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", id_professor=" + id_professor +
                ", horario_inicio=" + horario_inicio +
                ", horario_fim=" + horario_fim +
                ", dias_semana=" + dias_semana +
                '}';
    }

}
