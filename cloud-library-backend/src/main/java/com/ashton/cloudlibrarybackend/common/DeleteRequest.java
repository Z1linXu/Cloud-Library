package com.ashton.cloudlibrarybackend.common;

import lombok.Data;
import java.io.Serializable;

@Data
public class DeleteRequest implements Serializable {

    /**
     * ID of the resource to delete
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}
