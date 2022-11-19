package org.example.portfolio.infrastructure.adapter;

import org.example.portfolio.domain.exception.NotFoundException;
import org.example.portfolio.domain.model.PhoneDto;
import org.example.portfolio.domain.port.output.PhonePersistencePort;
import org.example.portfolio.infrastructure.entity.PhoneEntity;
import org.example.portfolio.infrastructure.mapper.ToPhoneDtoOrEntityMapper;
import org.example.portfolio.infrastructure.repository.PhoneRepository;

import java.util.List;

public class PhoneJpaAdapter implements PhonePersistencePort {

    private final PhoneRepository phoneRepository;

    private final ToPhoneDtoOrEntityMapper toPhoneDtoOrEntityMapper;

    public PhoneJpaAdapter(
            PhoneRepository phoneRepository,
            ToPhoneDtoOrEntityMapper toPhoneDtoOrEntityMapper
    ) {
        this.phoneRepository = phoneRepository;
        this.toPhoneDtoOrEntityMapper = toPhoneDtoOrEntityMapper;
    }

    @Override
    public List<PhoneDto> getAll() {

        List<PhoneEntity> phoneEntityList = phoneRepository.findAll();

        return toPhoneDtoOrEntityMapper.mapEntityListToDtoList(phoneEntityList);
    }

    @Override
    public PhoneDto getById(Long id) {

        PhoneEntity phoneEntity = phoneRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Phone id: " + id));

        return toPhoneDtoOrEntityMapper.mapEntityToDto(phoneEntity);
    }

    @Override
    public PhoneDto createOrUpdate(PhoneDto phoneDto) {

        PhoneEntity phoneEntity = toPhoneDtoOrEntityMapper.mapDtoToEntity(phoneDto);

        PhoneEntity phoneEntitySaved = phoneRepository.save(phoneEntity);

        return toPhoneDtoOrEntityMapper.mapEntityToDto(phoneEntitySaved);
    }

    @Override
    public void removeById(Long id) {
        phoneRepository.deleteById(id);
    }

}
