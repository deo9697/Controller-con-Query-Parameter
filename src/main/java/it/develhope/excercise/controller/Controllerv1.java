package it.develhope.excercise.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllerv1 {


    @GetMapping("v1/ciao")
    public String ciao(@RequestParam String nome, @RequestParam(required = false, defaultValue = " ") String provincia) {
        String s;
        if(provincia.isBlank()){
            s = "ciao " + nome + ", com'è il tempo da te?";
        }else{
            s = "ciao " + nome + ", com'è il tempo in " + provincia + "?";
        }
        return s;
    }

}
