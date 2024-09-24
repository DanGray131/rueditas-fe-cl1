package pe.edu.cibertec.ruedistasfrontend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pe.edu.cibertec.ruedistasfrontend.dto.VehiculoDTO;
import pe.edu.cibertec.ruedistasfrontend.dto.VehiculoRequestDTO;

@Service
public class VehiculoClienteService {

    private  static final  String API_URL = "http://localhost:8080/api/buscar";

    @Autowired
    private RestTemplate restTemplate;

    public VehiculoDTO buscarVehiculo(String placa){
        VehiculoRequestDTO request = new VehiculoRequestDTO();
        request.setPlaca(placa);
        return restTemplate.postForObject(API_URL, request, VehiculoDTO.class);
    }
}
