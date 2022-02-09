/*
 * An XML document type.
 * Localname: Consulta_DNP
 * Namespace: http://www.catastro.meh.es/
 * Java type: es.meh.catastro.www.ConsultaDNPDocument
 *
 * Automatically generated - do not modify.
 */
package es.meh.catastro.www.impl;
/**
 * A document containing one Consulta_DNP(@http://www.catastro.meh.es/) element.
 *
 * This is a complex type.
 */
public class ConsultaDNPDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements es.meh.catastro.www.ConsultaDNPDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConsultaDNPDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONSULTADNP$0 = 
        new javax.xml.namespace.QName("http://www.catastro.meh.es/", "Consulta_DNP");
    
    
    /**
     * Gets the "Consulta_DNP" element
     */
    public es.meh.catastro.www.ConsultaDNPDocument.ConsultaDNP getConsultaDNP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            es.meh.catastro.www.ConsultaDNPDocument.ConsultaDNP target = null;
            target = (es.meh.catastro.www.ConsultaDNPDocument.ConsultaDNP)get_store().find_element_user(CONSULTADNP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Consulta_DNP" element
     */
    public void setConsultaDNP(es.meh.catastro.www.ConsultaDNPDocument.ConsultaDNP consultaDNP)
    {
        generatedSetterHelperImpl(consultaDNP, CONSULTADNP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Consulta_DNP" element
     */
    public es.meh.catastro.www.ConsultaDNPDocument.ConsultaDNP addNewConsultaDNP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            es.meh.catastro.www.ConsultaDNPDocument.ConsultaDNP target = null;
            target = (es.meh.catastro.www.ConsultaDNPDocument.ConsultaDNP)get_store().add_element_user(CONSULTADNP$0);
            return target;
        }
    }
    /**
     * An XML Consulta_DNP(@http://www.catastro.meh.es/).
     *
     * This is a complex type.
     */
    public static class ConsultaDNPImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements es.meh.catastro.www.ConsultaDNPDocument.ConsultaDNP
    {
        private static final long serialVersionUID = 1L;
        
        public ConsultaDNPImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
