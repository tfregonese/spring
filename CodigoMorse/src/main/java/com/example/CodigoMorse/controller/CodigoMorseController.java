package com.example.CodigoMorse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodigoMorseController {

    @GetMapping("/{codigoMorse}")
    public String traducirCodigo(@PathVariable char[] codigoMorse){
        String cogigoNoMorse = "";
        String letra = "";
        int counter = 0;
        for(int i=0;i<codigoMorse.length;i++){
            if(codigoMorse[i]==' ' && counter == 3){
                cogigoNoMorse += " ";
                counter = 0;
            }else if(codigoMorse[i]==' '){
                cogigoNoMorse += decifrar(letra);
                letra = "";
                counter ++;
            }else{
                letra += codigoMorse[i];
                counter = 0;
            }
        }
        cogigoNoMorse += decifrar(letra);
        return cogigoNoMorse;
    }

    public String decifrar(String morse){
        String decifrado = "";
        switch (morse){
            case ".-":
                decifrado = "A";
                break;
            case "-...":
                decifrado = "B";
                break;
            case "-.-.":
                decifrado = "C";
                break;
            case "-..":
                decifrado = "D";
                break;
            case ".":
                decifrado = "E";
                break;
            case "..-.":
                decifrado = "F";
                break;
            case "--.":
                decifrado = "G";
                break;
            case "....":
                decifrado = "H";
                break;
            case "..":
                decifrado = "I";
                break;
            case ".---":
                decifrado = "J";
                break;
            case "-.-":
                decifrado = "K";
                break;
            case ".-..":
                decifrado = "L";
                break;
            case "--":
                decifrado = "M";
                break;
            case "-.":
                decifrado = "N";
                break;
            case "---":
                decifrado = "O";
                break;
            case ".--.":
                decifrado = "P";
                break;
            case "--.-":
                decifrado = "Q";
                break;
            case ".-.":
                decifrado = "R";
                break;
            case "...":
                decifrado = "S";
                break;
            case "-":
                decifrado = "T";
                break;
            case "..-":
                decifrado = "U";
                break;
            case "...-":
                decifrado = "V";
                break;
            case ".--":
                decifrado = "W";
                break;
            case "-..-":
                decifrado = "X";
                break;
            case "-.--":
                decifrado = "Y";
                break;
            case "--..":
                decifrado = "Z";
                break;
            default:
                decifrado = "?/·%$·!@#|!";
                break;
        }
        return decifrado;
    }
}
