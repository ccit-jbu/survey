package com.qpick.survey.admin;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface ResultSetter<T> {
	public List<T> getResults(ResultSet rs) throws SQLException;
}
