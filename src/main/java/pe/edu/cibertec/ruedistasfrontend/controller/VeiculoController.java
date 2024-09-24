package pe.edu.cibertec.ruedistasfrontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pe.edu.cibertec.ruedistasfrontend.dto.VehiculoDTO;
import pe.edu.cibertec.ruedistasfrontend.service.VehiculoClienteService;

@Controller
public class VeiculoController {

    @Autowired
    private VehiculoClienteService vehiculoClienteService;

    @GetMapping("/form")
    public String Form(Model model) {
        return "veiculoForm";
    }

    @PostMapping("/buscar")
    public String Buscar(@RequestParam String placa, Model model) {
        VehiculoDTO vehiculo = vehiculoClienteService.buscarVehiculo(placa);
        model.addAttribute("vehiculo", vehiculo);
        return "Resultado";
    }

}
