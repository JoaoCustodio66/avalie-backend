package org.example.model;
import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import org.bson.types.ObjectId;

import java.util.Objects;

public class professor {
    private ObjectId id;
    private String nome;
    private String email;
    private String telefone;

    public professor(){}

    public professor(ObjectId id, String nome, String email, String telefone){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        professor professor = (professor) o;
        return Objects.equals(id, professor.id) && Objects.equals(nome, professor.nome) && Objects.equals(email, professor.email) && Objects.equals(telefone, professor.telefone);
    }

    @Override
    public int hashCode() {
        int ret = 6;
        ret = ret * 13 + this.id.hashCode();
        ret = ret * 13 + this.nome.hashCode();
        ret = ret * 13 + this.email.hashCode();
        ret = ret * 13 + this.telefone.hashCode();

        if(ret < 0) ret =-ret;
        return ret;
    }

    @Override
    public String toString() {
        return "professor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
