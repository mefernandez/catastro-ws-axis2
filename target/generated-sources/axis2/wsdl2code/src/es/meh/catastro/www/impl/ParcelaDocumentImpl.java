/*
 * An XML document type.
 * Localname: Parcela
 * Namespace: http://www.catastro.meh.es/
 * Java type: es.meh.catastro.www.ParcelaDocument
 *
 * Automatically generated - do not modify.
 */
package es.meh.catastro.www.impl;
/**
 * A document containing one Parcela(@http://www.catastro.meh.es/) element.
 *
 * This is a complex type.
 */
public class ParcelaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements es.meh.catastro.www.ParcelaDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParcelaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARCELA$0 = 
        new javax.xml.namespace.QName("http://www.catastro.meh.es/", "Parcela");
    
    
    /**
     * Gets the "Parcela" element
     */
    public java.lang.String getParcela()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARCELA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Parcela" element
     */
    public org.apache.xmlbeans.XmlString xgetParcela()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARCELA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Parcela" element
     */
    public void setParcela(java.lang.String parcela)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARCELA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARCELA$0);
            }
            target.setStringValue(parcela);
        }
    }
    
    /**
     * Sets (as xml) the "Parcela" element
     */
    public void xsetParcela(org.apache.xmlbeans.XmlString parcela)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARCELA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARCELA$0);
            }
            target.set(parcela);
        }
    }
}
