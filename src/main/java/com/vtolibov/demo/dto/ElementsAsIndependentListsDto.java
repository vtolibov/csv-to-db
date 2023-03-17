package com.vtolibov.demo.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ElementsAsIndependentListsDto {
    private List<Integer> codes;
    private List<String> values;
}
