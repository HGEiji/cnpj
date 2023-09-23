package br.com.teste.Controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
@Controller
@RequestMapping("/")
public class config{

    @Bean(name = "index")
    @GetMapping("/index")
    public String index(){
        return "index";
    }
    public static void main(String[] args) {
    }
}