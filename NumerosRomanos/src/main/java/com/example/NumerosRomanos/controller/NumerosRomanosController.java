/*
Los romanos eran un grupo inteligente. Conquistaron la mayor parte de Europa y la
gobernaron durante cientos de años. Inventaron carreteras de hormigón y rectas e
incluso bikinis. Sin embargo, una cosa que nunca descubrieron fue el número cero.
Esto hizo que escribir y fechar historias extensas de sus hazañas fuera un poco más
desafiante, pero el sistema de números que se les ocurrió todavía está en uso hoy.
Por ejemplo, la BBC usa números romanos para fechar sus programas.
Los romanos escribieron números usando letras: I, V, X, L, C, D, M. (observe que estas
letras tienen muchas líneas rectas y, por lo tanto, son fáciles de cortar en tabletas de
piedra)
Desarrollar una API para convertir un número Decimal a un número romano.
*/
package com.example.NumerosRomanos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumerosRomanosController {

    @GetMapping
    public String devolver(){
        return "Numeros Romanos! ";
    }

    @GetMapping("/{num}")
    public String numeroRomano(@PathVariable Integer num){
        if(num>3999){
            return "Ehhhhh! Que numeraso! los romanos no contaban tanto! XD";
        }
        if (num<=0){
            return "No seas tan negativo! Los Romanos siendo positivos conquistaron TODO!";
        }
        int mi,ce,de,un;
        String rom = "";
        //Millar
        mi=num/1000;
        num=num%1000;
        //Centena
        ce=num/100;
        num=num%100;
        //Decena
        de=num/10;
        num=num%10;
        //Unidad
        un=num/1;

        //1 al 9 en Romano
        switch (un) {
            case 1:
                rom="I";
                break;
            case 2:
                rom="II";
                break;
            case 3:
                rom="III";
                break;
            case 4:
                rom="IV";
                break;
            case 5:
                rom="V";
                break;
            case 6:
                rom="VI";
                break;
            case 7:
                rom="VII";
                break;
            case 8:
                rom="VIII";
                break;
            case 9:
                rom="IX";
                break;
        }

        //10 al 99 en Romano
        switch (de) {
            case 1:
                rom="X"+rom;
                break;
            case 2:
                rom="XX"+rom;
                break;
            case 3:
                rom="XXX"+rom;
                break;
            case 4:
                rom="XL"+rom;
                break;
            case 5:
                rom="L"+rom;
                break;
            case 6:
                rom="LX"+rom;
                break;
            case 7:
                rom="LXX"+rom;
                break;
            case 8:
                rom="LXXX"+rom;
                break;
            case 9:
                rom="XC"+rom;
                break;
        }

        //100 al 999 en Romano
        switch (ce) {
            case 1:
                rom="C"+rom;
                break;
            case 2:
                rom="CC"+rom;
                break;
            case 3:
                rom="CCC"+rom;
                break;
            case 4:
                rom="CD"+rom;
                break;
            case 5:
                rom="D"+rom;
                break;
            case 6:
                rom="DC"+rom;
                break;
            case 7:
                rom="DCC"+rom;
                break;
            case 8:
                rom="DCCC"+rom;
                break;
            case 9:
                rom="CM"+rom;
                break;
        }

        //1000 al 3999 en Romano
        switch (mi) {
            case 1:
                rom="M"+rom;
                break;
            case 2:
                rom="MM"+rom;
                break;
            case 3:
                rom="MMM"+rom;
        }
        return rom;
    }

}

