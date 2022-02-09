package com.foo.service;

import static org.junit.jupiter.api.Assertions.*;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.junit.jupiter.api.Test;

import com.foo.myservice.Callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroStub;

import es.meh.catastro.www.ConsultaDNPDocument;
import es.meh.catastro.www.ConsultaDNPDocument.ConsultaDNP;
import es.meh.catastro.www.RefCatDocument;

public class ClientTest {

	@Test
	public void testReferenciaCatastralDeUnaParcela() throws RemoteException {
		Callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroStub stub = new Callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroStub();
		RefCatDocument refCat15 = RefCatDocument.Factory.newInstance();
		refCat15.setRefCat("0260113YJ2706S");
		
		// TEST
		ConsultaDNPDocument result = stub.consulta_DNPRC(refCat15);
		
		// ASSERT
		assertNotNull(result);
		ConsultaDNP consultaDNP = result.getConsultaDNP();
		assertNotNull(consultaDNP);
		System.out.println(consultaDNP.toString());
	}

	@Test
	public void testReferenciaCatastralDeUnaVivienda() throws RemoteException {
		Callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroStub stub = new Callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroStub();
		RefCatDocument refCat15 = RefCatDocument.Factory.newInstance();
		refCat15.setRefCat("0260113YJ2706S0002FE");
		
		// TEST
		ConsultaDNPDocument result = stub.consulta_DNPRC(refCat15);
		
		// ASSERT
		assertNotNull(result);
		ConsultaDNP consultaDNP = result.getConsultaDNP();
		assertNotNull(consultaDNP);
		System.out.println(consultaDNP.toString());
	}
}
