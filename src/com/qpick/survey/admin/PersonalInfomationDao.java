package com.qpick.survey.admin;

import java.sql.*;		
import java.util.*;		

public class PersonalInfomationDao extends BaseDao<PersonalInfomation> {		
	public List<PersonalInfomation> getLectures(PersonalInfomation personalInfomation){	
		String sql = " SELECT CUSTOMEREMAIL, CUSTOMERPASSWORD, CUSTOMERNAME, CUSTOMEREDUCATIONLEVEL, CUSTOMERJOB, CUSTOMERGENDER, CUSTOMERPHONENUMBER, CUSTOMERMARRIAGE, CUSTORMERCODE, CUSTOMERCODEPOSTAL, CUSTOMERLOCATIONCODESTATE, CUSTOMERLOCATIONCODECITY, CUSTOMERLOCATIONCODECOUNTRY, CUSTOMERLIVE , CUSTOMERLEVELCODE, CUSTOMERPOINT, CUSTOMERJOBCODE FROM PERSONALINFOMATION WHERE CUSTOMERPASSWORD = ?  AND CUSTORMERCODE = ?  AND CUSTOMERLEVELCODE = ?  AND CUSTOMERJOBCODE = ? ";
		
		List<PersonalInfomation> listPersonalInfomations = 
		query(sql , personalInfomation, new StatementSetter(){
			 @Override
			 public void setPrameter(PreparedStatement st,  Object object)
			        throws SQLException {
			        PersonalInfomation personalInfomation = (PersonalInfomation) object;
			        int i = 1;


			        st.setInt(i++, personalInfomation.getCustomerPassword());
			        st.setInt(i++, personalInfomation.getCustormerCode());
			        st.setInt(i++, personalInfomation.getCustomerLevelCode());
			        st.setInt(i++, personalInfomation.getCustomerJobCode());




			}

		} , new ResultSetter<PersonalInfomation>(){ @Override
			 public List<PersonalInfomation> getResults(ResultSet rs) 
				        throws SQLException {
				        List<PersonalInfomation> listPersonalInfomation =new ArrayList<PersonalInfomation>();
				        while(rs.next()){
				            PersonalInfomation personalInfomation = new PersonalInfomation();
				            personalInfomation.setCustomerEmail(rs.getString("CUSTOMEREMAIL"));
				            personalInfomation.setCustomerPassword(rs.getInt("CUSTOMERPASSWORD"));
				            personalInfomation.setCustomerName(rs.getInt("CUSTOMERNAME"));
				            personalInfomation.setCustomerEducationLevel(rs.getInt("CUSTOMEREDUCATIONLEVEL"));
				            personalInfomation.setCustomerJob(rs.getString("CUSTOMERJOB"));
				            personalInfomation.setCustomerGender(rs.getInt("CUSTOMERGENDER"));
				            personalInfomation.setCustomerPhoneNumber(rs.getString("CUSTOMERPHONENUMBER"));
				            personalInfomation.setCustomerMarriage(rs.getInt("CUSTOMERMARRIAGE"));
				            personalInfomation.setCustormerCode(rs.getInt("CUSTORMERCODE"));
				            personalInfomation.setCustomerCodePostal(rs.getString("CUSTOMERCODEPOSTAL"));
				            personalInfomation.setCustomerLocationCodeState(rs.getString("CUSTOMERLOCATIONCODESTATE"));
				            personalInfomation.setCustomerLocationCodeCity(rs.getString("CUSTOMERLOCATIONCODECITY"));
				            personalInfomation.setCustomerLocationCodeCountry(rs.getString("CUSTOMERLOCATIONCODECOUNTRY"));
				            personalInfomation.setCustomerLive (rs.getString("CUSTOMERLIVE "));
				            personalInfomation.setCustomerLevelCode(rs.getInt("CUSTOMERLEVELCODE"));
				            personalInfomation.setCustomerPoint(rs.getInt("CUSTOMERPOINT"));
				            personalInfomation.setCustomerJobCode(rs.getInt("CUSTOMERJOBCODE"));

				            listPersonalInfomation.add(personalInfomation); } 
				        return listPersonalInfomation;}
});
		return listPersonalInfomations;
	}	
		
	public void insertPersonalInfomation(List<PersonalInfomation> personalInfomations){	
		String sql = " INSERT INTO personalInfomation ( CUSTOMEREMAIL, CUSTOMERPASSWORD, CUSTOMERNAME, CUSTOMEREDUCATIONLEVEL, CUSTOMERJOB, CUSTOMERGENDER, CUSTOMERPHONENUMBER, CUSTOMERMARRIAGE, CUSTORMERCODE, CUSTOMERCODEPOSTAL, CUSTOMERLOCATIONCODESTATE, CUSTOMERLOCATIONCODECITY, CUSTOMERLOCATIONCODECOUNTRY, CUSTOMERLIVE , CUSTOMERLEVELCODE, CUSTOMERPOINT, CUSTOMERJOBCODE) VALUES (?,  ?,  ?,  ?,  ?,  ?,  ?,  ?,  ?,  ?,  ?,  ?,  ?,  ?,  ?,  ?,  ?)";
		update(sql, personalInfomations , new StatementSetter(){
			 @Override
			 public void setPrameter(PreparedStatement st,  Object object)
			        throws SQLException {
			        PersonalInfomation personalInfomation = (PersonalInfomation) object;
			        int i = 1;

			        st.setString(i++, personalInfomation.getCustomerEmail());
			        st.setInt(i++, personalInfomation.getCustomerPassword());
			        st.setInt(i++, personalInfomation.getCustomerName());
			        st.setInt(i++, personalInfomation.getCustomerEducationLevel());
			        st.setString(i++, personalInfomation.getCustomerJob());
			        st.setInt(i++, personalInfomation.getCustomerGender());
			        st.setString(i++, personalInfomation.getCustomerPhoneNumber());
			        st.setInt(i++, personalInfomation.getCustomerMarriage());
			        st.setInt(i++, personalInfomation.getCustormerCode());
			        st.setString(i++, personalInfomation.getCustomerCodePostal());
			        st.setString(i++, personalInfomation.getCustomerLocationCodeState());
			        st.setString(i++, personalInfomation.getCustomerLocationCodeCity());
			        st.setString(i++, personalInfomation.getCustomerLocationCodeCountry());
			        st.setString(i++, personalInfomation.getCustomerLive ());
			        st.setInt(i++, personalInfomation.getCustomerLevelCode());
			        st.setInt(i++, personalInfomation.getCustomerPoint());
			        st.setInt(i++, personalInfomation.getCustomerJobCode());




			}

		});
	}	
		
	public void updatePersonalInfomation(List<PersonalInfomation> personalInfomations){	
		String sql = "UPDATE PERSONALINFOMATION SET CUSTOMEREMAIL = ? , CUSTOMERPASSWORD = ?, CUSTOMERNAME = ?, CUSTOMEREDUCATIONLEVEL = ?, CUSTOMERJOB = ?, CUSTOMERGENDER = ?, CUSTOMERPHONENUMBER = ?, CUSTOMERMARRIAGE = ?, CUSTORMERCODE = ?, CUSTOMERCODEPOSTAL = ?, CUSTOMERLOCATIONCODESTATE = ?, CUSTOMERLOCATIONCODECITY = ?, CUSTOMERLOCATIONCODECOUNTRY = ?, CUSTOMERLIVE  = ?, CUSTOMERLEVELCODE = ?, CUSTOMERPOINT = ?, CUSTOMERJOBCODE = ? WHERE CUSTOMERPASSWORD = ?  AND CUSTORMERCODE = ?  AND CUSTOMERLEVELCODE = ?  AND CUSTOMERJOBCODE = ? ";
		update(sql, personalInfomations , new StatementSetter(){
			 @Override
			 public void setPrameter(PreparedStatement st,  Object object)
			        throws SQLException {
			        PersonalInfomation personalInfomation = (PersonalInfomation) object;
			        int i = 1;

			        st.setString(i++, personalInfomation.getCustomerEmail());
			        st.setInt(i++, personalInfomation.getCustomerPassword());
			        st.setInt(i++, personalInfomation.getCustomerName());
			        st.setInt(i++, personalInfomation.getCustomerEducationLevel());
			        st.setString(i++, personalInfomation.getCustomerJob());
			        st.setInt(i++, personalInfomation.getCustomerGender());
			        st.setString(i++, personalInfomation.getCustomerPhoneNumber());
			        st.setInt(i++, personalInfomation.getCustomerMarriage());
			        st.setInt(i++, personalInfomation.getCustormerCode());
			        st.setString(i++, personalInfomation.getCustomerCodePostal());
			        st.setString(i++, personalInfomation.getCustomerLocationCodeState());
			        st.setString(i++, personalInfomation.getCustomerLocationCodeCity());
			        st.setString(i++, personalInfomation.getCustomerLocationCodeCountry());
			        st.setString(i++, personalInfomation.getCustomerLive ());
			        st.setInt(i++, personalInfomation.getCustomerLevelCode());
			        st.setInt(i++, personalInfomation.getCustomerPoint());
			        st.setInt(i++, personalInfomation.getCustomerJobCode());
			        st.setInt(i++, personalInfomation.getCustomerPassword());
			        st.setInt(i++, personalInfomation.getCustormerCode());
			        st.setInt(i++, personalInfomation.getCustomerLevelCode());
			        st.setInt(i++, personalInfomation.getCustomerJobCode());




			}

		});
	}	
		
	public void deletePersonalInfomation(List<PersonalInfomation> personalInfomations){	
		String sql = " DELETE FROM PERSONALINFOMATION WHERE CUSTOMERPASSWORD = ?  AND CUSTORMERCODE = ?  AND CUSTOMERLEVELCODE = ?  AND CUSTOMERJOBCODE = ? ";
		update(sql, personalInfomations , new StatementSetter(){
			 @Override
			 public void setPrameter(PreparedStatement st,  Object object)
			        throws SQLException {
			        PersonalInfomation personalInfomation = (PersonalInfomation) object;
			        int i = 1;

			        
			        st.setInt(i++, personalInfomation.getCustomerPassword());
   			        st.setInt(i++, personalInfomation.getCustormerCode());	        
			        st.setInt(i++, personalInfomation.getCustomerLevelCode());   
			        st.setInt(i++, personalInfomation.getCustomerJobCode());



			}

		});
	}	
		
	public void insertPersonalInfomation(PersonalInfomation personalInfomation){	
	    	List<PersonalInfomation> personalInfomations = new ArrayList<PersonalInfomation>();
	    	personalInfomations.add(personalInfomation);
	    	
	    	insertPersonalInfomation(personalInfomations);
	}	
		
	public void updatePersonalInfomation(PersonalInfomation personalInfomation){	
	    	List<PersonalInfomation> personalInfomations = new ArrayList<PersonalInfomation>();
	    	personalInfomations.add(personalInfomation);
	    	
	    	updatePersonalInfomation(personalInfomations);
	}	
		
	public void deletePersonalInfomation(PersonalInfomation personalInfomation){	
	    	List<PersonalInfomation> personalInfomations = new ArrayList<PersonalInfomation>();
	    	personalInfomations.add(personalInfomation);
	    	
	    	deletePersonalInfomation(personalInfomations);
	}	
		
}		
