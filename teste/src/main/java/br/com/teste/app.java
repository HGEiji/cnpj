package br.com.teste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class app{

    @Autowired
    @Qualifier("index")
    private String index;
    public String index(){
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(app.class, args);
        System.out.println("SPRING RODANDO");
    }
}