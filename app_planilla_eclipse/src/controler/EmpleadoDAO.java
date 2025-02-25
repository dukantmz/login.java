package controler;
import dbdatabase.Db;
import model.Empleado;

public class EmpleadoDAO {
  Db db = new Db("plantilla");
  public boolean login(Empleado empleado) {
	  db.sentencia(String.format("call sp_getEmpleadoLogin('%s','%s')", empleado.getDni(), empleado.getPasswordd()));
	  empleado.setRegistro(db.getRegistro());
	  return empleado.getId() > 0;
  }
}

