package com.vtolibov.demo.controller;

import com.vtolibov.demo.dto.ElementsAsKeyAndValueResponse;
import com.vtolibov.demo.entity.ElementsAsKeyAndValueDao;
import com.vtolibov.demo.service.CsvFileService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ElementsController {
    private final CsvFileService csvFileService;

    @GetMapping("/elements-as-key-value")
    List<ElementsAsKeyAndValueResponse> getElementsAsKeyAndValueResponse() {
        return csvFileService.getElementsAsKeyAndValueResponse();
    }

    @PostMapping("/save/all")
    List<ElementsAsKeyAndValueDao>  postElementsAsKeyAndValueDaoAsList(){
        return csvFileService.saveElementsAsKeyAndValue();
    }
}
