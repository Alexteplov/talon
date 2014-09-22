package application;

import java.sql.*; 

public class SqlWork {
	public final Connection conn = null;

	public void ConnectToBase(Connection conn) throws ClassNotFoundException, SQLException {
		//Connect to LiteSql
		 Class.forName("org.sqlite.JDBC");
		 	Connection conn1 =
		      DriverManager.getConnection("jdbc:sqlite://192.168.1.8/hosp/talon/talon.db");
	}

//modify abstrct model 	
	public int GetDataCountRows(){
	//	System.out.println("I'm a live!");
    conn.setAutoCommit(false);
//    System.out.println("max = "+prep.executeQuery());
    ResultSet rs = conn.createStatement().executeQuery("select * from TALON");
    int j=0;
    //rs.getMetaData().getColumnCount();
    while(rs.next())
      {
    	//rs.getMetaData().getColumnCount(); узнать кол-во строчек
    	//System.out.println("j="+j);
    	for (int i=2; i<8; i++)
    	{
    		dataTable[j][i-2]=rs.getString(i);
    		//System.out.println("j="+j+" i="+i+" "+rs.getString(i));	
    	}
    	// read the result set
        
    	j++;
	      }
    conn.setAutoCommit(true);
	return (rs.getMetaData().getColumnCount()); 
//    Table.setModel(getModel());
//    Table.repaint();
	}
}
