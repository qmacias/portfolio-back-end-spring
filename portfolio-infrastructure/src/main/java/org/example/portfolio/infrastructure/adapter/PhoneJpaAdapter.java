package org.example.portfolio.infrastructure.adapter;

import org.example.portfolio.domain.model.PhoneDto;
import org.example.portfolio.domain.exception.NotFoundException;
import org.example.portfolio.domain.port.output.PhonePersistencePort;

import org.example.portfolio.infrastructure.entity.PhoneEntity;
import org.example.portfolio.infrastructure.mapper.PhoneMapper;
import org.example.portfolio.infrastructure.repository.PhoneRepository;

import java.util.Set;

public class PhoneJpaAdapter implements PhonePersistencePort {

    private final PhoneRepository phoneRepository;

    public PhoneJpaAdapter(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    @Override
    public Set<PhoneDto> getAll() {
        Set<PhoneEntity> phoneEntities = phoneRepository.findAllSet();
        return PhoneMapper.INSTANCE.mapEntitySetToDtoSet(phoneEntities);
    }

    @Override
    public PhoneDto getById(String id) {
        PhoneEntity phoneEntity = phoneRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Phone id: " + id));
        return PhoneMapper.INSTANCE.mapEntityToDto(phoneEntity);
    }

    @Override
    public PhoneDto createOrUpdate(PhoneDto phoneDto) {
        PhoneEntity phoneEntity = PhoneMapper.INSTANCE.mapDtoToEntity(phoneDto);
        return PhoneMapper.INSTANCE.mapEntityToDto(phoneRepository.save(phoneEntity));
    }

    @Override
    public void removeById(String id) {
        phoneRepository.deleteById(id);
    }

}
