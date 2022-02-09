/*
 * An XML document type.
 * Localname: Sigla
 * Namespace: http://www.catastro.meh.es/
 * Java type: es.meh.catastro.www.SiglaDocument
 *
 * Automatically generated - do not modify.
 */
package es.meh.catastro.www.impl;
/**
 * A document containing one Sigla(@http://www.catastro.meh.es/) element.
 *
 * This is a complex type.
 */
public class SiglaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements es.meh.catastro.www.SiglaDocument
{
    private static final long serialVersionUID = 1L;
    
    public SiglaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIGLA$0 = 
        new javax.xml.namespace.QName("http://www.catastro.meh.es/", "Sigla");
    
    
    /**
     * Gets the "Sigla" element
     */
    public java.lang.String getSigla()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGLA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Sigla" element
     */
    public org.apache.xmlbeans.XmlString xgetSigla()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGLA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Sigla" element
     */
    public void setSigla(java.lang.String sigla)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGLA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIGLA$0);
            }
            target.setStringValue(sigla);
        }
    }
    
    /**
     * Sets (as xml) the "Sigla" element
     */
    public void xsetSigla(org.apache.xmlbeans.XmlString sigla)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGLA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SIGLA$0);
            }
            target.set(sigla);
        }
    }
}
