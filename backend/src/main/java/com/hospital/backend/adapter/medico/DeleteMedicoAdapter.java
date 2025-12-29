package com.hospital.backend.adapter.medico;

import com.hospital.backend.adapter.out.repository.MedicoRepository;
import com.hospital.backend.application.ports.out.medico.DeleteMedicoOutputPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DeleteMedicoAdapter implements DeleteMedicoOutputPort {

    @Autowired
    private MedicoRepository medicoRepository;

    @Override
    public boolean delete(Long id) {
        var deletado = medicoRepository.delete(id);
        log.info("DeleteMedicoAdapter - delete - medico_id {}, deletado: {}", id, deletado);
        return deletado;
    }
}
