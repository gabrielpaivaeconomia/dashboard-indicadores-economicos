package br.com.gabriel.dashboard_focus; // Correção aqui

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/indicadores")
public class IndicadorController {

    @Autowired
    private IndicadorRepository repository;

    @GetMapping
    public List<Indicador> listarTodos() {
        return repository.findAll();
    }
}