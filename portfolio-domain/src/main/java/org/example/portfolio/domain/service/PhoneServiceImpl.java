package org.example.portfolio.domain.service;

import org.example.portfolio.domain.model.PhoneDto;

import org.example.portfolio.domain.port.input.PhoneServicePort;
import org.example.portfolio.domain.port.output.PhonePersistencePort;

import java.util.List;

public class PhoneServiceImpl implements PhoneServicePort {

    private PhonePersistencePort phonePersistencePort;

    public PhoneServiceImpl(PhonePersistencePort phonePersistencePort) {
        this.phonePersistencePort = phonePersistencePort;
    }

    @Override
    public List<PhoneDto> getAll() {
        return phonePersistencePort.getAll();
    }

    @Override
    public PhoneDto getById(Long id) {
        return phonePersistencePort.getById(id);
    }

    @Override
    public PhoneDto createOrUpdate(PhoneDto phoneDto) {
        return phonePersistencePort.createOrUpdate(phoneDto);
    }

    @Override
    public void removeById(Long id) {
        phonePersistencePort.removeById(id);
    }

}
