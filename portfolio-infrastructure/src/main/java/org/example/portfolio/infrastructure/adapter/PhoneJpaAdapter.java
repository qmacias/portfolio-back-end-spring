package org.example.portfolio.infrastructure.adapter;

import org.example.portfolio.domain.exception.NotFoundException;
import org.example.portfolio.domain.model.PhoneDto;
import org.example.portfolio.domain.port.output.PhonePersistencePort;
import org.example.portfolio.infrastructure.entity.PhoneEntity;
import org.example.portfolio.infrastructure.mapper.PhoneMapper;
import org.example.portfolio.infrastructure.repository.PhoneRepository;

import java.util.List;

public class PhoneJpaAdapter implements PhonePersistencePort {

    private final PhoneRepository phoneRepository;

    private final PhoneMapper phoneMapper;

    public PhoneJpaAdapter(
            PhoneRepository phoneRepository,
            PhoneMapper phoneMapper
    ) {
        this.phoneRepository = phoneRepository;
        this.phoneMapper = phoneMapper;
    }

    @Override
    public List<PhoneDto> getAll() {

        List<PhoneEntity> phoneEntityList = phoneRepository.findAll();

        return phoneMapper.mapEntityListToDtoList(phoneEntityList);
    }

    @Override
    public PhoneDto getById(Long id) {

        PhoneEntity phoneEntity = phoneRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Phone id: " + id));

        return phoneMapper.mapEntityToDto(phoneEntity);
    }

    @Override
    public PhoneDto createOrUpdate(PhoneDto phoneDto) {

        PhoneEntity phoneEntity = phoneMapper.mapDtoToEntity(phoneDto);

        PhoneEntity phoneEntitySaved = phoneRepository.save(phoneEntity);

        return phoneMapper.mapEntityToDto(phoneEntitySaved);
    }

    @Override
    public void removeById(Long id) {
        phoneRepository.deleteById(id);
    }

}
