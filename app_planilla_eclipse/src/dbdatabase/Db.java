package dbdatabase;

public class Db {
	String _IP="localhost", _USE = "root", _PORT = "3306", _PASSWORD = "", _BD="", _SQL ="";
	

	public Db(String db) {
		this._BD= db;
		getConnection();
	}

	public void getConnection() {
		try{
		Class.forName("com.mysql.jdbc.driver");
		cn = DriverManager.getConnection(String.format("jdbc:mysql://%s:%s/%S", _IP, _PORT, _BD ), _USE, _PASSWORD);
		
	 }Catch ()(classNotFoundException |  )
	}s
	public Object getRegistro() {
		// TODO Auto-generated method stub
		return null;
	}

	public void sentencia(String format) {
		// TODO Auto-generated method stub
		
	}

}
