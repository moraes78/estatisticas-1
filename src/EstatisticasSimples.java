public class EstatisticasSimples {

	public static double calculaValorMinimo(double[] valoresDeEntrada) {
		double minimo = valoresDeEntrada[0];
		for(int i = 0; i < valoresDeEntrada.length; i++){
			if(valoresDeEntrada[i] < minimo){
				minimo = valoresDeEntrada[i];
		    }
		}
			return minimo;	
	}

	public static double calculaValorMaximo(double[] valoresDeEntrada) {
		double maximo = valoresDeEntrada[0];
		for(int i = 0; i < valoresDeEntrada.length; i++){
			if(valoresDeEntrada[i] > maximo){
			maximo = valoresDeEntrada[i];
		    }
		}
			return maximo;	
	}

	public static int calculaQuantidade(double[] valoresDeEntrada) {
		return  valoresDeEntrada.length;
	}

	public static double calculaMedia(double[] valoresDeEntrada) {
		double somaValores =0;
		for(int i = 0; i <valoresDeEntrada.length; i++){
			
			somaValores = somaValores + valoresDeEntrada[i];
		}
		double media = somaValores / valoresDeEntrada.length;
		return media;
	}

	public static double[] calcula(double[] valoresDeEntrada) {
		double [] todos = new double[4];
		todos[0] = calculaValorMinimo(valoresDeEntrada);
		todos[1] = calculaValorMaximo(valoresDeEntrada);
		todos[2] = calculaQuantidade(valoresDeEntrada);
		todos[3] = calculaMedia(valoresDeEntrada);
		return todos;
	}	
}
