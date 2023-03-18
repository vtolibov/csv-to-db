package com.vtolibov.demo.service;

import com.vtolibov.demo.dto.ElementsAsKeyAndValueResponse;
import com.vtolibov.demo.entity.ElementsAsKeyAndValueDao;
import com.vtolibov.demo.repository.CSVFileRepository;
import com.vtolibov.demo.repository.ElementAsKeyAndValueRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CsvFileServiceImpl implements CsvFileService {

    private final CSVFileRepository csvFileRepository;
    private final ElementAsKeyAndValueRepository elementAsKeyAndValueRepository;

    @Override
    public List<ElementsAsKeyAndValueDao> saveElementsAsKeyAndValue() {
        List<ElementsAsKeyAndValueResponse> elementsAsKeyAndValueResponse = csvFileRepository.getElementsAsKeyAndValueResponse();
        ModelMapper modelMapper = new ModelMapper();
        List<ElementsAsKeyAndValueDao> daos = new ArrayList<>();
        for (ElementsAsKeyAndValueResponse element : elementsAsKeyAndValueResponse) {
            ElementsAsKeyAndValueDao elementItem = modelMapper.map(element, ElementsAsKeyAndValueDao.class);
            daos.add(elementItem);
        }
        if (!daos.isEmpty()) {
            return elementAsKeyAndValueRepository.saveAll(daos);
        }
        return Collections.emptyList();
    }

    @Override
    public List<ElementsAsKeyAndValueResponse> getElementsAsKeyAndValueResponse() {
        List<ElementsAsKeyAndValueResponse> elementsAsKeyAndValueResponse = csvFileRepository.getElementsAsKeyAndValueResponse();
        if (!elementsAsKeyAndValueResponse.isEmpty()) {
            elementsAsKeyAndValueResponse.stream().sorted(Comparator.comparing(ElementsAsKeyAndValueResponse::getKey).thenComparing(ElementsAsKeyAndValueResponse::getValue));
        }
        return elementsAsKeyAndValueResponse;
    }


}
