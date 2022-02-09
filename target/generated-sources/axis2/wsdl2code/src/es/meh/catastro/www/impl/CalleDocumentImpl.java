/*
 * An XML document type.
 * Localname: Calle
 * Namespace: http://www.catastro.meh.es/
 * Java type: es.meh.catastro.www.CalleDocument
 *
 * Automatically generated - do not modify.
 */
package es.meh.catastro.www.impl;
/**
 * A document containing one Calle(@http://www.catastro.meh.es/) element.
 *
 * This is a complex type.
 */
public class CalleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements es.meh.catastro.www.CalleDocument
{
    private static final long serialVersionUID = 1L;
    
    public CalleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALLE$0 = 
        new javax.xml.namespace.QName("http://www.catastro.meh.es/", "Calle");
    
    
    /**
     * Gets the "Calle" element
     */
    public java.lang.String getCalle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Calle" element
     */
    public org.apache.xmlbeans.XmlString xgetCalle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CALLE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Calle" element
     */
    public void setCalle(java.lang.String calle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CALLE$0);
            }
            target.setStringValue(calle);
        }
    }
    
    /**
     * Sets (as xml) the "Calle" element
     */
    public void xsetCalle(org.apache.xmlbeans.XmlString calle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CALLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CALLE$0);
            }
            target.set(calle);
        }
    }
}
