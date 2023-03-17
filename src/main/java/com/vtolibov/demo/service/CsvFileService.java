package com.vtolibov.demo.service;

import com.vtolibov.demo.dto.ElementsAsKeyAndValueResponse;

import java.util.List;

public interface CsvFileService {

    List<ElementsAsKeyAndValueResponse> getElementsAsKeyAndValueResponse();

}
