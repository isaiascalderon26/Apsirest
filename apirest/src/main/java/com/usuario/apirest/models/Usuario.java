package com.usuario.apirest.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
@Entity
@Document(collection = "Usuario")
public class Usuario  implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)


    private long id;
    private String nombre;
    private String password;
    private String email;
    private int telefono;

    @Temporal(TemporalType.DATE)
    private Date createAt;
    @PrePersist
    public void  prePersist(){
        createAt = new Date();
    }

    /**
     * **/

    private static final long serialVersionUID = 1L;

}
