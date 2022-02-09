package com.foo.service;

import java.rmi.RemoteException;

import com.foo.myservice.Callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroStub;

import es.meh.catastro.www.ConsultaDNPDocument;
import es.meh.catastro.www.RefCatDocument;

public class MainClient {

	public static void main(String[] args) throws RemoteException {
		Callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroStub stub = new Callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroStub();
		RefCatDocument refCat15 = RefCatDocument.Factory.newInstance();
		refCat15.setRefCat("0260113YJ2706S");
		
		// TEST
		ConsultaDNPDocument result = stub.consulta_DNPRC(refCat15);
		System.out.println(result);
	}

}
