package com.example.searchcar.request;

import com.example.searchcar.model.enums.SearchCriteria;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetCarRequest {
    private SearchCriteria searchCriteria;
    private String searchKey;
}
