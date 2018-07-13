package io.jboot.admin.service.entity.model;

import io.jboot.admin.service.entity.status.system.DataStatus;
import io.jboot.db.annotation.Table;
import io.jboot.admin.service.entity.model.base.BaseFacAgency;

/**
 * Generated by Jboot.
 */
@Table(tableName = "fac_agency", primaryKey = "id")
public class FacAgency extends BaseFacAgency<FacAgency> {
    public void setStatus(java.lang.String status) {
        if (status == DataStatus.USED) {
            setIsEnable(1);
        } else {
            setIsEnable(0);
        }
    }

    public java.lang.String getStatus() {
        if (this.getIsEnable() == 1) {
            return DataStatus.USED;
        } else {
            return DataStatus.UNUSED;
        }
    }
}
