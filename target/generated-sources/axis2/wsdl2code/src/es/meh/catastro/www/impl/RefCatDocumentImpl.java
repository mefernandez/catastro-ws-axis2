/*
 * An XML document type.
 * Localname: RefCat
 * Namespace: http://www.catastro.meh.es/
 * Java type: es.meh.catastro.www.RefCatDocument
 *
 * Automatically generated - do not modify.
 */
package es.meh.catastro.www.impl;
/**
 * A document containing one RefCat(@http://www.catastro.meh.es/) element.
 *
 * This is a complex type.
 */
public class RefCatDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements es.meh.catastro.www.RefCatDocument
{
    private static final long serialVersionUID = 1L;
    
    public RefCatDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFCAT$0 = 
        new javax.xml.namespace.QName("http://www.catastro.meh.es/", "RefCat");
    
    
    /**
     * Gets the "RefCat" element
     */
    public java.lang.String getRefCat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFCAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RefCat" element
     */
    public org.apache.xmlbeans.XmlString xgetRefCat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFCAT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RefCat" element
     */
    public void setRefCat(java.lang.String refCat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFCAT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFCAT$0);
            }
            target.setStringValue(refCat);
        }
    }
    
    /**
     * Sets (as xml) the "RefCat" element
     */
    public void xsetRefCat(org.apache.xmlbeans.XmlString refCat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFCAT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFCAT$0);
            }
            target.set(refCat);
        }
    }
}
