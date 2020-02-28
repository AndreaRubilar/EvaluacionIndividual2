package cl.awakelab.evaluacionElectrodomestico;

public class Ejecutable {
	 
    public static void main(String[] args) {
    	 double sumaElectrodomesticos=0;
         double sumaTelevisiones=0;
         double sumaLavadoras=0;
        
        Electrodomestico listaElectrodomesticos[]=new Electrodomestico[10];   

        listaElectrodomesticos[0]=new Lavadora();
        listaElectrodomesticos[1]=new Electrodomestico(400, 80, 'C', "negro");
        listaElectrodomesticos[2]=new Television(500, 80, 'B', "verde", 30, false);
        listaElectrodomesticos[3]=new Electrodomestico(100, 60, 'C', "azul");
        listaElectrodomesticos[4]=new Television(400, 30, 'D', "rojo", 0, false);
        listaElectrodomesticos[5]=new Lavadora(300, 40, 'G', "blanco", 40);
        listaElectrodomesticos[6]=new Television(340, 60);
        listaElectrodomesticos[7]=new Electrodomestico(300, 40, 'C', "blanco");
        listaElectrodomesticos[8]=new Television(200, 60, 'F', "naranja", 30, true);
        listaElectrodomesticos[9]=new Lavadora(250, 30);
   
       
   
        for(int i=0;i<listaElectrodomesticos.length;i++){
           
          
   
            if(listaElectrodomesticos[i] instanceof Electrodomestico){
                sumaElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Lavadora){
                sumaLavadoras+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Television){
                sumaTelevisiones+=listaElectrodomesticos[i].precioFinal();
            }
        }
   
        // resultados
        System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisiones);
   
    }
   
}
