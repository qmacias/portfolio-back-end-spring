package org.example.portfolio.infrastructure.adapter;

import org.example.portfolio.domain.model.DurationDto;
import org.example.portfolio.domain.exception.NotFoundException;
import org.example.portfolio.domain.port.output.DurationPersistencePort;

import org.example.portfolio.infrastructure.entity.DurationEntity;
import org.example.portfolio.infrastructure.mapper.DurationMapper;
import org.example.portfolio.infrastructure.repository.DurationRepository;

import java.util.Set;

public class DurationJpaAdapter implements DurationPersistencePort {

    private final DurationRepository durationRepository;

    public DurationJpaAdapter(DurationRepository durationRepository) {
        this.durationRepository = durationRepository;
    }

    @Override
    public Set<DurationDto> getAll() {
        Set<DurationEntity> durationEntities = durationRepository.findAllSet();
        return DurationMapper.INSTANCE.mapEntitySetToDtoSet(durationEntities);
    }

    @Override
    public DurationDto getById(String id) {
        DurationEntity durationEntity = durationRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Duration id: " + id));
        return DurationMapper.INSTANCE.mapEntityToDto(durationEntity);
    }

    @Override
    public DurationDto createOrUpdate(DurationDto durationDto) {
        DurationEntity durationEntity = DurationMapper.INSTANCE.mapDtoToEntity(durationDto);
        return DurationMapper.INSTANCE.mapEntityToDto(durationRepository.save(durationEntity));
    }

    @Override
    public void removeById(String id) {
        durationRepository.deleteById(id);
    }

}
