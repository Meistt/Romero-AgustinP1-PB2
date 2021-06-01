package romero.agustin.p1.pb2;

import romero.agustin.p1.pb2.interfaces.IGeografia;

public class Geografia extends Libro implements IGeografia{

	public Geografia(Integer codigoLibro, String nombreLibro, String autorLibro) {
		
		super(codigoLibro, nombreLibro, autorLibro);
	}

	@Override
	public String getImprisionDeLibro(String devolucion, String tipoLibro) {
		
		String devolucionLibro="Puedo ser fotocopiado";
		String devolucionError="No puedo ser fotocopiado";
		
		if(devolucion.equals(devolucionLibro) && tipoLibro.equalsIgnoreCase("Geografia")) {
			
			return devolucion;
			
		}else
			return devolucionError;
	}
		
}

