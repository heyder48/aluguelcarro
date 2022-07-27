package com.letscode.heyder.modelos.cliente;

import java.util.regex.Pattern;

import com.letscode.heyder.exceptions.EmailInvalidoException;

public class Email {

    private String email;

    public Email(String endereco) throws EmailInvalidoException {
        if(endereco.isEmpty()){
            throw new EmailInvalidoException("Email não pode ser vazio");
        }
        if(!isEmailValid(endereco)){
            throw new EmailInvalidoException("Email em formato inválido");
        }

        this.email = endereco;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private boolean isEmailValid(String email) {
        final Pattern EMAIL_REGEX = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
        return EMAIL_REGEX.matcher(email).matches();
    }

}
