/*
 * An XML document type.
 * Localname: Municipio
 * Namespace: http://www.catastro.meh.es/
 * Java type: es.meh.catastro.www.MunicipioDocument
 *
 * Automatically generated - do not modify.
 */
package es.meh.catastro.www.impl;
/**
 * A document containing one Municipio(@http://www.catastro.meh.es/) element.
 *
 * This is a complex type.
 */
public class MunicipioDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements es.meh.catastro.www.MunicipioDocument
{
    private static final long serialVersionUID = 1L;
    
    public MunicipioDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MUNICIPIO$0 = 
        new javax.xml.namespace.QName("http://www.catastro.meh.es/", "Municipio");
    
    
    /**
     * Gets the "Municipio" element
     */
    public java.lang.String getMunicipio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MUNICIPIO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Municipio" element
     */
    public org.apache.xmlbeans.XmlString xgetMunicipio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MUNICIPIO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Municipio" element
     */
    public void setMunicipio(java.lang.String municipio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MUNICIPIO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MUNICIPIO$0);
            }
            target.setStringValue(municipio);
        }
    }
    
    /**
     * Sets (as xml) the "Municipio" element
     */
    public void xsetMunicipio(org.apache.xmlbeans.XmlString municipio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MUNICIPIO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MUNICIPIO$0);
            }
            target.set(municipio);
        }
    }
}
