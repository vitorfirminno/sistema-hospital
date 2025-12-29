package com.hospital.backend.application.ports.out.medico;

import com.hospital.backend.application.core.domain.Medico;

public interface CreateMedicoOutputPort {

    void create(Medico medico);

}
