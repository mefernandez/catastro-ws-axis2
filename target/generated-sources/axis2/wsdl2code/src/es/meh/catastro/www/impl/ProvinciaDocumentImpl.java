/*
 * An XML document type.
 * Localname: Provincia
 * Namespace: http://www.catastro.meh.es/
 * Java type: es.meh.catastro.www.ProvinciaDocument
 *
 * Automatically generated - do not modify.
 */
package es.meh.catastro.www.impl;
/**
 * A document containing one Provincia(@http://www.catastro.meh.es/) element.
 *
 * This is a complex type.
 */
public class ProvinciaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements es.meh.catastro.www.ProvinciaDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProvinciaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROVINCIA$0 = 
        new javax.xml.namespace.QName("http://www.catastro.meh.es/", "Provincia");
    
    
    /**
     * Gets the "Provincia" element
     */
    public java.lang.String getProvincia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVINCIA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Provincia" element
     */
    public org.apache.xmlbeans.XmlString xgetProvincia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROVINCIA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Provincia" element
     */
    public void setProvincia(java.lang.String provincia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVINCIA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROVINCIA$0);
            }
            target.setStringValue(provincia);
        }
    }
    
    /**
     * Sets (as xml) the "Provincia" element
     */
    public void xsetProvincia(org.apache.xmlbeans.XmlString provincia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROVINCIA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROVINCIA$0);
            }
            target.set(provincia);
        }
    }
}
