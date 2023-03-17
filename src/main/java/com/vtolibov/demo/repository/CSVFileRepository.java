package com.vtolibov.demo.repository;

import com.vtolibov.demo.dto.ElementsAsKeyAndValueResponse;
import com.vtolibov.demo.utils.FileUtils;
import com.vtolibov.demo.utils.StatusUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Repository
public class CSVFileRepository {

    public List<ElementsAsKeyAndValueResponse> getElementsAsKeyAndValueResponse() {
        List<ElementsAsKeyAndValueResponse> elementsAsKeyAndValueResponse = new ArrayList<>();
        try {
            List<String> list = Files.readAllLines(Paths.get(FileUtils.FILE_LOCATION));
            for (String line : list) {
                String[] element = line.split(FileUtils.ELEMENTS_SEPARATOR);
                if (!element[0].contains(FileUtils.COLUMN_NAME)) {
                    ElementsAsKeyAndValueResponse csvFileElements = new ElementsAsKeyAndValueResponse(element[0], element[1]);
                    elementsAsKeyAndValueResponse.add(csvFileElements);
                }
            }
        } catch (Exception e) {
            log.error(e.getLocalizedMessage() + StatusUtils.ERROR_IN_CSV_PROCESS);
        }
        return elementsAsKeyAndValueResponse;
    }
}
