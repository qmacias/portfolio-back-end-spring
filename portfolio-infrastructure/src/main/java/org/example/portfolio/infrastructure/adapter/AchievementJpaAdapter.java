package org.example.portfolio.infrastructure.adapter;

import org.example.portfolio.domain.model.AchievementDto;
import org.example.portfolio.domain.exception.NotFoundException;
import org.example.portfolio.domain.port.output.AchievementPersistencePort;

import org.example.portfolio.infrastructure.entity.AchievementEntity;
import org.example.portfolio.infrastructure.mapper.AchievementMapper;
import org.example.portfolio.infrastructure.repository.AchievementRepository;

import java.util.List;

public class AchievementJpaAdapter implements AchievementPersistencePort {

    private final AchievementRepository achievementRepository;

    public AchievementJpaAdapter(AchievementRepository achievementRepository) {
        this.achievementRepository = achievementRepository;
    }

    @Override
    public List<AchievementDto> getAll() {
        List<AchievementEntity> achievementEntities = achievementRepository.findAll();
        return AchievementMapper.INSTANCE.mapEntityListToDtoList(achievementEntities);
    }

    @Override
    public AchievementDto getById(String id) {
        AchievementEntity achievementEntity = achievementRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Achievement id: " + id));
        return AchievementMapper.INSTANCE.mapEntityToDto(achievementEntity);
    }

    @Override
    public AchievementDto createOrUpdate(AchievementDto achievementDto) {
        AchievementEntity achievementEntity = AchievementMapper.INSTANCE.mapDtoToEntity(achievementDto);
        return AchievementMapper.INSTANCE.mapEntityToDto(achievementRepository.save(achievementEntity));
    }

    @Override
    public void removeById(String id) {
        achievementRepository.deleteById(id);
    }

}
