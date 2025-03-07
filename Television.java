package cl.awakelab.evaluacionElectrodomestico;

public class Television extends Electrodomestico{
	 
	 //atributos 
    private int resolucion;
  
    private boolean sintonizadorTDT;
  
    private final static int RESOLUCION_DEF=20;
    
    //Constructor    
    public Television(){
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, RESOLUCION_DEF, false);
    }
 
    public Television(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF, RESOLUCION_DEF, false);
    }
  
    public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }
   
    //M�todos 
 
    public double precioFinal(){
        
        double plus=super.precioFinal();
  
       
        if (resolucion>40){
            plus+=getPrecioBase()*0.3;
        }
        if (sintonizadorTDT){
            plus+=50;
        }
  
        return plus;
    }

	@Override
	public String toString() {
		return "Television [resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + "]";
	}
  
  
}
