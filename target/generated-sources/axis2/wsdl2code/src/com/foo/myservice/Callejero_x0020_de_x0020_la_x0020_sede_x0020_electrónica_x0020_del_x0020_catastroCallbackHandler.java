/**
 * Callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroCallbackHandler.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.0 Built on : Aug 01,
 * 2021 (07:27:19 HST)
 */
package com.foo.myservice;

/**
 * Callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroCallbackHandler
 * Callback class, Users can extend this class and implement their own receiveResult and
 * receiveError methods.
 */
public abstract
class Callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroCallbackHandler {

  protected Object clientData;

  /**
   * User can pass in any object that needs to be accessed once the NonBlocking Web service call is
   * finished and appropriate method of this CallBack is called.
   *
   * @param clientData Object mechanism by which the user can pass in user data that will be
   *     avilable at the time this callback is called.
   */
  public
  Callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroCallbackHandler(
      Object clientData) {
    this.clientData = clientData;
  }

  /** Please use this constructor if you don't want to set any clientData */
  public
  Callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroCallbackHandler() {
    this.clientData = null;
  }

  /** Get the client data */
  public Object getClientData() {
    return clientData;
  }

  /**
   * auto generated Axis2 call back method for obtenerCallejero method override this method for
   * handling normal response from obtenerCallejero operation
   */
  public void receiveResultobtenerCallejero(es.meh.catastro.www.CallejeroDocument result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * obtenerCallejero operation
   */
  public void receiveErrorobtenerCallejero(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for obtenerNumerero method override this method for
   * handling normal response from obtenerNumerero operation
   */
  public void receiveResultobtenerNumerero(es.meh.catastro.www.CallejeroDocument result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * obtenerNumerero operation
   */
  public void receiveErrorobtenerNumerero(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for consulta_DNPLOC method override this method for
   * handling normal response from consulta_DNPLOC operation
   */
  public void receiveResultconsulta_DNPLOC(es.meh.catastro.www.ConsultaDNPDocument result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * consulta_DNPLOC operation
   */
  public void receiveErrorconsulta_DNPLOC(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for obtenerMunicipios method override this method for
   * handling normal response from obtenerMunicipios operation
   */
  public void receiveResultobtenerMunicipios(es.meh.catastro.www.MunicipiosDocument result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * obtenerMunicipios operation
   */
  public void receiveErrorobtenerMunicipios(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for obtenerProvincias method override this method for
   * handling normal response from obtenerProvincias operation
   */
  public void receiveResultobtenerProvincias(es.meh.catastro.www.ProvinciasDocument result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * obtenerProvincias operation
   */
  public void receiveErrorobtenerProvincias(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for consulta_DNPPP method override this method for
   * handling normal response from consulta_DNPPP operation
   */
  public void receiveResultconsulta_DNPPP(es.meh.catastro.www.ConsultaDNPPPDocument result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * consulta_DNPPP operation
   */
  public void receiveErrorconsulta_DNPPP(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for consulta_DNPRC method override this method for
   * handling normal response from consulta_DNPRC operation
   */
  public void receiveResultconsulta_DNPRC(es.meh.catastro.www.ConsultaDNPDocument result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * consulta_DNPRC operation
   */
  public void receiveErrorconsulta_DNPRC(java.lang.Exception e) {}
}
