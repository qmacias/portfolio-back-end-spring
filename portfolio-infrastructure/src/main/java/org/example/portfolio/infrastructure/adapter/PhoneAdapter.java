package org.example.portfolio.infrastructure.adapter;

import org.example.portfolio.domain.exception.NotFoundException;
import org.example.portfolio.domain.model.PhoneDto;
import org.example.portfolio.domain.port.output.PhonePersistencePort;
import org.example.portfolio.infrastructure.entity.PhoneEntity;
import org.example.portfolio.infrastructure.mapper.PhoneMapper;
import org.example.portfolio.infrastructure.repository.PhoneRepository;

import java.util.List;

public class PhoneAdapter implements PhonePersistencePort {

    private final PhoneRepository phoneRepository;

    private final PhoneMapper phoneMapper;

    public PhoneAdapter(PhoneRepository phoneRepository, PhoneMapper phoneMapper) {
        this.phoneRepository = phoneRepository;
        this.phoneMapper = phoneMapper;
    }

    @Override
    public List<PhoneDto> getAll() {

        List<PhoneEntity> phoneEntityList = phoneRepository.findAll();

        return phoneMapper.mapEntityListToDtoList(phoneEntityList);
    }

    @Override
    public PhoneDto getById(String id) {

        PhoneEntity phoneEntity = phoneRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Phone id: " + id));

        return phoneMapper.mapEntityToDto(phoneEntity);
    }

    @Override
    public PhoneDto createOrUpdate(PhoneDto phoneDto) {

        PhoneEntity phoneEntity = phoneMapper.mapDtoToEntity(phoneDto);

        return phoneMapper.mapEntityToDto(phoneRepository.save(phoneEntity));
    }

    @Override
    public void removeById(String id) {
        phoneRepository.deleteById(id);
    }

}