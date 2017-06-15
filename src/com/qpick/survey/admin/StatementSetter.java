package com.qpick.survey.admin;

import java.sql.SQLException;

public interface StatementSetter {
	public void setPrameter(java.sql.PreparedStatement st, Object object) throws SQLException;
}
