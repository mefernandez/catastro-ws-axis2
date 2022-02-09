/*
 * An XML document type.
 * Localname: Puerta
 * Namespace: http://www.catastro.meh.es/
 * Java type: es.meh.catastro.www.PuertaDocument
 *
 * Automatically generated - do not modify.
 */
package es.meh.catastro.www.impl;
/**
 * A document containing one Puerta(@http://www.catastro.meh.es/) element.
 *
 * This is a complex type.
 */
public class PuertaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements es.meh.catastro.www.PuertaDocument
{
    private static final long serialVersionUID = 1L;
    
    public PuertaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUERTA$0 = 
        new javax.xml.namespace.QName("http://www.catastro.meh.es/", "Puerta");
    
    
    /**
     * Gets the "Puerta" element
     */
    public java.lang.String getPuerta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUERTA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Puerta" element
     */
    public org.apache.xmlbeans.XmlString xgetPuerta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUERTA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Puerta" element
     */
    public void setPuerta(java.lang.String puerta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUERTA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUERTA$0);
            }
            target.setStringValue(puerta);
        }
    }
    
    /**
     * Sets (as xml) the "Puerta" element
     */
    public void xsetPuerta(org.apache.xmlbeans.XmlString puerta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUERTA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PUERTA$0);
            }
            target.set(puerta);
        }
    }
}
