package com.spring_estudos.estudos.SpringFramework.Beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Livros getLivro() {
        return new Livros();
    }
    // <bean id="livro" class="com.spring_estudos.estudos.SpringFramework"/>

    @Bean
    public AutorLivro getAutorLivro() {
        return new Autor();
    }
}
