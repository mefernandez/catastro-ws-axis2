/*
 * An XML document type.
 * Localname: Bloque
 * Namespace: http://www.catastro.meh.es/
 * Java type: es.meh.catastro.www.BloqueDocument
 *
 * Automatically generated - do not modify.
 */
package es.meh.catastro.www.impl;
/**
 * A document containing one Bloque(@http://www.catastro.meh.es/) element.
 *
 * This is a complex type.
 */
public class BloqueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements es.meh.catastro.www.BloqueDocument
{
    private static final long serialVersionUID = 1L;
    
    public BloqueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLOQUE$0 = 
        new javax.xml.namespace.QName("http://www.catastro.meh.es/", "Bloque");
    
    
    /**
     * Gets the "Bloque" element
     */
    public java.lang.String getBloque()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLOQUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Bloque" element
     */
    public org.apache.xmlbeans.XmlString xgetBloque()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BLOQUE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Bloque" element
     */
    public void setBloque(java.lang.String bloque)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLOQUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BLOQUE$0);
            }
            target.setStringValue(bloque);
        }
    }
    
    /**
     * Sets (as xml) the "Bloque" element
     */
    public void xsetBloque(org.apache.xmlbeans.XmlString bloque)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BLOQUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BLOQUE$0);
            }
            target.set(bloque);
        }
    }
}
