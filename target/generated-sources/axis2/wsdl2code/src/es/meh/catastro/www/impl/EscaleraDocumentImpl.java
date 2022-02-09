/*
 * An XML document type.
 * Localname: Escalera
 * Namespace: http://www.catastro.meh.es/
 * Java type: es.meh.catastro.www.EscaleraDocument
 *
 * Automatically generated - do not modify.
 */
package es.meh.catastro.www.impl;
/**
 * A document containing one Escalera(@http://www.catastro.meh.es/) element.
 *
 * This is a complex type.
 */
public class EscaleraDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements es.meh.catastro.www.EscaleraDocument
{
    private static final long serialVersionUID = 1L;
    
    public EscaleraDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ESCALERA$0 = 
        new javax.xml.namespace.QName("http://www.catastro.meh.es/", "Escalera");
    
    
    /**
     * Gets the "Escalera" element
     */
    public java.lang.String getEscalera()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESCALERA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Escalera" element
     */
    public org.apache.xmlbeans.XmlString xgetEscalera()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESCALERA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Escalera" element
     */
    public void setEscalera(java.lang.String escalera)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESCALERA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESCALERA$0);
            }
            target.setStringValue(escalera);
        }
    }
    
    /**
     * Sets (as xml) the "Escalera" element
     */
    public void xsetEscalera(org.apache.xmlbeans.XmlString escalera)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESCALERA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ESCALERA$0);
            }
            target.set(escalera);
        }
    }
}
