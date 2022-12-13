package org.example.portfolio.infrastructure.adapter;

import org.example.portfolio.domain.model.SocialDto;
import org.example.portfolio.domain.exception.NotFoundException;
import org.example.portfolio.domain.port.output.SocialPersistencePort;

import org.example.portfolio.infrastructure.entity.SocialEntity;
import org.example.portfolio.infrastructure.mapper.SocialMapper;
import org.example.portfolio.infrastructure.repository.SocialRepository;

import java.util.Set;

public class SocialJpaAdapter implements SocialPersistencePort {

    private final SocialRepository socialRepository;

    public SocialJpaAdapter(SocialRepository socialRepository) {
        this.socialRepository = socialRepository;
    }

    @Override
    public Set<SocialDto> getAll() {
        Set<SocialEntity> socialEntities = socialRepository.findAllSet();
        return SocialMapper.INSTANCE.mapEntitySetToDtoSet(socialEntities);
    }

    @Override
    public SocialDto getById(String id) {
        SocialEntity socialEntity = socialRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Social id: " + id));
        return SocialMapper.INSTANCE.mapEntityToDto(socialEntity);
    }

    @Override
    public SocialDto createOrUpdate(SocialDto socialDto) {
        SocialEntity socialEntity = SocialMapper.INSTANCE.mapDtoToEntity(socialDto);
        return SocialMapper.INSTANCE.mapEntityToDto(socialRepository.save(socialEntity));
    }

    @Override
    public void removeById(String id) {
        socialRepository.deleteById(id);
    }

}
