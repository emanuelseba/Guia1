package cl.Paradigma.Guia1;

public class CuentaAgua {
	
 private long monto;
 private boolean pagado;
 private String direccion;
 private String fecha;
 
 public CuentaAgua(long monto,String direccion,String fecha){
	 if(monto> 0 ){
		 this.monto= monto;
		 
	 }else{
		 System.out.println("Monto "+monto+" no es valido");
	 }
	 this.direccion = direccion;
	 this.fecha = fecha;
	 this.pagado = true;
 }
 
 public boolean isPagado(){
		return pagado;
	}
 public long getMonto(){
	 return monto;

 }
public String getDireccion(){
	return direccion;
}
public void AbonarCuenta(long abonar){
	 this.monto= monto - abonar; 
}
public String getFecha(){
	return fecha;
}
}