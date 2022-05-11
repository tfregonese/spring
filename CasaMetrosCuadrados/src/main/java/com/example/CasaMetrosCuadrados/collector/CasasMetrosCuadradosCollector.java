/*
Práctica Grupal

Se necesita desarrollar un API que reciba una Casa con su “nombre”, “dirección” y sus
“habitaciones”, estas contienen un “nombre”, “ancho” y “largo”.
a) Se pide, retornar un objeto que diga la cantidad totales de metros cuadrados
de la casa.
b) Indicar el valor de la casa tomando en cuenta que se toma como referencia
USD 800 el metro cuadrado.
c) Retornar el objeto con la habitación más grande.
d) Retornar la cantidad de metros cuadrados por habitación.
*/

package com.example.CasaMetrosCuadrados.collector;

import com.example.CasaMetrosCuadrados.Classes.Casa;
import com.example.CasaMetrosCuadrados.Classes.Room;
import com.example.CasaMetrosCuadrados.Classes.RoomM2;
import com.example.CasaMetrosCuadrados.DTO.CasaValueDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CasasMetrosCuadradosCollector {

    @PostMapping("/")
    public ResponseEntity<CasaValueDTO> presentacionCasa(@RequestBody Casa casa){
        CasaValueDTO response = new CasaValueDTO();
        double m2totales = 0.0;
        double m2aux = 0.0;
        double m2max = 0.0;
        Room habitacionMasGrande = new Room();
        RoomM2[] habitacionesM2 = new RoomM2[casa.getRooms().length];

        for(int i=0;i<casa.getRooms().length;i++){
            m2aux = casa.getRooms()[i].getLargo()*casa.getRooms()[i].getAncho();
            m2totales += (m2aux);
            if(m2max<m2aux){
                m2max=m2aux;
                habitacionMasGrande = casa.getRooms()[i];
            }
            habitacionesM2[i] = new RoomM2();
            habitacionesM2[i].setM2(m2aux);
            habitacionesM2[i].setName(casa.getRooms()[i].getName());

        }

        response.setTotalm2(m2totales);
        response.setValorm2(800.0*m2totales);
        response.setHabitacionMasGrande(habitacionMasGrande);
        response.setM2(habitacionesM2);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
