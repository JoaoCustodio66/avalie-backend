package tech.Avalie.entities;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;


@Document(collection = "usuarios")
public class User {
    private String id;
    private ObjectId id_usuario;
    private String senha;

    public User(){}

    public User(String id, ObjectId id_usuario, String senha) {
        this.id = id;
        this.id_usuario = id_usuario;
        this.senha = senha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ObjectId getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(ObjectId id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(id_usuario, user.id_usuario) && Objects.equals(senha, user.senha);
    }

    @Override
    public int hashCode() {
        int ret = 6;

        ret= ret * 13 + this.id.hashCode();
        ret= ret * 13 + this.id_usuario.hashCode();
        ret= ret * 13 + this.senha.hashCode();

        if(ret < 0)ret = -ret;
        return ret;
    }

    @Override
    public String toString() {
        return "usuario{" +
                "id=" + id +
                ", id_usuario=" + id_usuario +
                ", senha='" + senha + '\'' +
                '}';
    }
}
