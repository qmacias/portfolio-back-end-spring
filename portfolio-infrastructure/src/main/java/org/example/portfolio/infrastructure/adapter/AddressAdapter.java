package org.example.portfolio.infrastructure.adapter;

import org.example.portfolio.domain.exception.NotFoundException;
import org.example.portfolio.domain.model.AddressDto;
import org.example.portfolio.domain.port.output.AddressPersistencePort;
import org.example.portfolio.infrastructure.entity.AddressEntity;
import org.example.portfolio.infrastructure.mapper.AddressMapper;
import org.example.portfolio.infrastructure.repository.AddressRepository;

import java.util.List;

public class AddressAdapter implements AddressPersistencePort {

    private final AddressRepository addressRepository;

    private final AddressMapper addressMapper;

    public AddressAdapter(AddressRepository addressRepository, AddressMapper addressMapper) {
        this.addressRepository = addressRepository;
        this.addressMapper = addressMapper;
    }

    @Override
    public List<AddressDto> getAll() {

        List<AddressEntity> addressEntityList = addressRepository.findAll();

        return addressMapper.mapEntityListToDtoList(addressEntityList);
    }

    @Override
    public AddressDto getById(String id) {

        AddressEntity addressEntity = addressRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Address id: " + id));

        return addressMapper.mapEntityToDto(addressEntity);
    }

    @Override
    public AddressDto createOrUpdate(AddressDto addressDto) {

        AddressEntity addressEntity = addressMapper.mapDtoToEntity(addressDto);

        return addressMapper.mapEntityToDto(addressRepository.save(addressEntity));
    }

    @Override
    public void removeById(String id) {
        addressRepository.deleteById(id);
    }

}
