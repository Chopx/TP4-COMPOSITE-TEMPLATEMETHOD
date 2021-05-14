package ar.unrn.modelo;

public class RemeraNacional extends Remera {

	public RemeraNacional(int precioRemera) {
		super(precioRemera);
	}


	@Override
	protected double recargoPrecioFinal(double precioRemera) {
		return (precioRemera * 15) / 100;
	}

	@Override
	protected double recargoTransporte(double precioRemera) {
		return (precioRemera * 1.5) / 100;
	}


	@Override
	protected double recargoBonificacion(double precioRemera) {
		return (precioRemera * 20) / 100;
	}

	

	@Override
	protected double recargoImpuestoAduanero(double recargoImportadas) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	protected double recargoImportadas(double precioRemera) {
		// TODO Auto-generated method stub
		return 0;
	}

}
