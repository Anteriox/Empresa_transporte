public class Empresa
{
  private Camion camion1;
  private Camion camion2;
  private Camion camion3;
  private Camion camion4;
  
  public Empresa( )
  {
    camion1 = new Camion( "BAC213", 150, 85.0, 100 );
    camion2 = new Camion( "CAP384", 190, 70.0, 0 );
    camion3 = new Camion( "GER273", 280, 100.0, 0 );
    camion4 = new Camion( "JKV232", 215, 110.0, 0 );

  }
  
  public Camion getcamion1( )
  {
    return camion1;
  }

  public Camion darCamion2( )
  {
    return camion2;
  }

  public Camion darCamion3( )
  {
    return camion3;
  }
 
  public Camion getCamion4( )
  {
    return camion4;
  }
    
  public boolean cargarCamion( String matricula, Integer peso_carga )
  {
    boolean cargo = false;
    if( camion1.getmatricula( ).equals( matricula) )
    {
      cargo = camion1.cargar( peso_carga );
    }
    else if( camion2.getmatricula( ).equals( matricula) )
    {
      cargo = camion2.cargar( peso_carga );
    }
    else if( camion3.getmatricula( ).equals( matricula ) )
    {
      cargo = camion3.cargar( peso_carga);
    }
    else if( camion4.getmatricula( ).equals( matricula ) )
    {
      cargo = camion4.cargar( peso_carga );
    }
    return cargo;
  }
  
  public void descargarCamion( String pMatricula )
  {
    if( camion1.getmatricula( ).equals( pMatricula ) )
    {
      camion1.descargar( );
    }
    else if( camion2.getmatricula( ).equals( pMatricula ) )
    {
      camion2.descargar( );
    }
    else if( camion3.getmatricula( ).equals( pMatricula ) )
    {
      camion3.descargar( );
    }
    else if( camion4.getmatricula( ).equals( pMatricula ) )
    {
       camion4.descargar( );
    }
  }
  
  public int getcapacidad_total( )
  {
    return camion1.getcapacidad( ) + camion2.getcapacidad( ) + camion3.getcapacidad( ) + camion4.getcapacidad( );
  }
  
  public int getcarga_Total( )
  {
    return camion1.getcarga_actual( ) + camion2.getcarga_actual( ) + camion3.getcarga_actual( ) + camion4.getcarga_actual( );
  }
  
  public double calcularCargaPromedio( )
  {
    double promedio = ( double ) ( getcarga_Total( ) / 4 );
    return promedio;
  }
  
  public Camion darMejorCamion( Integer peso_carga )
  {
    Camion mejor = null;
    if( camion1.getcapacidad( ) >= peso_carga)
    {
      mejor = camion1;
    }
    if( camion2.getcapacidad( ) >= peso_carga && camion2.getconsumo( ) < mejor.getconsumo( ) )
    {
      mejor = camion2;
    }
    if( camion3.getcapacidad( ) >= peso_carga && camion3.getconsumo( ) < mejor.getconsumo( ) )
    {
      mejor = camion3;
    }
     if( camion4.getcapacidad( ) >= peso_carga && camion4.getconsumo( ) < mejor.getconsumo( ) )
    {
      mejor = camion4;
    }
    return mejor;
  }
}
