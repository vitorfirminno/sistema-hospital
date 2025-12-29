package com.hospital.backend.application.ports.out.medico;

import com.hospital.backend.application.core.domain.Medico;

public interface UpdateMedicoOutputPort {

    void update(Long id, Medico medico);

}
