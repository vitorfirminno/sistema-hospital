package com.hospital.backend.adapter.in.rest;

import com.hospital.backend.adapter.out.repository.PacienteRepository;
import com.hospital.backend.adapter.out.repository.entity.PacienteEntity;
import com.hospital.backend.application.core.domain.Paciente;
import com.hospital.backend.application.ports.in.GetPacienteInputPort;
import com.hospital.backend.application.ports.out.GetPacienteOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("teste")
public class Controller {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private GetPacienteOutputPort getPacienteOutputPort;

    @Autowired
    private GetPacienteInputPort getPacienteInputPort;

    @PostMapping
    public String criar(@RequestBody PacienteEntity pacienteEntity){
        pacienteRepository.insert(pacienteEntity);
        return "paciente criado";
    }

    @GetMapping
    public List<Paciente> buscarTodos(){
        return getPacienteInputPort.get();
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
