package com.masti.health.HealthManagment.utils;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.masti.health.HealthManagment.model.*;
public class InsurancePackageMapper implements RowMapper<InsurancePackages> {

    @Override
    public InsurancePackages mapRow(ResultSet rs, int rowNum) throws SQLException {
        InsurancePackages insp = new InsurancePackages();
        insp.setInspId(rs.getInt("insp_id"));
        insp.setInspTitle(rs.getString("insp_title"));
        insp.setInspDesc(rs.getString("insp_desc"));
        insp.setInspStatus(rs.getString("insp_status"));
        insp.setInspRangeStart(rs.getInt("insp_range_start"));
        insp.setInspRangeEnd(rs.getInt("insp_range_end"));
        insp.setInspAgeLimitStart(rs.getInt("insp_agelimit_start"));
        insp.setInspAgeLimitEnd(rs.getInt("insp_agelimit_end"));
        return insp;
    }
}

