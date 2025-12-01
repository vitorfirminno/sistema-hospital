package com.hospital.backend.adapter.in.rest;

import com.hospital.backend.adapter.out.repository.PacienteRepository;
import com.hospital.backend.adapter.out.repository.entity.PacienteEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("teste")
public class Controller {

    @Autowired
    private PacienteRepository pacienteRepository;

    @PostMapping
    public String criar(@RequestBody PacienteEntity pacienteEntity){
        pacienteRepository.insert(pacienteEntity);
        return "paciente criado";
    }

    @GetMapping
    public List<PacienteEntity> buscarTodos(){
        return pacienteRepository.getAll();
    }

    @PostMapping("/atualizar/{id}")
    public String atualizar(@PathVariable Long id, @RequestBody PacienteEntity pacienteEntity){
        pacienteRepository.update(id, pacienteEntity);
        return "paciente criado";
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Long id){
        var deleted = pacienteRepository.delete(id);
        if (deleted){
            return "deletado";
        }
        return "usuario não deletado";
    }

}
