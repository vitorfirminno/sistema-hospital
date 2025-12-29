package com.hospital.backend.application.ports.out.medico;

import com.hospital.backend.application.core.domain.Medico;

import java.util.List;

public interface GetMedicoOutputPort {

    List<Medico> get();

}
