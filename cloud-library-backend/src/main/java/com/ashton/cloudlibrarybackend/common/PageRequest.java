package com.ashton.cloudlibrarybackend.common;

import lombok.Data;

@Data
public class PageRequest {

    /**
     * Current page number (default: 1)
     */
    private int current = 1;

    /**
     * Page size (default: 10)
     */
    private int pageSize = 10;

    /**
     * Field used for sorting
     */
    private String sortField;

    /**
     * Sorting order (default: descend)
     * Values: ascend / descend
     */
    private String sortOrder = "descend";
}
