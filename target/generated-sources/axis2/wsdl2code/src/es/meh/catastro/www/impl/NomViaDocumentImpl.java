/*
 * An XML document type.
 * Localname: NomVia
 * Namespace: http://www.catastro.meh.es/
 * Java type: es.meh.catastro.www.NomViaDocument
 *
 * Automatically generated - do not modify.
 */
package es.meh.catastro.www.impl;
/**
 * A document containing one NomVia(@http://www.catastro.meh.es/) element.
 *
 * This is a complex type.
 */
public class NomViaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements es.meh.catastro.www.NomViaDocument
{
    private static final long serialVersionUID = 1L;
    
    public NomViaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOMVIA$0 = 
        new javax.xml.namespace.QName("http://www.catastro.meh.es/", "NomVia");
    
    
    /**
     * Gets the "NomVia" element
     */
    public java.lang.String getNomVia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMVIA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NomVia" element
     */
    public org.apache.xmlbeans.XmlString xgetNomVia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMVIA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NomVia" element
     */
    public void setNomVia(java.lang.String nomVia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMVIA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMVIA$0);
            }
            target.setStringValue(nomVia);
        }
    }
    
    /**
     * Sets (as xml) the "NomVia" element
     */
    public void xsetNomVia(org.apache.xmlbeans.XmlString nomVia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMVIA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMVIA$0);
            }
            target.set(nomVia);
        }
    }
}
