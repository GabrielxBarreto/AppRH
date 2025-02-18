package com.apprh.apprh.Models;


import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.Column;

import javax.persistence.Entity;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.GrantedAuthority;

import lombok.Getter;
import lombok.Setter;


@Entity // transforma a classe em tabela
@Getter
@Setter
public class Colaborador extends AbstractEntity<Long> implements UserDetails{
@Column
private String usuario;
@Column
private String senha;
@Column
private String nome;
@Column(unique =true)
private String cpf;  
@Column
private String cargo;
@Column
private LocalDate dataNascimento;
@Column
private float salario;
@Column
private LocalDate dataDeContratacao;
@Column
private String  status;


@Column
private String  departamento;
@Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAuthorities'");
    }

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPassword'");
    }

    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUsername'");
    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEnabled'");
    }
/*@ManyToMany
@JoinTable(
    name ="colab_Tarefas",
    joinColumns = @JoinColumn(name="colab_id"),
    inverseJoinColumns = @JoinColumn(name = "tarefa_id")
)

@OneToOne
private FolhadePagamento folhadePagamento;

public FolhadePagamento getFolhadePagamento() {
    return folhadePagamento;
}*/

}
