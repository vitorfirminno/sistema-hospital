package com.hospital.backend.adapter.in.rest;

import com.hospital.backend.adapter.out.repository.PacienteRepository;
import com.hospital.backend.application.core.domain.Paciente;
import com.hospital.backend.application.ports.in.CreatePacienteInputPort;
import com.hospital.backend.application.ports.in.DeletePacienteByIdInputPort;
import com.hospital.backend.application.ports.in.GetPacienteInputPort;
import com.hospital.backend.application.ports.in.UpdatePacienteInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("teste")
public class Controller {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private GetPacienteInputPort getPacienteInputPort;

    @Autowired
    private UpdatePacienteInputPort updatePacienteInputPort;

    @Autowired
    private DeletePacienteByIdInputPort deletePacienteByIdInputPort;

    @Autowired
    private CreatePacienteInputPort createPacienteInputPort;

    @PostMapping
    public String criar(@RequestBody Paciente paciente){
        createPacienteInputPort.create(paciente);
        return "paciente criado";
    }

    @GetMapping
    public List<Paciente> buscarTodos(){
        var a = getPacienteInputPort.get();
        return a;
    }

    @PutMapping("/atualizar/{id}")
    public String atualizar(@PathVariable Long id, @RequestBody Paciente paciente){
        updatePacienteInputPort.update(id, paciente);
        return "paciente editado";
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Long id){
        var deleted = deletePacienteByIdInputPort.delete(id);
        if (deleted){
            return "deletado";
        }
        return "usuario não deletado";
    }

}
