package com.hospital.backend.adapter.in.rest;

import com.hospital.backend.adapter.out.repository.PacienteRepository;
import com.hospital.backend.application.core.domain.Medico;
import com.hospital.backend.application.core.domain.Paciente;
import com.hospital.backend.application.ports.in.CreatePacienteInputPort;
import com.hospital.backend.application.ports.in.DeletePacienteByIdInputPort;
import com.hospital.backend.application.ports.in.GetPacienteInputPort;
import com.hospital.backend.application.ports.in.UpdatePacienteInputPort;
import com.hospital.backend.application.ports.out.medico.CreateMedicoOutputPort;
import com.hospital.backend.application.ports.out.medico.DeleteMedicoOutputPort;
import com.hospital.backend.application.ports.out.medico.GetMedicoOutputPort;
import com.hospital.backend.application.ports.out.medico.UpdateMedicoOutputPort;
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

    @Autowired
    private GetMedicoOutputPort getMedicoOutputPort;

    @Autowired
    private CreateMedicoOutputPort createMedicoOutputPort;

    @Autowired
    private UpdateMedicoOutputPort updateMedicoOutputPort;

    @Autowired
    private DeleteMedicoOutputPort deleteMedicoOutputPort;

    @PostMapping
    public String criar(@RequestBody Medico medico){
        createMedicoOutputPort.create(medico);
        return "paciente criado";
    }

    @GetMapping
    public List<Medico> buscarTodos(){
        var a = getMedicoOutputPort.get();
        return a;
    }

    @PutMapping("/atualizar/{id}")
    public String atualizar(@PathVariable Long id, @RequestBody Medico medico){
        updateMedicoOutputPort.update(id, medico);
        return "paciente editado";
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Long id){
        var deleted = deleteMedicoOutputPort.delete(id);
        if (deleted){
            return "deletado";
        }
        return "usuario não deletado";
    }

}
