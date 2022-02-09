/*
 * An XML document type.
 * Localname: TipoVia
 * Namespace: http://www.catastro.meh.es/
 * Java type: es.meh.catastro.www.TipoViaDocument
 *
 * Automatically generated - do not modify.
 */
package es.meh.catastro.www.impl;
/**
 * A document containing one TipoVia(@http://www.catastro.meh.es/) element.
 *
 * This is a complex type.
 */
public class TipoViaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements es.meh.catastro.www.TipoViaDocument
{
    private static final long serialVersionUID = 1L;
    
    public TipoViaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIPOVIA$0 = 
        new javax.xml.namespace.QName("http://www.catastro.meh.es/", "TipoVia");
    
    
    /**
     * Gets the "TipoVia" element
     */
    public java.lang.String getTipoVia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOVIA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TipoVia" element
     */
    public org.apache.xmlbeans.XmlString xgetTipoVia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPOVIA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TipoVia" element
     */
    public void setTipoVia(java.lang.String tipoVia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOVIA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPOVIA$0);
            }
            target.setStringValue(tipoVia);
        }
    }
    
    /**
     * Sets (as xml) the "TipoVia" element
     */
    public void xsetTipoVia(org.apache.xmlbeans.XmlString tipoVia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPOVIA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPOVIA$0);
            }
            target.set(tipoVia);
        }
    }
}
