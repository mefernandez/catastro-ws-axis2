/*
 * An XML document type.
 * Localname: Consulta_DNPPP
 * Namespace: http://www.catastro.meh.es/
 * Java type: es.meh.catastro.www.ConsultaDNPPPDocument
 *
 * Automatically generated - do not modify.
 */
package es.meh.catastro.www.impl;
/**
 * A document containing one Consulta_DNPPP(@http://www.catastro.meh.es/) element.
 *
 * This is a complex type.
 */
public class ConsultaDNPPPDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements es.meh.catastro.www.ConsultaDNPPPDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConsultaDNPPPDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONSULTADNPPP$0 = 
        new javax.xml.namespace.QName("http://www.catastro.meh.es/", "Consulta_DNPPP");
    
    
    /**
     * Gets the "Consulta_DNPPP" element
     */
    public es.meh.catastro.www.ConsultaDNPPPDocument.ConsultaDNPPP getConsultaDNPPP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            es.meh.catastro.www.ConsultaDNPPPDocument.ConsultaDNPPP target = null;
            target = (es.meh.catastro.www.ConsultaDNPPPDocument.ConsultaDNPPP)get_store().find_element_user(CONSULTADNPPP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Consulta_DNPPP" element
     */
    public void setConsultaDNPPP(es.meh.catastro.www.ConsultaDNPPPDocument.ConsultaDNPPP consultaDNPPP)
    {
        generatedSetterHelperImpl(consultaDNPPP, CONSULTADNPPP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Consulta_DNPPP" element
     */
    public es.meh.catastro.www.ConsultaDNPPPDocument.ConsultaDNPPP addNewConsultaDNPPP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            es.meh.catastro.www.ConsultaDNPPPDocument.ConsultaDNPPP target = null;
            target = (es.meh.catastro.www.ConsultaDNPPPDocument.ConsultaDNPPP)get_store().add_element_user(CONSULTADNPPP$0);
            return target;
        }
    }
    /**
     * An XML Consulta_DNPPP(@http://www.catastro.meh.es/).
     *
     * This is a complex type.
     */
    public static class ConsultaDNPPPImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements es.meh.catastro.www.ConsultaDNPPPDocument.ConsultaDNPPP
    {
        private static final long serialVersionUID = 1L;
        
        public ConsultaDNPPPImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
