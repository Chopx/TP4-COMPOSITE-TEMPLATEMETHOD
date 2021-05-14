package ar.unrn.modelo;

public class RemeraImportada extends Remera {

	public RemeraImportada(int precioRemera) {
		super(precioRemera);
	}

	@Override
	protected double recargoPrecioFinal(double precioRemera) {
		return (precioRemera * 25) / 100;
	}


	@Override
	protected double recargoImpuestoAduanero(double precioRemera) {
		return (precioRemera * 5) / 100;
	}


	@Override
	protected double recargoImportadas(double precioRemera) {
		return (precioRemera * 3) / 100;
	}


	@Override
	protected double recargoTransporte(double precioRemera) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	protected double recargoBonificacion(double precioRemera) {
		// TODO Auto-generated method stub
		return 0;
	}

}
