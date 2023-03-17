package com.vtolibov.demo.service;

import com.vtolibov.demo.dto.ElementsAsKeyAndValueResponse;
import com.vtolibov.demo.repository.CSVFileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CsvFileServiceImpl implements CsvFileService {

    private final CSVFileRepository csvFileRepository;

    @Override
    public List<ElementsAsKeyAndValueResponse> getElementsAsKeyAndValueResponse() {
        List<ElementsAsKeyAndValueResponse> elementsAsKeyAndValueResponse = csvFileRepository.getElementsAsKeyAndValueResponse();
        if (!elementsAsKeyAndValueResponse.isEmpty()) {
            elementsAsKeyAndValueResponse.stream().sorted(Comparator.comparing(ElementsAsKeyAndValueResponse::getKey).thenComparing(ElementsAsKeyAndValueResponse::getValue));
        }
        return elementsAsKeyAndValueResponse;
    }
}
