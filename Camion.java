public class Camion
{
  private String matricula;
  private Integer capacidad;
  private double consumo;
  private Integer carga_actual;
  
  public Camion()
  {
  }
  
  public Camion(String matricula,Integer capacidad,double consumo,Integer carga_actual)
  {
    this.matricula=matricula;
    this.capacidad=capacidad;
    this.carga_actual=carga_actual;
    this.consumo=consumo;
  }
  
  public String getmatricula()
  {
    return matricula;
  }
  
  public Integer getcapacidad()
  {
    return capacidad;    
  }
  
  public double getconsumo()
  {
    return consumo;  
  }
  
  public Integer getcarga_actual()
  {
    return carga_actual;
  }
  
  public void setMatricula(String matricula)
  {
    this.matricula=matricula;
  }
  
  public void setCapacidad(Integer capacidad)
  {
    this.capacidad=capacidad;  
  }
  
  public void setConsumo(double consumo)
  {
    this.consumo=consumo;    
  }
  
  public void setCarga_actual(Integer carga_actual)
  {
    this.carga_actual=carga_actual;   
  }
  
  public boolean cargar(Integer peso_carga)
  {
    boolean cargo = false;
      if( peso_carga <= capacidad )
        {
            cargo = true;
            carga_actual = peso_carga;
        }
      return cargo;
    }
    
  public void descargar( )
    {
        carga_actual = 0;
    }  
}
