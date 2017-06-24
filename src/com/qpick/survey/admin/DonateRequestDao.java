package com.qpick.survey.admin;

import java.sql.*;		
import java.util.*;				
		
public class DonateRequestDao extends BaseDao<DonateRequest> {		
	public List<DonateRequest> getLectures(DonateRequest donateRequest){	
		String sql = " SELECT CUSTOMERPOINT, DONATEDCODE, USEPOINT, CUSTORMERCODE FROM DONATEREQUEST WHERE DONATEDCODE = ?  AND CUSTORMERCODE = ? ";
		
		List<DonateRequest> listDonateRequests = 
		query(sql , donateRequest, new StatementSetter(){
			 @Override
			 public void setPrameter(PreparedStatement st,  Object object)
			        throws SQLException {
			        DonateRequest donateRequest = (DonateRequest) object;
			        int i = 1;


			        st.setInt(i++, donateRequest.getDonatedCode());

			        st.setInt(i++, donateRequest.getCustormerCode());

			}

		} , new ResultSetter<DonateRequest>(){
			 @Override
			 public List<DonateRequest> getResults(ResultSet rs) 
			        throws SQLException {
			        List<DonateRequest> listDonateRequest =new ArrayList<DonateRequest>();
			        while(rs.next()){
			            DonateRequest donateRequest = new DonateRequest();
			            donateRequest.setCustomerPoint(rs.getInt("CUSTOMERPOINT"));
			            donateRequest.setDonatedCode(rs.getInt("DONATEDCODE"));
			            donateRequest.setUsePoint(rs.getInt("USEPOINT"));
			            donateRequest.setCustormerCode(rs.getInt("CUSTORMERCODE"));



			            listDonateRequest.add(donateRequest); } 
			        return listDonateRequest;}

		});
		return listDonateRequests;
	}	
		
	public void insertDonateRequest(List<DonateRequest> donateRequests){	
		String sql = " INSERT INTO donateRequest ( CUSTOMERPOINT, DONATEDCODE, USEPOINT, CUSTORMERCODE) VALUES (?,  ?,  ?,  ?)";
		update(sql, donateRequests , new StatementSetter(){
			 @Override
			 public void setPrameter(PreparedStatement st,  Object object)
			        throws SQLException {
			        DonateRequest donateRequest = (DonateRequest) object;
			        int i = 1;

			        st.setInt(i++, donateRequest.getCustomerPoint());
			        st.setInt(i++, donateRequest.getDonatedCode());
			        st.setInt(i++, donateRequest.getUsePoint());
			        st.setInt(i++, donateRequest.getCustormerCode());


			}

		});
	}	
		
	public void updateDonateRequest(List<DonateRequest> donateRequests){	
		String sql = "UPDATE DONATEREQUEST SET CUSTOMERPOINT = ? , DONATEDCODE = ?, USEPOINT = ?, CUSTORMERCODE = ? WHERE DONATEDCODE = ?  AND CUSTORMERCODE = ? ";
		update(sql, donateRequests , new StatementSetter(){
			 @Override
			 public void setPrameter(PreparedStatement st,  Object object)
			        throws SQLException {
			        DonateRequest donateRequest = (DonateRequest) object;
			        int i = 1;

			        st.setInt(i++, donateRequest.getCustomerPoint());
			        st.setInt(i++, donateRequest.getDonatedCode());
			        st.setInt(i++, donateRequest.getUsePoint());
			        st.setInt(i++, donateRequest.getCustormerCode());

			}

		});
	}	
		
	public void deleteDonateRequest(List<DonateRequest> donateRequests){	
		String sql = " DELETE FROM DONATEREQUEST WHERE DONATEDCODE = ?  AND CUSTORMERCODE = ? ";
		update(sql, donateRequests , new StatementSetter(){
			 @Override
			 public void setPrameter(PreparedStatement st,  Object object)
			        throws SQLException {
			        DonateRequest donateRequest = (DonateRequest) object;
			        int i = 1;
			        
			        st.setInt(i++, donateRequest.getDonatedCode());
			        st.setInt(i++, donateRequest.getCustormerCode());

			}

		});
	}	
		
	public void insertDonateRequest(DonateRequest donateRequest){	
	    	List<DonateRequest> donateRequests = new ArrayList<DonateRequest>();
	    	donateRequests.add(donateRequest);
	    	
	    	insertDonateRequest(donateRequests);
	}	
		
	public void updateDonateRequest(DonateRequest donateRequest){	
	    	List<DonateRequest> donateRequests = new ArrayList<DonateRequest>();
	    	donateRequests.add(donateRequest);
	    	
	    	updateDonateRequest(donateRequests);
	}	
		
	public void deleteDonateRequest(DonateRequest donateRequest){	
	    	List<DonateRequest> donateRequests = new ArrayList<DonateRequest>();
	    	donateRequests.add(donateRequest);
	    	
	    	deleteDonateRequest(donateRequests);
	}	
		
}		
