package cl.awakelab.evaluacionElectrodomestico;

public class Lavadora extends Electrodomestico{
	 
	
	private int carga;
     
    private final static int CARGA_DEF=5;
  
    //Constructor
    
    public Lavadora(){
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
    }

    public Lavadora(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
    }
  
   
    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
        super(precioBase,peso, consumoEnergetico,color);
        this.carga=carga;
    }
    //Métodos publicos
  
    public int getCarga() {
        return carga;
    }
  
  
    public double precioFinal(){
        //Invocamos el método precioFinal del método padre
        double plus=super.precioFinal();
  
        //añadimos el código necesario
        if (carga>30){
            plus+=50;
        }
  
        return plus;
    }

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + "]";
	}
  
 
}