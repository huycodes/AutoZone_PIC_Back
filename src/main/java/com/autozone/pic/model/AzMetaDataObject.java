package com.autozone.pic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AzMetaDataObject {

	private String createUserId;

    private String createUserTs;

    private String lastMaintainTs;

    private String lastMaintainUserId;

    private String schemaNm;

    private String schemaVersionTx;

}