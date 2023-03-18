package com.vtolibov.demo.service;

import com.vtolibov.demo.dto.ElementsAsKeyAndValueResponse;
import com.vtolibov.demo.entity.ElementsAsKeyAndValueDao;

import java.util.List;

public interface CsvFileService {

    List<ElementsAsKeyAndValueResponse> getElementsAsKeyAndValueResponse();

    List<ElementsAsKeyAndValueDao>  saveElementsAsKeyAndValue();
}
