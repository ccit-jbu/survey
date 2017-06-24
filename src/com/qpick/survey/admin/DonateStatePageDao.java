package com.qpick.survey.admin;

import java.sql.*;		
import java.util.*;		
import com.qpick.survey.admin.*;		
		
public class DonateStatePageDao extends BaseDao<DonateStatePage> {		
	public List<DonateStatePage> getLectures(DonateStatePage donateStatePage){	
		String sql = " SELECT DONATEDDATE, DONATEDNAME, DONATEDIMAGE, DONATEDTARGETMONEY, DONATEDCURRENTSTATUS, DONATEDACCUMMONEY, DONATEDTOTALACCUMMONEY, DONATEDCODE, USERID, DONATEDMONEY FROM DONATESTATEPAGE WHERE DONATEDDATE = ?  AND DONATEDCURRENTSTATUS = ?  AND DONATEDACCUMMONEY = ?  AND DONATEDTOTALACCUMMONEY = ?  AND DONATEDCODE = ? ";
		
		List<DonateStatePage> listDonateStatePages = 
		query(sql , donateStatePage, new StatementSetter(){
			 @Override
			 public void setPrameter(PreparedStatement st,  Object object)
			        throws SQLException {
			        DonateStatePage donateStatePage = (DonateStatePage) object;
			        int i = 1;

			        st.setString(i++, donateStatePage.getDonatedDate());



			        st.setInt(i++, donateStatePage.getDonatedCurrentStatus());
			        st.setInt(i++, donateStatePage.getDonatedAccumMoney());
			        st.setInt(i++, donateStatePage.getDonatedTotalAccumMoney());
			        st.setInt(i++, donateStatePage.getDonatedCode());




			}

		} , new ResultSetter<DonateStatePage>(){
			 @Override
			 public List<DonateStatePage> getResults(ResultSet rs) 
			        throws SQLException {
			        List<DonateStatePage> listDonateStatePage =new ArrayList<DonateStatePage>();
			        while(rs.next()){
			            DonateStatePage donateStatePage = new DonateStatePage();
			            donateStatePage.setDonatedDate(rs.getString("DONATEDDATE"));
			            donateStatePage.setDonatedName(rs.getString("DONATEDNAME"));
			            donateStatePage.setDonatedImage(rs.getString("DONATEDIMAGE"));
			            donateStatePage.setDonatedTargetMoney(rs.getInt("DONATEDTARGETMONEY"));
			            donateStatePage.setDonatedCurrentStatus(rs.getInt("DONATEDCURRENTSTATUS"));
			            donateStatePage.setDonatedAccumMoney(rs.getInt("DONATEDACCUMMONEY"));
			            donateStatePage.setDonatedTotalAccumMoney(rs.getInt("DONATEDTOTALACCUMMONEY"));
			            donateStatePage.setDonatedCode(rs.getInt("DONATEDCODE"));
			            donateStatePage.setUserId(rs.getString("USERID"));
			            donateStatePage.setDonatedMoney(rs.getInt("DONATEDMONEY"));







			            listDonateStatePage.add(donateStatePage); } 
			        return listDonateStatePage;}

		});
		return listDonateStatePages;
	}	
		
	public void insertDonateStatePage(List<DonateStatePage> donateStatePages){	
		String sql = " INSERT INTO donateStatePage ( DONATEDDATE, DONATEDNAME, DONATEDIMAGE, DONATEDTARGETMONEY, DONATEDCURRENTSTATUS, DONATEDACCUMMONEY, DONATEDTOTALACCUMMONEY, DONATEDCODE, USERID, DONATEDMONEY) VALUES (?,  ?,  ?,  ?,  ?,  ?,  ?,  ?,  ?,  ?)";
		update(sql, donateStatePages , new StatementSetter(){
			 @Override
			 public void setPrameter(PreparedStatement st,  Object object)
			        throws SQLException {
			        DonateStatePage donateStatePage = (DonateStatePage) object;
			        int i = 1;

			        st.setString(i++, donateStatePage.getDonatedDate());
			        st.setString(i++, donateStatePage.getDonatedName());
			        st.setString(i++, donateStatePage.getDonatedImage());
			        st.setInt(i++, donateStatePage.getDonatedTargetMoney());
			        st.setInt(i++, donateStatePage.getDonatedCurrentStatus());
			        st.setInt(i++, donateStatePage.getDonatedAccumMoney());
			        st.setInt(i++, donateStatePage.getDonatedTotalAccumMoney());
			        st.setInt(i++, donateStatePage.getDonatedCode());
			        st.setString(i++, donateStatePage.getUserId());
			        st.setInt(i++, donateStatePage.getDonatedMoney());




			}

		});
	}	
		
	public void updateDonateStatePage(List<DonateStatePage> donateStatePages){	
		String sql = "UPDATE DONATESTATEPAGE SET DONATEDDATE = ? , DONATEDNAME = ?, DONATEDIMAGE = ?, DONATEDTARGETMONEY = ?, DONATEDCURRENTSTATUS = ?, DONATEDACCUMMONEY = ?, DONATEDTOTALACCUMMONEY = ?, DONATEDCODE = ?, USERID = ?, DONATEDMONEY = ? WHERE DONATEDDATE = ?  AND DONATEDCURRENTSTATUS = ?  AND DONATEDACCUMMONEY = ?  AND DONATEDTOTALACCUMMONEY = ?  AND DONATEDCODE = ? ";
		update(sql, donateStatePages , new StatementSetter(){
			 @Override
			 public void setPrameter(PreparedStatement st,  Object object)
			        throws SQLException {
			        DonateStatePage donateStatePage = (DonateStatePage) object;
			        int i = 1;

			        st.setString(i++, donateStatePage.getDonatedDate());
			        st.setString(i++, donateStatePage.getDonatedName());
			        st.setString(i++, donateStatePage.getDonatedImage());
			        st.setInt(i++, donateStatePage.getDonatedTargetMoney());
			        st.setInt(i++, donateStatePage.getDonatedCurrentStatus());
			        st.setInt(i++, donateStatePage.getDonatedAccumMoney());
			        st.setInt(i++, donateStatePage.getDonatedTotalAccumMoney());
			        st.setInt(i++, donateStatePage.getDonatedCode());
			        st.setString(i++, donateStatePage.getUserId());
			        st.setInt(i++, donateStatePage.getDonatedMoney());
			        st.setInt(i++, donateStatePage.getDonatedCurrentStatus());
			        st.setInt(i++, donateStatePage.getDonatedAccumMoney());
			        st.setInt(i++, donateStatePage.getDonatedTotalAccumMoney());
			        st.setInt(i++, donateStatePage.getDonatedCode());

			}

		});
	}	
		
	public void deleteDonateStatePage(List<DonateStatePage> donateStatePages){	
		String sql = " DELETE FROM DONATESTATEPAGE WHERE DONATEDDATE = ?  AND DONATEDCURRENTSTATUS = ?  AND DONATEDACCUMMONEY = ?  AND DONATEDTOTALACCUMMONEY = ?  AND DONATEDCODE = ? ";
		update(sql, donateStatePages , new StatementSetter(){ @Override
			 public void setPrameter(PreparedStatement st,  Object object)
				        throws SQLException {
				        DonateStatePage donateStatePage = (DonateStatePage) object;
				        int i = 1;

				        st.setString(i++, donateStatePage.getDonatedDate());
				        st.setInt(i++, donateStatePage.getDonatedCurrentStatus());
				        st.setInt(i++, donateStatePage.getDonatedAccumMoney());
				        st.setInt(i++, donateStatePage.getDonatedTotalAccumMoney());
				        st.setInt(i++, donateStatePage.getDonatedCode());




				}
});
	}	
		
	public void insertDonateStatePage(DonateStatePage donateStatePage){	
	    	List<DonateStatePage> donateStatePages = new ArrayList<DonateStatePage>();
	    	donateStatePages.add(donateStatePage);
	    	
	    	insertDonateStatePage(donateStatePages);
	}	
		
	public void updateDonateStatePage(DonateStatePage donateStatePage){	
	    	List<DonateStatePage> donateStatePages = new ArrayList<DonateStatePage>();
	    	donateStatePages.add(donateStatePage);
	    	
	    	updateDonateStatePage(donateStatePages);
	}	
		
	public void deleteDonateStatePage(DonateStatePage donateStatePage){	
	    	List<DonateStatePage> donateStatePages = new ArrayList<DonateStatePage>();
	    	donateStatePages.add(donateStatePage);
	    	
	    	deleteDonateStatePage(donateStatePages);
	}	
		
}		
