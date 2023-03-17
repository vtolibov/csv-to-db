package com.vtolibov.demo.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ElementsAsKeyAndValueResponse {
    private Integer key;
    private String value;

    public ElementsAsKeyAndValueResponse(String key, String value) {
        this.key = Integer.parseInt(key);
        this.value = value;
    }
}
