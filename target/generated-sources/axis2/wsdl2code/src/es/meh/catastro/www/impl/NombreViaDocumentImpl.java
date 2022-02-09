/*
 * An XML document type.
 * Localname: NombreVia
 * Namespace: http://www.catastro.meh.es/
 * Java type: es.meh.catastro.www.NombreViaDocument
 *
 * Automatically generated - do not modify.
 */
package es.meh.catastro.www.impl;
/**
 * A document containing one NombreVia(@http://www.catastro.meh.es/) element.
 *
 * This is a complex type.
 */
public class NombreViaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements es.meh.catastro.www.NombreViaDocument
{
    private static final long serialVersionUID = 1L;
    
    public NombreViaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOMBREVIA$0 = 
        new javax.xml.namespace.QName("http://www.catastro.meh.es/", "NombreVia");
    
    
    /**
     * Gets the "NombreVia" element
     */
    public java.lang.String getNombreVia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBREVIA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NombreVia" element
     */
    public org.apache.xmlbeans.XmlString xgetNombreVia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREVIA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NombreVia" element
     */
    public void setNombreVia(java.lang.String nombreVia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBREVIA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMBREVIA$0);
            }
            target.setStringValue(nombreVia);
        }
    }
    
    /**
     * Sets (as xml) the "NombreVia" element
     */
    public void xsetNombreVia(org.apache.xmlbeans.XmlString nombreVia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREVIA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBREVIA$0);
            }
            target.set(nombreVia);
        }
    }
}
